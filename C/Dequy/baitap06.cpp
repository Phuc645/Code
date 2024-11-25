#include <stdio.h>
int prime (int a){
	if (a == 2)
	return 1;
	else {
	prime (a/2);
	for (int i=2;i<=a;i++)
	{
		if (a % i == 0)
		return 0;
		else
		return 1;
	}	
}
}
int main () {
	int a;
	printf("Nhap so: ");
	scanf("%d",&a);
	int b = prime(a);
	if (b == 1)
	printf("%d la so nguyen to",a);
	else 
	printf("%d khong phai la so nguyen to",a);
}
