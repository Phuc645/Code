#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main ()
{
	fflush(stdin);
	char hoten[20];
	printf("Nhap ho va ten: ");
	gets(hoten);
	int S=strlen(hoten);
	for (int i=0; i<S;i++)
	{
		if (isupper(hoten[i]))
		printf("%s",hoten[i]);
	}
	
}
