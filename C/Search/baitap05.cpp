#include <stdio.h>
#include <string.h>
typedef struct
{
    int id;
    char name[30];
    float score;
} Student;

void loadStudent (Student s[]) {
    FILE *f = fopen("students.txt","r");
    if (f == NULL) {
        printf("Khong co");
    }
    int i = 0;
    while(!feof(f)){
        fscanf(f,"%d %s %f" ,&s[i].id, &s[i].name, &s[i].score);
        i++;
    }
    fclose(f);
}

int Count () {
    char c;
    int a = 0;
    FILE *f = fopen("students.txt","r");
    if (f == NULL) {
        printf("Khong co");
    }
    while(!feof(f)) {
        c = fgetc(f);
        if ( c == '\n')
        a++;
    }
    fclose(f);
    return a;
}

void Print(Student s[], int n) {
    for (int i=0;i<n;i++) {
        printf("%-10d %-10s %-10.2f\n", s[i].id, s[i].name, s[i].score);
    }
}

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
void menu (Student s[], int n) {
    int choice;
    printf("======================\n");
    printf("1. Tim kiem ID\n");
    printf("2. Tim kiem ten\n");
    printf("======================\n");
    printf("Nhap lua chon: ");
    scanf("%d",&choice);
    switch (choice)
    {
    case 1: 
    search(s,n);
    break;
    case 2:
    find(s,n);
    break;
    default:
    break;
    }

}

int main () {
    int n = Count() + 1;
    Student s[n];
    loadStudent(s);
    Print(s,n);
    menu(s,n);
}