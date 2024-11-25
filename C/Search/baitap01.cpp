#include <stdio.h>
typedef struct
{
    int id;
    char name[30];
    float score;
}Student;

void print(Student s[], int n){
    int i;
    printf("ID   Name       Score\n");
    for (i = 0; i < n; i++) {
        printf("%-5d %-12s %-4.2f\n",s[i].id,s[i].name,s[i].score);
    }
}

int main () {
    Student s[] = {
        {123,"Binh",7.5},
        {124,"An",7.5},
        {125,"Khoa",8.5},
        {126,"Thanh",9.5},
        {127,"Nguyen",5.5},
        {128,"Mai",6.7},
        {129,"Hung",7.3},
        {130,"Viet",5.9},
    };
    int n = sizeof(s) / sizeof(s[0]);
    print(s,n); 
}