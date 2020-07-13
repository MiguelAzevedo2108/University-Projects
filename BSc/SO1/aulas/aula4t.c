#include <stdio.h>
#include <math.h>
#include <pthread.h>

#define N 2

float raiz = 0;

void *soma(void *unused)
{
	int x = N/2;
	for (int i=1; i <=x; ++i)
	{	
		raiz += sqrt(i);
	}
	printf("%f\n",raiz);
}

void *soma1(void *unused)
{

	int x = N/2;

	for (int i = x+1; i <=N; ++i)
	{
		raiz += sqrt(i);
	}
	printf("%f\n",raiz);

}

int main(void)
{

	pthread_t thread_id, thread_id1;

	pthread_create (&thread_id, NULL, &soma, NULL);

	pthread_create(&thread_id1,NULL,&soma1,NULL);

	pthread_join(thread_id,NULL);
	pthread_join(thread_id1,NULL);

	return 0;
}