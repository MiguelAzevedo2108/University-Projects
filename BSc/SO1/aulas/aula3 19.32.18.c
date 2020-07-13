#include <pthread.h>
#include <stdio.h>

#define SIZE 100


/* Prints x’s to stderr. The parameter is unused. Does not return. */
void *print_xs (void *unused)
{	
	int x = 0;
	while (x<SIZE) {
    fputc ('x', stderr);
    x++;
  }
  return NULL;
}

void *print_o(void *unused)
{
	int y = 0;

	while(y<SIZE)
	{
		printf("o");
		y++;
	}
	return NULL;
}
/* The main program. */
int main (void)
{
	pthread_t thread_id;
	pthread_t thread_id1;
  /* Create a new thread. The new thread will run the print_xs() function. */
	pthread_create (&thread_id, NULL, &print_o, NULL);

	pthread_create (&thread_id1, NULL, &print_xs,NULL); 

	pthread_join(thread_id1,NULL);
	pthread_join(thread_id,NULL);
  /* Print o’s continuously to stderr. */
	
 	return 0;
}
