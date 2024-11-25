#include <stdio.h>
void print (int n){
	if (n == 0)
	return;
	else 
	{	
		print(n-1);	
		for (int i=0;i<n;i++)
		{
			printf("*");
		}
		printf("\n");
	}
}
int main ()
{
	int n;
	printf("Nhap so: ");
	scanf("%d",&n);
	print(n);
}
