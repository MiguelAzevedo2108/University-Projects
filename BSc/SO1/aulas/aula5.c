#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define QUEUE_SIZE 50

struct pcb 
{
	int id;
	int programCounter;
	int chega;
	int tempo_left;

};

struct pcb *pcb_new(int id, int chegada, int tempo_left)
{
	struct pcb *new = malloc(sizeof(struct pcb));

	new->id = id;
	new->chega = chega;
	new->tempo_left = tempo_left;
	new->programCounter = 0;

	return new;
};


struct Queue
{
	int header;
	int footer;
	int size;
	struct pcb *array[QUEUE_SIZE];

};


struct Queue *QUEUE_new()
{
	struct Queue *novo = malloc(sizeof(struct Queue));
	novo->header = 0;
	novo->footer = 0;
	novo->size = 0;

	return novo;
};



void enqueue(struct Queue *fila, struct pcb *process)
{
	fila->array[fila->footer]=process;
	fila->footer++;
	fila->size++;

	if (fila->footer>QUEUE_SIZE)
	{
		fila->footer = 0;
	}
}


struct pcb *dequeue(struct Queue *fila)
{
	fila->header++;
	fila->size--;

	if (fila->header>QUEUE_SIZE)
	{
		fila->header = 0;
	}

	return fila->array[fila->header-1];
}

struct Queue *start(struct Queue *fila, FILE *ficheiro)
{
	char *linha =NULL;
	size_t len = 0;
	ssize_t read;
	
	
	
	ficheiro = fopen(ficheiro,"r+");
	
	if (ficheiro==NULL)
	{
		printf("ficheiro nao encontrado\n");
	}
	else
	{
		while((read = getline(&linha,&len,ficheiro))!=-1)
		{	
			//criar processos
		}
		fclose(ficheiro);
	}
}







int main(void)
{
	struct Queue *new = QUEUE_new();
	struct Queue *ready = QUEUE_new();
	struct Queue *block = QUEUE_new();
	struct pcb *run = pcb_new();
	struct pcb *exit = _new();





}















