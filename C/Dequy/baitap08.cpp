#include <stdio.h>
void reverse (int so)
{
	if ( so == 0)
	return;
	else{
		printf("%d",so%10);
		reverse (so/10);
	}
	
}
int main ()
{
	int so;
	printf("Nhap so: ");
	scanf("%d",&so);
	reverse(so);
}
