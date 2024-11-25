#include <stdio.h>
#include <string.h>
int main ()
{
	char s[40];
	printf("Nhap chuoi: ");
	scanf("%s",&s);
	printf("Chuoi dao nguoc: %s",strrev(s));
}
