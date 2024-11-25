#include <stdio.h>
void binary (int n){
	if (n == 0 or n == 1 )
	printf("%d",n);
	else 
	{
		binary (n/2);
		printf("%d",n%2);
	}
}
int main ()
{
	int n;
	printf("Nhap so: ");
	scanf("%d",&n);
	binary (n);
}
