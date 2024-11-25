#include <stdio.h>
#include <string.h>
typedef struct
{
    int id;
    char name[30];
    float score;
} Student;

void loadStudent (Student s[]) {
    FILE *f = fopen("Students.txt","r");
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
    FILE *f = fopen("Students.txt","r");
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

void sort(Student s[], int n) {
    for (int pass = 0; pass < n - 1; pass++) {
        for (int j = 0;j < n - pass - 1; j++) {
            if(s[j].score > s[j + 1].score) {
                Student temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = s[j];
            }
        }
    }
}

void Print(Student s[], int n) {
    for (int i=0;i<n;i++) {
        printf("%-10d %-10s %-10.2f\n", s[i].id, s[i].name, s[i].score);
    }
}

int main () {
    int n = Count() + 1;
    Student s[n];
    loadStudent(s);
    sort(s,n);
    Print(s,n);
}