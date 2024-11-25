#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
void RandomArray (int *, int);
void Print(int *, int);
int Square (int *, int);
int Prime (int *, int);
int Perfect (int *, int);

int main()
{
	int *Arr, N=10;
	Arr = (int*) malloc(N* sizeof(int));
	RandomArray(Arr,N);
	Print(Arr,N);
	Square (Arr,N);
    Prime (Arr,N);
    Perfect (Arr,N);
}
void RandomArray (int *Arr, int N)
{
	srand(time(0));
	for (int i=0; i<N; i++)
	*(Arr+i)= rand() %100;
}
void Print(int *Arr, int N)
{
	for (int i=0; i<N;i++)
	{
		printf("%4d",*(Arr+i));
	}
}
int Square (int *Arr, int N)
{
	int Sq;
	for (int i=0; i<N ;i++)
	{
		Sq = sqrt(Arr[i]);
		if (Sq * Sq == Arr[i])
		{
			printf("%4d",Arr[i]);
		}
	}
}
int Prime (int *Arr, int N)
{
	int flag=0;
	for (int n=0;n<N;n++)
	{
	for (int i=2; i<=sqrt(Arr[n]); i++)
	{
		if (Arr[n] % i == 0)
		flag=1;
	}
	if (flag==2)
	printf("%4d",Arr[n]);
	}
}
int Perfect (int *Arr, int N)
{
	int S=0;
	for (n=0;n<N;n++)
	{
	for (int i=1; i<=sqrt(Arr[n]))
	{
	if (Arr[n] % i == 0)
	S = S + i;
	if (i != Arr[n]/i)	
	S += Arr[n]/i;
	}
	if (S - Arr[n] == Arr[n])
	printf("%4d",S);
	}
	
}

