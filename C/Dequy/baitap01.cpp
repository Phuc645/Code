#include <stdio.h>
void Print (int n){
	if (n == 0)
	return;
	else 
	{
		Print(n-1);
		printf("*");
	}
}

int main ()
{
	int n;
	printf("Nhap so: ");
	scanf("%d",&n);
	Print(n);
}
