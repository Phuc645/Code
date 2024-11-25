#include <stdio.h>
#include <string.h>
int main ()
{
	char st[50];
	printf("Nhap chuoi: ");
	scanf("%s",&st);
	int i,n;
	n = strlen(st);
	for(i = 0; i < n; i++)
	{
		printf("%s",st[i]);
	}
	
	
}
