#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

#define MAX_COUNT 200

void forkTest() 
{
    puts("TESTE FORK:\n");
    
    pid_t pid;
    
    pid = fork(); //cria processo
    
    if(pid > 0) {
        printf("Processo Pai PID: %d\n", pid);
    }
    else {
        printf("Processo Filho PID: %d\n", pid);
    }
    puts("FIM");
}

	/*Processo Filho */

void ChildProcess(void)
{
 	int i;

	for (i = 1; i <= MAX_COUNT; i++)
	{
		printf("This line is from child, value = %d\n", i);
	}
	printf("*** Child process is done ***\n");
}

	/*Processo Pai */

void ParentProcess(void)
{
	int i;

	for (i = 1; i <= MAX_COUNT; i++)
 	{
 		printf("This line is from parent, value = %d\n", i);	
	}
	printf("*** Parent is done ***\n");
}

int main(void)
{
	pid_t pid;

	pid = fork();

	if (pid == 0)
	{
		ChildProcess();
	} 	
	else
	{
	 	ParentProcess();
	}
	return 0;
}
