#include <stdio.h>
#include <string.h>
int main ()
{ 
	fflush(stdin);
	char ho[20];
	char ten[10];
	printf ("Nhap ho va ten dem: ");
	gets(ho);
	printf ("Nhap ten: ");
	gets(ten);
	printf("Email: %s.%s@hoasen.edu.vn",ten,ho);
}
