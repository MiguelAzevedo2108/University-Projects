#include <stdio.h>
#include <math.h>

#define N 2

float soma (int n)
{

	float raiz=0;

	for (int i = 1; i <=n; ++i)
	{	
		raiz += sqrt(i);
	}
	return raiz;
}

int main(void)
{

	pthread_t thread_id;


	pthread_create (&thread_id, NULL, &soma(N), NULL);


	return 0;
}