#include <stdio.h>
#include <string.h>
int main()
{
	char h[20],t[10];
	printf("Nhap ho va ten dem: ");
	gets(h);
	printf("Nhap ten: ");
	gets(t);
	printf("%s.%s@hoasen.edu.vn",t,h);
}
