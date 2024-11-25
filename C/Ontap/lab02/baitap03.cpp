#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main ()
{
	fflush(stdin);
	char string[20];
	printf("Nhap chuoi: ");
	gets(string);
	int S;
	int l=0;
	int d=0;
	int w=0;
	int o;
	S = strlen(string);
	for (int i=0;i<S;i++)
	{
		if (isdigit (string[i]))
		d = d + 1;
		if (isalpha (string[i]))
		l = l + 1;
		if (isspace (string[i]))
		w = w + 1;
	}
	o = S - d - l - w;
	printf("So ky tu chu la: %d\n", l);
	printf("So ky tu so la: %d\n", d);
	printf("So khoang trang la: %d\n", w);
	printf("So ky tu khac la: %d", o);
}
