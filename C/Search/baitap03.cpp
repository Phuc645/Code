#include <stdio.h>
typedef struct
{
    int id;
    char name[30];
    float score;
} Student;
void search (Student s[], int n) {
    int find,left = 0,right = n - 1,mid;
    printf("Nhap ID: ");
    scanf("%d",&find);
    while (left <= right){
        mid =(left + right)/2;
        if (s[mid].id == find)
            printf("%-10d %-10s %-10.2f", s[mid].id, s[mid].name, s[mid].score);
        if (s[mid].id > find)
            right = mid - 1;
        else 
            left = mid + 1;
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
    search(s, n);
}