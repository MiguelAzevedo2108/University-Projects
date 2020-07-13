#include <stdio.h>


int pesquisaLinear(int valor, int n, int array[n])
{	
	for (int i = 0; i < n; i++)
	{
		if (array[i] == valor)
		{
			return i;
		}
	}
	return -1;
}

void solve (int valor, int n, int array[n])
{
	int resultado = pesquisaLinear(valor,n,array);

	if (resultado != -1) // caso 1..
	{
		printf("s[%d] = %d\n",resultado+1,valor);
	}

	else // 2 caso
	{
		int soma = 0;

		for (int i = 0; i < n; i++)
		{
			soma = array[i] + array[i+1];

			if (soma == valor)
			{
				printf("s[%d] + s[%d] = %d\n",i+1,i+2,valor);
                return ;
			}
		}

        int fim = n;
        int inicio = 1;
        int flag = 0;

		for (int i = 0; i < n; i++)  // caso 3
		{
            soma = 0;

			for (int j = i; j < n; j++)
			{			
                soma += array[j];

				if (soma == valor)
				{
                    flag = 1;

                    if (fim - inicio > j - i)
                    {
                        fim = j+1;
                        inicio = i+1;
                    }
				}
			}
		}
        if (flag == 1)
        {
            printf("s[%d] + ... + s[%d] = %d\n",inicio, fim, valor);
            return;
        }
        else
        {
            printf("nenhuma subsequencia soma %d\n",valor);
            return;
        }
	}
}


int main(void)
{
	int nElementos;
	scanf("%d",&nElementos);

	int numero;
	int soma;
	int array[nElementos];

	for (int i = 0; i < nElementos; i++)
	{
		scanf("%d", &numero);
		array[i] = numero;
	}

	scanf("%d",&soma);

	solve(soma,nElementos,array);

	return 0;
}