#include "estruturas.h"

int main()
{
    short n_automatos;            //numero de automatos
    scanf("%hd",&n_automatos);   //numero de automatos
    
    struct automato *array_automatos[n_automatos];

    for (short i = 0; i < n_automatos; i++)
    {   
        short n_estados, n_simbolos, estado_inicial;
        scanf("%hd %hd %hd", &n_estados, &n_simbolos, &estado_inicial); //insere estados, n_letras, estadoInicial
        
        struct automato *automato = novo_automato(n_estados);       

        struct node *array_estados[n_estados];
    
        for (short i = 0; i < n_estados; i++)     //Q S Qi
        {
            struct node *node = node_new(i,n_simbolos);  //criacao de estados
            array_estados[i] = node;                     
        }
        automato->inicial = array_estados[estado_inicial];  //estado inicial de cada estado

        short quantidade_estados_finais;
        scanf("%hd",&quantidade_estados_finais);

        for (short i = 0; i < quantidade_estados_finais; i++) //estados finais
        {
            short n;
            scanf(" %hd",&n);
            array_estados[n]->final = true;
        }

        for (short i = 0; i < n_estados; i++)                 //criacao das ligacoes
        {
            for (short j = 0; j < n_simbolos; j++)
            {
                short ligacao;
                scanf("%hd",&ligacao);
                array_estados[i]->array[j] = *array_estados[ligacao];
            }
        }
        automato->array = *array_estados;
        automato->numEstados = n_estados;
        array_automatos[i] = automato;
    }
    
    char letra;
    short identificador;
    
    while (scanf("%hd ",&identificador)!=EOF)
    {
        char *palavra = malloc(sizeof(char )*SIMBOLOS_PALAVRA+3);

        short c = 0;
        struct automato *temp1 = array_automatos[identificador];
        struct node *temp2 = temp1->inicial;
        palavra[c] = '"';

        while (scanf("%c",&letra) && letra != '$')
        {   
            c++;
            short pos = (short)letra -97;
            temp2 = &temp2->array[pos];
            palavra[c] = letra;
        }
        c++;
        palavra[c] = '"';

        if (temp2->final == true)
        {
            printf("%s aceite\n",palavra);
        }
        else
        {
            printf("%s rejeitada\n",palavra);
        }
        palavra = NULL;
        free(palavra);
    }

    return 0;
}