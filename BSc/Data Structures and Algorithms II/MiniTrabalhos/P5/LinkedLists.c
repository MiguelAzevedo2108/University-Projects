#include "LinkedLists.h"

struct node *node_new(int value)
{
	struct node *node = malloc(sizeof(struct node));

	node->value = value;
	node->next = NULL;

	return node;
}

struct linkedList *linkedList_new()
{
    struct linkedList *list = malloc(sizeof(struct linkedList));

    list->head = NULL;
    
    return list;
}

int list_insert(struct linkedList *list, int value)
{
    struct node *node = list->head;

    if (node == NULL)
    {
        list->head = node_new(value);
        return 1;
    }
    else
    {
        while (node->next!=NULL)
        {
            node = node->next;
        }
        struct node *node1 = node_new(value);
        node->next = node1;
        return 1;
    }
    return 0;
}

void list_print(struct linkedList *list)
{
    struct node *node = list->head;

    if (node != NULL)
    {
        while(node->next != NULL)
        {
            printf("%d ",node->value);
            node = node->next;
        }
        printf("%d\n",node->value);
    }
}
    
void list_destroy(struct linkedList *list)
{
    struct node *temp = list->head;

    while (list->head->next!=NULL)
    {
        temp = list->head;
        list->head = list->head->next;
        free(temp);
    }
    list->head = NULL;
}

int list_empty(struct linkedList *list)
{
    struct node *node = list->head;

    if (node == NULL)
    {
        return 1;
    }
    return 0;
}

int list_find(struct linkedList *list, int value)
{
    struct node *node = list->head;

    if (node == NULL)
    {
        return -1;
    }
    else
    {
        int counter = 0;
        
        while (node!=NULL)
        {
            if (node->value == value)
            {
                return counter;
            }
            counter++;
            node = node->next;
        }
        return -1;
    }   
}

int list_remove(struct linkedList *list, int value)
{
    struct node *node = list->head;

    if (node->value == value)
    {
        list->head = node->next;
        free(node);
        return 1;
    }
    else
    {
        while (node->next!= NULL)
        {
            if (node->next->value == value)
            {
                struct node *temp = node->next;
                node->next = node->next->next;
                free(temp);
                return 1;
            }
            node = node->next; 
        }
        return 0;
    }    
}

int list_length(struct linkedList *list)
{
    struct node *node = list->head;
    int counter = 0;
    
    while (node!=NULL)
    {
        counter++;
        node = node->next;
    }
    return counter;
}

struct node *list_nth(struct linkedList *list, int n)
{
    struct node *node = list->head;
    
    for (int i = 0; i < n; i++)
    {
        node = node->next;
    }
    return node;
    
}
