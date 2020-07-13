#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 

#define SIMBOLOS_PALAVRA 128

struct automato
{
    struct node *array;
    struct node *inicial;
    short numEstados;
};

struct node
{
    struct node *array;
    short estado;
    bool final;
    
};

struct node *node_new(short estado, short dimensao);
struct automato *novo_automato(short numEstados);