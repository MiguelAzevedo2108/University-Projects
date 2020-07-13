#include <stdio.h>
#include <math.h>

int checkPrime (unsigned int n)
{
	if (n < 2)
	{
		return 0;
	}

	unsigned int raiz = sqrt(n);

	for (unsigned int i = 2; i <= raiz; i++)
	{	
		if (n%i == 0)
		{
			return 0;
		}
	}
	return 1;
}

void solve(unsigned int numero)
{
	printf("%u:", numero);

	if (numero == 0 || numero == 1)
	{
		printf("\n");
		return;
	}
	
	unsigned int raiz = sqrt(numero);

	if (checkPrime(numero)==1)
	{
		printf(" %u\n", numero);
		return;
	}

	for (unsigned int i = 2; i <= raiz; i++)
	{	
		if (numero % i == 0)
		{
			printf(" %u", i);
			numero = numero/i;
			i--;
		}
	}
	
	if (numero != 1)
	{
		printf(" %u\n",numero);
	}
	else
	{
		printf("\n");
	}	
	
}

int main()
{
	int nNumbers;
	scanf("%d", &nNumbers);

	for (int i = 0; i < nNumbers; ++i)
	{
		unsigned int number;
		scanf("%u",&number);
		solve(number);
	}

	return 0;
}



