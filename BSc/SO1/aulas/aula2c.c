#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main(void)
{
	pid_t pid = fork();

	int temp=1;

	int n = 3;

	if (pid == 0)
	{
		while(n>0)
		{
			temp = temp * n;
			n--;	
		}
		printf("o resultado e %d\n", temp);
		
	}	
  	return 0;
}

/*inicializar variáveis
temp=1
faz ciclo se for filho
temp=temp*n
n=n-1
se n=1 imprime "resultado é" temp, 
fork()*/