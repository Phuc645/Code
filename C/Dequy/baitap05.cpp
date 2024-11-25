#include <stdio.h>
void time (int giay)
{
	if (giay < 60)
	printf("%d giay",giay);
	else if (giay < 3600)
	{	
		printf("%d phut ",giay/60);
		time(giay%60);
	}
	else {
		printf("%d gio ",giay/3600);
		time(giay/60);
		time(giay%60);
	}
}
int main ()
{
	int giay;
	printf("Nhap so: ");
	scanf("%d",&giay);
	time(giay);
}
