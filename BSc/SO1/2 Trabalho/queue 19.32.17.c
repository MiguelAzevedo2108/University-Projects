#include <stdio.h>
#include <stdlib.h>
#include <stdio.h>
#include "queue.h"


pcb *pcb_new(int id, queue *estado, int localizacao, int nr_ins)
{
	struct pcb *new = malloc(sizeof(struct pcb));

	new->id = id;
	new->programCounter = 0;
	new->estado = estado;
	new->localizacao=localizacao;
	new->nr_ins=nr_ins;
	new->blocked_counter=0;
	new->parent_id=-1;
	return new;
}

queue *queue_new(int maxelements,char *name){
	queue *q=malloc(sizeof(queue));
	strcpy(q->name,name);
	q->capacity=maxelements;
	q->size=0;
	q->front=0;
	q->rear=maxelements-1;
	q->array = malloc(sizeof(pcb)*maxelements);
	return q;
}
void print_queue(queue *q){
	if(isempty(q)){
		printf("Vazio\n");
		return;
	}
	int front,rear;
	front=q->front;
	rear=q->rear;
	for(int i=front;i!=rear;i++){
		if(i==q->capacity){
			i=-1;
			continue;
		}
		printf("id:%d\n",q->array[i]->id);
	}
	printf("id:%d\n",q->array[rear]->id);
}

bool isfull(queue *q){
	return (q->size==q->capacity);
}

bool isempty(queue *q){
	return (q->size==0);
}

void enqueue(queue *q, pcb *x){
	if(isfull(q)){return;}
	//atualiza o estado do pcb
	x->estado=q;
	q->rear=(q->rear + 1)%q->capacity;
	q->array[q->rear]=x;
	q->size=q->size + 1;
}
 pcb *dequeue(queue *q){
 	if(isempty(q)){return NULL;}
 	pcb *x=q->array[q->front];
 	q->front=(q->front + 1)%q->capacity;
 	q->size=q->size-1;
 	return x;
 }
 pcb *front(queue *q){
 	if(isempty(q)){return NULL;}
 	return q->array[q->front];
 }
