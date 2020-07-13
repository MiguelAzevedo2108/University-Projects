#include <stdio.h>

#include "trie.h"

int main(void)
{
  char operacao;
  
  struct trie *trie = trie_new();
  //printf("ola\n");

  while (scanf("%c",&operacao)!=EOF)
  {
    if (operacao == 'q')    //num palavras da arvore
    {
      printf("palavras conhecidas: %d\n",trie_count(trie));
    }
    else
    {
      char palavra[PALAVRA_SIZE+1];
      
      if (operacao == 'i') //insert
      {
        scanf(" %s",palavra);
        trie_insert(trie,palavra);
      }
      else if (operacao == 'r') //remove
      {
        scanf(" %s",palavra);
        trie_delete(trie,palavra);
      }
      else if (operacao == 'e') //find
      {
        scanf(" %s",palavra);
        if (!trie_find(trie,palavra))
        {
          printf("\"%s\" desconhecida\n",palavra);
        }
        else
        {
          printf("\"%s\" conhecida\n",palavra);
        }
        
      }
      else if (operacao == 'c') //print sufixo da palavra
      {
        scanf(" %s",palavra);
        printf("palavras com prefixo \"%s\":\n",palavra);
        trie_print_completions(trie,palavra);
      }
    }
  }
  return 0;
}
