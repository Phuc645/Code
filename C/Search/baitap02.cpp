#include <stdio.h>
#include <string.h>
typedef struct
{
    int id;
    char name[30];
    float score;
} Student;

void find(Student s[], int n)
{
    int i;
    char sr[30];
    printf("Nhap ten: ");
    scanf("%s",&sr);
    for (i = 0; i < n; i++)
    {

        if (strcmpi(sr, s[i].name) == 0)
        {
            printf("%-10d %-10s %-10.2f", s[i].id, s[i].name, s[i].score);
        }
    }
}

int main()
{
    Student s[] = {
        {123, "Binh", 7.5},
        {124, "An", 7.5},
        {125, "Khoa", 8.5},
        {126, "Thanh", 9.5},
        {127, "Nguyen", 5.5},
        {128, "Mai", 6.7},
        {129, "Hung", 7.3},
        {130, "Viet", 5.9},
    };
    int n = sizeof(s) / sizeof(s[0]);
    find(s, n);
}
