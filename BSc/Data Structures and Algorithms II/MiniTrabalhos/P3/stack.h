#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define SIZE 1000


struct stack 
{
    int pos;
    int size;
    int *array;
};

struct stack *stack_new(int size);
int isEmpty(struct stack *stack);
int isFull(struct stack *stack);
void push(struct stack *stack, int valor);
int top (struct stack *stack);
int pop(struct stack *stack);
