#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "stack.h"

int avalia (char str)
{
    if (str == '+')
    {
        return 1;
    }
    else if (str == '-')
    {
        return 1;
    }
    else if (str == '*')
    {
        return 1;
    }
    else if (str == '/')
    {
        return 1;
    }
    else if (str == '~')
    {
        return 1;
    }
    return 0;
}

int main()
{   
    char s[SIZE+1] ;
    int flag = 0;

    while(scanf("%s",s)!= EOF)
    {
        struct stack *stack = stack_new(SIZE);
        flag = 0;

        for (int i = 0; i < strlen(s); i++)
        {
            if (avalia(s[i])==0)
            {
                int valor = s[i] - '0';
                push(stack,valor);
            }
            else if(s[i] == '+')
            {
                int b = pop(stack);
                int a = pop(stack);
                int c = a + b;
                push (stack,c);
            }
            else if(s[i] == '-')
            {
                int b = pop(stack);
                int a = pop(stack);
                int c = a - b;
                push (stack,c);
            }
            else if (s[i] == '~')
            {
                int b = pop(stack);
                int c = -b;
                push(stack,c);
            }
            else if (s[i] == '*')
            {
                int b = pop(stack);
                int a = pop(stack);
                int c = a * b;
                push (stack,c);
            }
            else if (s[i] == '/')
            {
                int b = pop(stack);
                int a = pop(stack);

                if (b == 0)
                {
                    flag = -1;
                    printf("divisao por 0\n");
                    break;
                }
                else{
                    int c = a / b;
                    push (stack,c);
                }
           
            }
        }
        if (flag != -1)
            printf("%d\n",stack->array[stack->pos]);
    }
    return 0;
}

