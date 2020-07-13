#include <stdio.h>
#include <stdlib.h>
#include <stdio.h>

//#include "instrucoes.h"
//#include "queue.h"

void instrucao_0(pcb *processo, int *MEM, int X1, int X2)
{
	MEM[X1]=MEM[X2];
	processo->programCounter=processo->programCounter+3;
}


void instrucao_1(pcb *processo, int *MEM, int X, int N)
{
	MEM[X]=N;
	processo->programCounter=processo->programCounter+3;
}


void instrucao_2(pcb *processo, int *MEM, int X)
{
	MEM[X]=MEM[X]+1;
	processo->programCounter=processo->programCounter+3;
}

void instrucao_3(pcb *processo, int *MEM, int X)
{
	MEM[X]=MEM[X]-1;
	processo->programCounter=processo->programCounter+3;
}

void instrucao_4(pcb *processo, int N)
{
	processo->programCounter=processo->programCounter-N;
	//processo->programCounter=processo->programCounter+3;
}

void instrucao_5(pcb *processo, int N)
{
	processo->programCounter=processo->programCounter+N;
}

void instrucao_6(pcb *processo, int X, int N)
{
	if(X==0)
	{
		processo->programCounter=processo->programCounter+N;
	}
	else
	{
		processo->programCounter=processo->programCounter+3;
	}
}

void instrucao_7(pcb *processo, int X)
{
	processo->programCounter=processo->programCounter+3;
}

void instrucao_8(int *MEM,pcb *processo, int X)
{
	FILE *f;
	f = fopen("disk.bin","wb");
	int i=MEM[X];
	fseek(f,sizeof(int)*X,SEEK_SET);
	fwrite(&i,sizeof(int),1,f);
	processo->programCounter=processo->programCounter+3;
}

void instrucao_9(int *MEM, pcb *processo, int X)
{
	FILE *f;
	f = fopen("disk.bin","rb");
	fseek(f,sizeof(int)*X,SEEK_SET);
	fread(&MEM[X],sizeof(int),1,f);
	processo->programCounter=processo->programCounter+3;
}

void instrucao_10(pcb *processo, int X)
{
	printf("%d\n",X);
	processo->programCounter=processo->programCounter+3;
}

void instrucao_11(pcb *processo)
{
	//processo->programCounter=processo->programCounter+3;
}







