#include <stdio.h>
#include <stdlib.h>
#define SIZE 997


typedef enum tipos{
  int_,
  func_,
  flt_,
  char_,
  string_, 
  void_,
  bool_,
}tipos;

typedef struct elementos
{
  int tam;
  char *nome;
  tipos tipo;
  tipos output;

}elementos;

typedef struct hashTable{ 
  int size;
  struct hashTable *antiga;
  struct hashTable *nova;
  elementos lista[SIZE];
}hashTable;



hashTable *newHashtable()
{
  hashTable *tabela = malloc(sizeof(hashTable));
  tabela->size =0;
  int i;
  for(i = 0; i < SIZE; i++)
    tabela->lista[i] = NULL; 

  return tabela;
}

int hash(char word[], int size)
{
    int c;
    int h = 0;
    int i = 0;

    for (int i = 0; word[i]!=0; ++i)
    {
      h += word[i];
    }
    if(size != 0)
      c = h % SIZE;
    else
      c = 0;
  return c;
}

int reHash(int hash){
  hash++;
  return hash;
}


void escopo_novo(hashTable *scope_old)
{
  int i;

  hashTable *escopo = newHashtable();
  escopo->next = NULL; 
  escopo->old = scope_old;  
  escopo->next = escopo; 
}


void insereHashTable(hashTable *hash, char *nome, tipos tipo, tipos saida){
  elementos *elemento = malloc(sizeof(elementos));
  elemento->nome= nome;
  elemento->tipo =tipo; 
  elemento->saida = saida;

  int x = hash(nome,hash->size);
  while{
    if(hashTable->elemento[x]!=NULL){
      x = rehash(x);
    }else{
      hashTable->elemento[x]= elemento;
      break;
    }
  }
}

elementos find(hashTable *hash, char *nome){

  int place = hashTable(nome, hash->size);

  for (int i = place; i < SIZE; ++i)
  {
    if (!srtcmp(nome, hash->elementos[place]))
    {
      place = rehash(place);
    }
    else
    {
      return hash->elementos[place];
    }
  }
  return NULL;
}

void limpaHashTable(hashTable *hash){
  free(hash);
}

int main(){
  hashTable *hash = newHashtable();
  insereHashTable(hash, string_, int_, NULL);
}
