#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "queue.c"
#include "instrucoes.c"

#define SIZEMEM 300
#define MAX 10
#define QUANTUM 4

queue *NEW;
queue *READY;
queue *RUN;
queue *BLOCKED;
queue *EXIT;

pcb *pcb_array[10];

void init_estados()
{
	NEW=queue_new(5,"NEW");
	READY=queue_new(4,"READY");
	RUN=queue_new(1,"RUN");
	BLOCKED=queue_new(5,"BLOCKED");
	EXIT=queue_new(5,"EXIT");
}

int *inicioMEM()
{
	int *array = malloc(sizeof(int)*SIZEMEM);

	for (int i = 0; i < 10; ++i)
	{
		array[i] = -2;
	}
	
	for (int i = 10; i < SIZEMEM; ++i)
	{
		array[i] = -1;
	}

	return array;
}

void print_MEM(int *array)
{
	for(int i=0;i<SIZEMEM;i++)
	{
		printf("%d ",array[i]);
	}
	printf("\n");
}

void go_to_new(pcb *x)
{
	x->estado=NEW;
	enqueue(NEW,x);
}

//NEW-->READY
void admit(void)
{
	if(!isfull(READY)&&!isempty(NEW))
	{
		pcb* temp=dequeue(NEW);
		temp->estado=READY;
		enqueue(READY,temp);
	}
}

//READY-->RUN
void dispatch(void)
{
	if(!isfull(RUN)&&!isempty(READY))
	{
		pcb *temp=dequeue(READY);
		temp->estado=RUN;
		enqueue(RUN,temp);
	}
}

//RUN-->READY
void time_out(void)
{
	if(!isfull(READY)&&!isempty(RUN))
	{
		pcb *temp=dequeue(RUN);
		temp->estado=READY;
		enqueue(READY,temp);
	}
}

//RUN-->BLOCKED
void event_wait(void)
{
	if(!isfull(BLOCKED)&&!isempty(RUN))
	{
		pcb *temp=dequeue(RUN);
		temp->estado=BLOCKED;
		enqueue(BLOCKED,temp);
	}
}

//BLOCKED-->READY
void event_occurs(void)
{
	if(!isfull(READY)&&!isempty(BLOCKED))
	{
		pcb *temp=dequeue(BLOCKED);
		temp->estado=READY;
		enqueue(READY,temp);
	}
}

//RUN-->EXIT
void release(void)
{
	pcb *temp=dequeue(RUN);
	temp->estado=EXIT;
	enqueue(EXIT,temp);
}

void libertar_mem(int *MEM)
{
	pcb *temp=dequeue(EXIT);
	temp->estado=NULL;

	int mem_pos=temp->localizacao;
	int nr_ins=temp->nr_ins;

	for(int i=mem_pos;i<mem_pos+nr_ins;i++)
	{
		MEM[i]=-1;
	}
}

void to_MEM(int *MEM,int *buffer, int nr_ins, int mem_pos)
{
	for(int i=0;i<nr_ins;i++)
	{
		MEM[i+mem_pos]=buffer[i];
	}
}

void print_estados(void)
{
	printf("<-----NEW----->\n");
	print_queue(NEW);
	printf("<-----READY----->\n");
	print_queue(READY);
	printf("<-----RUN----->\n");
	print_queue(RUN);
	printf("<-----BLOCKED----->\n");
	print_queue(BLOCKED);
	printf("<-----EXIT----->\n");
	print_queue(EXIT);
}

void print_instante(int nr_processos, int instante)
{
	printf("%2d |",instante-1);
	for(int i=0;i<nr_processos;i++)
	{
		if(pcb_array[i]->estado!=NULL)
		{
			printf("%10s|",pcb_array[i]->estado->name);
		}
		else{printf("          |");}
	}

	printf("\n");
}

