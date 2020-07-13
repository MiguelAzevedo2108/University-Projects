#include <stdio.h>
#include <stdlib.h>
#include <stdio.h>
//#include "instrucoes.h"
#include "queue.c"

void instrucao_0(pcb *processo, int *MEM, int X1, int X2){
	MEM[X1-1]=MEM[X2-1];
	processo->programCounter=processo->programCounter+3;
}

void instrucao_1(pcb *processo, int *MEM, int X, int N){
	MEM[X-1]=N;
	processo->programCounter=processo->programCounter+3;
}

void instrucao_2(pcb *processo, int *MEM, int X){
	MEM[X-1]=MEM[X-1]+1;
	processo->programCounter=processo->programCounter+3;
}

void instrucao_3(pcb *processo, int *MEM, int X){
	MEM[X-1]=MEM[X-1]-1;
	processo->programCounter=processo->programCounter+3;
}

void instrucao_4(pcb *processo, int N){
	processo->programCounter=processo->programCounter-(N*3);
	//processo->programCounter=processo->programCounter+3;
}

void instrucao_5(pcb *processo, int N){
	processo->programCounter=processo->programCounter+(N*3);
}

void instrucao_6(pcb *processo,int *MEM, int X, int N){
	if(MEM[X-1]==0){
		processo->programCounter=processo->programCounter+(N*3);
	}
	else{
		processo->programCounter=processo->programCounter+3;
	}
}
//fork()

pcb * instrucao_7(int *MEM, pcb *processo, int X,int *nr_processo){
	processo->programCounter=processo->programCounter+3;
	pcb *child=pcb_new(*nr_processo,NULL,0,processo->nr_ins);
	*nr_processo=*nr_processo+1;
	if(processo->parent_id==-1){
		MEM[X]=child->id;
	}
	else{
		MEM[X]=0;
	}
	return child;
}

void instrucao_8(int *MEM,pcb *processo, int X){
	FILE *f;
	f = fopen("disk.bin","wb");
	int i=MEM[X];
	fseek(f,sizeof(int)*X,SEEK_SET);
	fwrite(&i,sizeof(int),1,f);
	processo->programCounter=processo->programCounter+3;
}

void instrucao_9(int *MEM, pcb *processo, int X){
	FILE *f;
	f = fopen("disk.bin","rb");
	fseek(f,sizeof(int)*X,SEEK_SET);
	fread(&MEM[X],sizeof(int),1,f);
	processo->programCounter=processo->programCounter+3;
}

void instrucao_10(int *MEM,pcb *processo, int X){
	processo->programCounter=processo->programCounter+3;
	printf("|%d",MEM[X-1]);
}

void instrucao_11(pcb *processo){
	//processo->programCounter=processo->programCounter+3;
}