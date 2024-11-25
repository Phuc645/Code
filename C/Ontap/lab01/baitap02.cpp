#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main ()
{
	fflush(stdin);
	char st[100];
	printf("Nhap chuoi: ");
	scanf("%s",&st);
	int a = strlen(st);
	printf("Do dai cua chuoi: %d\n",a);
	int b=0,c=0,d=0;
	for (int i=0;i<a;i++)
	{
		if (isalpha(st[i]))
		b = b + 1;
		else if (isdigit(st[i]))
		c = c + 1;
		else if (isspace(st[i]))
		d = d + 1;
	}
	int e = a-b-c-d;
	printf("So ky tu chu cua chuoi: %d\n",b);
	printf("So ky tu so cua chuoi: %d\n",c);
	printf("So khoang trang cua chuoi: %d\n",d);
	printf("So ky tu khac cua chuoi: %d\n",e);
	printf("Ham dao nguoc: %s",strrev(st));
}