int running(int *MEM,int *run_counter)
{
	pcb *processo = front(RUN);

	int x = processo->localizacao + processo->programCounter;

	int instrucao = MEM[x];

	//printf("instrução:%d\n",instrucao);

	int X1=MEM[x+1];
	int X2=MEM[x+2];

	if(instrucao==0)
	{
		instrucao_0(processo,MEM,X1,X2);
	}

	if(instrucao==1)
	{
		instrucao_1(processo,MEM,X1,X2);
	}

	if(instrucao==2)
	{
		instrucao_2(processo,MEM,X1);
	}

	if(instrucao==3)
	{
		instrucao_3(processo,MEM,X1);
	}

	if(instrucao==4)
	{
		instrucao_4(processo,X1);
	}

	if(instrucao==5)
	{
		instrucao_5(processo,X1);
	}

	if(instrucao==6)
	{
		instrucao_6(processo,X1,X2);
	}

	if(instrucao==7)
	{
		instrucao_7(processo,X1);
	}

	if(instrucao==8)
	{
		instrucao_8(MEM,processo,X1);
		event_wait();
		*run_counter=-1;
	}

	if(instrucao==9)
	{
		instrucao_9(MEM,processo,X1);
		event_wait();
		*run_counter=-1;
	}

	if(instrucao==10)
	{
		instrucao_10(processo,X1);
	}

	if(instrucao==11)
	{
		instrucao_11(processo);
		release();
	}

	if(processo->nr_ins==processo->programCounter)
	{
		return 0;
	}
	else
	{
			return 1;

	}
}

void cicle(int *MEM, int *instante,int *blocked_counter,int *run_counter)
{
	//printf("run_counter:%d\n",*run_counter);
	//liberta processos no exit

	if(!isempty(EXIT))
	{
		libertar_mem(MEM);
	}

	//lida com os processos no blocked
	if(*blocked_counter==2)
	{
		event_occurs();
		*blocked_counter=0;
	}

	else if(!isempty(BLOCKED))
	{
		*blocked_counter=*blocked_counter+1;
	}

	//lida com os processos no RUN
	if(*run_counter==QUANTUM-1)
	{
		int x = running(MEM,run_counter);
		
		if(x==0)
		{
			release();
		}

		*run_counter=0;
		time_out();
	}

	else if(!isempty(RUN))
	{
		int x = running(MEM,run_counter);
		
		if(x==0)
		{
			*run_counter=0;
			release();	
		}
		else
		{
			*run_counter=*run_counter+1;
		}
	}

	admit();
	dispatch();
	*instante=*instante+1;
}

int *read_process(char *line,size_t len,FILE *file,int *entry_int,int *nr_ins)
{
	int c,len1;
	int *buffer=malloc(sizeof(int)*300);

	//nao existe mais processos
	if(feof(file))
	{
		return NULL;
	}

	getline(&line,&len,file);

	//le o instante
	sscanf(line,"%d%n",entry_int,&len1);
	line=line+len1;

	//le as instrucoes
	while(sscanf(line,"%d%n",&c,&len1)==1)
	{
		line=line+len1;
		buffer[*nr_ins]=c;
		*nr_ins=*nr_ins+1;
	}

	return buffer;
}

int main(void)
{
	char *line=NULL;//linha a ser lida
	int *buffer;//buffer para ler instruções dos processos
	int nr_processo=0;//nr de processos
	int nr_ins=0;//numero de instruções
	int instante=0;
	int blocked_counter=0;
	int run_counter=0;
	int *MEM=inicioMEM();
	init_estados();
	size_t len=0;//cenas da função getline
	
	int mem_pos=10;//inteiro com posicao em memoria 

	pcb *temp;

	FILE *file;
	file = fopen("ficheiro", "r+");
	
	if (file)
	{
		while (!feof(file))
		{
			int entry_int=0;//instante de entrada
			nr_ins=0;//numero de instrucoes

			//buffer para o processo
			buffer=read_process(line,len,file,&entry_int,&nr_ins);

			//pcb do processo
			temp=pcb_new(nr_processo,NULL,mem_pos,nr_ins);
			pcb_array[nr_processo]=temp;

			//ciclo enquanto houver processos para ler
			while(!feof(file))
			{
				if(entry_int==instante)
				{
					nr_processo++;

					//mete as instrucoes na memoria
					to_MEM(MEM,buffer,nr_ins,mem_pos);
					mem_pos=mem_pos+nr_ins;
					free(buffer);

					//ciclo
					cicle(MEM,&instante,&blocked_counter,&run_counter);
					go_to_new(temp);
					print_instante(nr_processo,instante);

					break;
				}
				cicle(MEM,&instante,&blocked_counter,&run_counter);
				print_instante(nr_processo,instante);
			}
	    }
	    //ciclo para quando nao houver mais processos
	    while(true)
	    {
	    	cicle(MEM,&instante,&blocked_counter,&run_counter);
	    	if(isempty(NEW)&& isempty(READY)&& isempty(RUN)&& isempty(BLOCKED)&& isempty(EXIT))
	    	{
	    		break;
	    	}
	    	print_instante(nr_processo,instante);
	    }
	}
	
	print_MEM(MEM);
	return 0;
}











