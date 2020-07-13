#include <stdbool.h>

typedef struct pcb 
{
	int id;
	int programCounter;
	queue *estado;
	int localizacao;
	int nr_ins;//numeor de instruções
}pcb;


typedef struct queue{
	char name[10];
	int capacity;//maximo de elementos na queue
	int size;//ocupacao
	int front;
	int rear;
	pcb **array;
}queue;


queue *queue_new(int maxelements,char *name);

void print_queue(queue *q);

bool isfull(queue *q);

bool isempty(queue *q);

void enqueue(queue *q,pcb *x);


pcb *dequeue(queue *q);
pcb *pcb_new(int id, queue *estado, int localizacao,int nr_ins);
