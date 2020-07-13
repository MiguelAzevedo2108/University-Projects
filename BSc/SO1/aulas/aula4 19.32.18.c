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

	printf("%f\n",soma(N));

	return 0;
}