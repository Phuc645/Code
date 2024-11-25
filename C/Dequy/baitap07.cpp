#include <stdio.h>
#include <string.h>
int plus (int n){
	int S = 0;
	if ( n < 10)
	return n;
	else 
	{
		return S = plus(n/10) + (n % 10);
	}
}

int main () {
	int n;
	printf("Nhap so: ");
	scanf("%d",&n);
	int a = plus(n);
	printf("%d",a);
	
}
