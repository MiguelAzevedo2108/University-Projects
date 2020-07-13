#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "stack.h"

struct stack *stack_new(int size)
{
    struct stack *stack = malloc(sizeof(struct stack));
    
    stack->pos = -1;
    stack->size = size;
    stack->array = (int*)malloc(stack->size * sizeof(int));

    return stack;

}

int isEmpty(struct stack *stack)
{
    if (stack->pos == -1)
    {
        return 1;
    }
    return -1;
}

int isFull(struct stack *stack)
{
    if (stack->pos == stack->size-1)
    {
        return 1;
    }
    return -1;
}

void push(struct stack *stack, int valor)
{
    if(isFull(stack)==-1)
    {
        stack->array[++stack->pos] = valor;
    }
}

int top (struct stack *stack)
{
    if (isEmpty(stack) == 1)
    {
        return -1;
    }
    return stack->array[stack->pos];
}

int pop(struct stack *stack)
{
    if (isEmpty(stack) == 1)
    {
        return -1;
    }
    return stack->array[stack->pos--];
}