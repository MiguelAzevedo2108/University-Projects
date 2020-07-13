#include <stdio.h>
#include <stdlib.h>

#define N 1000000
#define ZERO 0

struct node
{
	int value;
	struct node *next;
};

struct linkedList
{
    struct node *head;
};

struct node *node_new(int value);
struct linkedList *linkedList_new();
int list_insert(struct linkedList *list, int value);
void list_print(struct linkedList *list);
void list_destroy(struct linkedList *list);
int list_find(struct linkedList *list, int value);
int list_remove(struct linkedList *list, int value);
int list_length(struct linkedList *list);
struct node *list_nth(struct linkedList *list, int n);


