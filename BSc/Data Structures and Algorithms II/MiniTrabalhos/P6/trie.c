/* trie implementation, with arrays */

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

#include "trie.h"

#define ALPHABET_MIN 'a'
#define ALPHABET_MAX 'z'
#define ALPHABET_SIZE (ALPHABET_MAX - ALPHABET_MIN + 1)

#define POS(c)  ((c) - ALPHABET_MIN)	// character position in alphabet
#define CHAR(n) ((n) + ALPHABET_MIN)	// n-th alphabet character


/* trie node */
struct node 
{
  struct node *child[ALPHABET_SIZE];	// children
  bool        word;			// end-of-word mark
};

/* trie */
struct trie 
{
  struct node *root;
};


/*
  Allocates and returns a new trie node.
*/
static struct node *node_new(void)
{
  struct node *node = malloc(sizeof(*node));

  if (node != NULL)
  {
    node->word = false;

    for (int i = 0; i < ALPHABET_SIZE; ++i)
      node->child[i] = NULL;
  }

  return node;
}

struct trie *trie_new(void)
{
  struct trie *trie = malloc(sizeof(struct trie));

  if (trie != NULL)
    trie->root = NULL;

  return trie;
}


/* Frees a trie NODE. */
static void node_free(struct node *node)
{
  free(node);
}


/* Destroys the sub-trie with root NODE. */
static void node_destroy(struct node *node)
{
  if (node == NULL)
    return;

  for (int i = 0; i < ALPHABET_SIZE; ++i)
    node_destroy(node->child[i]);

  node_free(node);
}


/*
  Creates and returns a new, empty trie.
*/

/* Destroys trie T, freeing the memory it occupies. */
void trie_destroy(struct trie *t)
{
  node_destroy(t->root);

  free(t);
}


/* Checks whether trie T is empty. */
bool trie_empty(struct trie *t)
{
  return t->root == NULL;
}


/*
  Inserts word P into trie T.

  Returns true if the word was successfully inserted (or was already
  in the trie), false otherwise.
*/
bool trie_insert(struct trie *t, char p[])
{
  struct node *n;
  int i = 0;

  if (t->root == NULL)
    t->root = node_new();	// new, empty root node

  if (t->root == NULL)
    return false;

  n = t->root;

  // follow the word down the trie as long as possible,
  // taking care not to go to a nonexisting node
  while (p[i] != '\0' && n->child[POS(p[i])] != NULL)
    {
      n = n->child[POS(p[i])];
      i++;
    }

  // insert the new suffix into the trie
  while (p[i] != '\0')
    {
      n->child[POS(p[i])] = node_new();

      if (n->child[POS(p[i])] == NULL)
	      return false;

      n = n->child[POS(p[i])];

      i++;
    }

  n->word = true;

  return true;
}

/*
   Searches for word P in trie T.

   Returns true if it finds it, false otherwise.
*/

bool trie_find(struct trie *t, char p[])
{
  struct node *n;
  int i = 0;

  n = t->root;

  while(n != NULL && p[i] != '\0')
  {
    n = n->child[POS(p[i])];
    i++;
  }
  return n!=NULL && n->word;
}

/* Counts and returns the number of words in trie T. */

int trie_count_rec(struct node *t,int i)
{
  int counter = 0;
  struct node *node = t;
  
  if(node->word)
  {
    counter++;
  }
  /*for (int i = 0; i < ALPHABET_SIZE; i++)
  {*/
    if(node->child[i] != NULL )
    {
      counter = counter + trie_count_rec(node->child[i],i+1);
    }
  //}
  return counter;
}

int trie_count(struct trie *t)
{
  return trie_count_rec(t->root,0);
}

void auxiliar(struct node *node, char prefixo[], int pos_atual, char palavra[])
{
  if (node->word)
  {
    for (int i = 0; i < pos_atual; i++)
    {
      printf("%c",palavra[i]);
    }
    printf("\n");
  }
  
  for(int i = 0; i < ALPHABET_SIZE; i++)
  {
    if(node->child[i] != NULL)
    {
      palavra[pos_atual] = CHAR(i);
      auxiliar(node->child[i], prefixo, pos_atual+1,palavra);
    }
  }
}

void trie_print_completions(struct trie *t, char prefixo[])
{
  struct node *node = t->root;
  int i = 0;
  char c[PALAVRA_SIZE+1] = "";

  while (prefixo[i] != '\0' && node->child[POS(prefixo[i])] != NULL)
  {
    node = node->child[POS(prefixo[i])];
    c[i] = prefixo[i];
    i++;
  }
  if (strcmp(prefixo,c) == 0)
  {
    auxiliar(node,prefixo,i,c);
  }
  
}

/* Removes word P from trie T. */

void trie_delete(struct trie *t, char p[])
{
  /*5. Comece por fazer uma versao que so' apaga a marca de fim de
     palavra. Posteriormente, melhore-a para que apague os nos ja'
     nao usados.*/

    struct node *node;
    int i = 0;

    node = t->root;

    while (node != NULL && p[i] != '\0')
    {
      node = node->child[POS(p[i])];
      i++;
    }
    
    if(node != NULL && node->word == true)
    {
      node->word = false;
    
      bool childless = true;
      do
      {
        i--;
        int j = 0;

        while (p[j] != '\0' && childless)
        {
          if (node->child[POS(p[j])] != NULL)
          {
            childless = false;
          }
          j++;
        }

        if (childless)
        {
          struct node *y = node;

          if (y == NULL)
          {
            t->root = NULL;
          }
          else
          {
            y->child[POS(i)] = NULL;
          }
          free(node);
        }
      } while (node == NULL || node->word || !childless);
    }
}


/* Prints the full contents of trie T. */
/*
void trie_print(struct trie *t)
{
  6.
}
*/
