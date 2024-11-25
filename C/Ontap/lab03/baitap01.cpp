#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#include <string.h>
struct hs {
	char ht[25];
	int t;
	double dtb;
};
struct hs HS[100];
int n = 0;
void them(struct hs st[]);
void in(struct hs st[]);
void sap(struct hs st[], int);
int tim(struct hs st[]);
void menu();
int main()
{
	menu();
}
void them(struct hs st[])
{
	fflush(stdin);
	printf("Nhap ho va ten: ");
	scanf("%s",&hs[n].ht);
	printf("Nhap tuoi: ");
	scanf("%d",&hs[n].t);
	printf("Nhap diem trung binh: ");
	scanf("%lf",&hs[n].dtb);
	n++;
}
void in(struct hs st[])
{
	for (int i=0;i<n;i++)
	printf("%s - %d - %.1lf",hs[i].ht,hs[i].t,hs[i].dtb);
}
void sap(struct hs st[], int n)
{
	struct hs temp;
	int i,j;
	for(i = 0; i < n - 1;i++)
	{
		for (j = N - 1; j > i; j--)
		{
			if (hs[j].dtb < hs[j-1].dtb)
			{
				temp =  hs[j];
				hs[j] = hs[j - 1];
				hs[j - 1] = temp;
			}
		}
	}
}
int tim(struct hs st[])
{
	char HT[30];
	fflush(stdin);
	printf("Nhap ho va ten: ");
	gets(HT);
	for (int i = 0; i < N;i++)
	{
		if(strcmp(HT, hs[i].ht) == 0)
		printf("O vi tri: %d",i+1);
	}
	printf("Khong tim thay");
}
void menu ()
{
	int c;
	do
	{
		printf("-----QUAN LY-----\n");
		printf("1.Them sinh vien\n");
		printf("2.In danh sach sinh vien\n");
		printf("3.Sap xep theo diem\n");
		printf("4.Tim sinh vien\n");
		printf("0.Thoat\n");
		printf("------------------\n");
		printf("Nhap lua chon: ");
		scanf ("%d", &c);
		switch (c)
		{
			case 1:
				them(hs);
				break;
			case 2:
				in(hs);
				break;
			case 3:
				sap(hs);
				break;
			case 4:
				tim(hs);
				break;
			case 0:
				break;
			default:
				printf("Nhap lai");
				break;
		}	
	}
	while (c !=0);
}

