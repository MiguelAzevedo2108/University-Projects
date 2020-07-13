#include "LinkedLists.h"

/*
Inicializa todas as posicoes do array de pointers a NULL
*/

void inicializarArray(struct linkedList *array[])
{
    for (int i = 0; i < N; i++)
    {
        array[i] = NULL;
    }
}

/*
(i,j)
Pesquisa na posicao i do array
Caso ja exista ligacoes com (i), obtem essa linkedList, e irá printar o i de seguida com o tamanho da lista e os elementos da mesma
Caso nao existe, printa (i) e diz que nao tem ligacoes 0
*/
void interroga_existencia(struct linkedList *array[],int firstElement)
{
    if (array[firstElement] == NULL)
    {
        printf("%d %d\n",firstElement,ZERO);
    }
    else
    {
        struct linkedList *list = array[firstElement];
                
        printf("%d %d ",firstElement,list_length(list));
        list_print(list);
    }
}

/*
(i,j)
Pesquisa na posicao i do array
Caso ja exista ligacoes com (i), obtem essa linkedList, e irá adicionar a ligacao com o secondElement (j)
Caso nao existe, cria uma linkedList e coloca na posicao (i), e adiciona a primeira ligacao (j)
*/
void adicionaPar(struct linkedList *array[], int firstElement, int secondElement)
{
    if (array[firstElement]!=NULL)
    {
        struct linkedList *list = array[firstElement];
                
        if (list_find(list,secondElement) == -1)
        {
            list_insert(list,secondElement);
        }
    }
    else
    {
        struct linkedList *list = linkedList_new();
        list_insert(list,secondElement);

        array[firstElement] = list;
    }
}

/*
(i,j)
Pesquisa na posicao i do array
Obtem essa linkedList, e irá remover a ligacao com o secondElement (j)
*/

void eliminaPar(struct linkedList *array[], int firstElement, int secondElement)
{
    if (array[firstElement] != NULL)
    {
        struct linkedList *list = array[firstElement];

        if (list_find(list,secondElement) != -1)
        {
            if (list_length(list) == 1)
            {
                list_remove(list,secondElement);
                array[firstElement] = NULL;
                free(list);
            }
            else
            {
                list_remove(list,secondElement);
            }
        }
    }
}

int main()
{
    char simbolo;

    struct linkedList *array[N];

    inicializarArray(array);

    while (scanf("%c",&simbolo)!=EOF)
    {
        if (simbolo == 'q') // exist as first element ? pesquisar no array, e printar LL
        {
            int firstElement;
            scanf(" %d",&firstElement);
            interroga_existencia(array,firstElement);
        }
        else if (simbolo == 'p')        //adicionar ao array, e sua respetiva LL
        {
            int firstElement, secondElement;
            scanf(" %d %d",&firstElement,&secondElement);
            adicionaPar(array,firstElement,secondElement);
        }
        else if (simbolo == 'x')       //ir ao array, eliminar da LL
        {
            int firstElement, secondElement;
            scanf(" %d %d",&firstElement,&secondElement);
            eliminaPar(array,firstElement,secondElement);
        }
    }
    return 0;
}