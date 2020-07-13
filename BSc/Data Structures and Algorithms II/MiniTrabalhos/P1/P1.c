#include <stdio.h>
#include <math.h>

int checkPrime (int n)
{
	if (n < 2)
	{
		return 0;
	}
	
	for (int i = 2; i < sqrt(n) ; ++i)
	{
		if (n%i == 0)
		{
			return 0;
		}
	}
	return 1;
}

int solve(int numero)
{
	int counter = 0;

	if (numero == 0 || numero == 1)
	{
		return counter;
	}

	for (int i = 2; i <= sqrt(numero); ++i)
	{
		if (numero%i == 0)
		{
			numero = numero/i;
			counter++;
			i--;
		}
	}
	return counter+1;
}

int main()
{
	int nNumbers;
	scanf("%d", &nNumbers);

	for (int i = 0; i < nNumbers; ++i)
	{
		int number;
		scanf("%d",&number);
		printf("%d: %d\n", number, solve(number));
	}
	return 0;
}








