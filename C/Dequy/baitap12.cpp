#include <stdio.h>
int plus(int n)
{
	if (n == 0)
	return 0;
	else
	{
		int S = 0;
		return S = plus(n-1) + n;
	}

}
int main ()
{
	int n;
	printf("Nhap so: ");
	scanf("%d",&n);
	int a = plus(n);
	printf("Tong %d so dau tien la: %d",n,a);
}
