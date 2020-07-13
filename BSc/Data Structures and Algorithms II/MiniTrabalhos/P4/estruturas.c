#include "estruturas.h"

struct node *node_new(short estado, short dimensao)
{
    struct node *node = malloc(sizeof(struct node));

    node->estado = estado;
    node->final = false;
    node->array = malloc(dimensao * sizeof(*node));

    return node;
}

struct automato *novo_automato(short numEstados)
{
    struct automato *automato = malloc(sizeof(struct automato));
    automato->array = malloc(numEstados * sizeof(*automato));
    automato->numEstados = numEstados;

    return automato;
}
