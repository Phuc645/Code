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

void Sort(Student s[], int n) {
    int temp;
    for (int i=0;i<n;i++)
    {
        for (int j=1;j<n;j++) {
            if (strcmpi(s[i].name,s[j].name) > 0) {
                s[temp].id = s[i].id;
                s[temp].score = s[i].score;
                strcpy (s[temp].name,s[i].name);
                s[i].id = s[j].id;
                s[i].score = s[j].score;
                strcpy (s[i].name,s[j].name);
                s[j].id = s[temp].id;
                s[j].score = s[temp].score;                          
                strcpy (s[j].name,s[temp].name);
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
    Sort(s,n);
    Print(s,n);
}