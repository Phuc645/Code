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

void sort(Student s[], int n) {
    for (int i = 0;i < n - 1;i++) {
        int min = i;
        for (int j = i + 1;j < n;j++) {
            if (strcmpi(s[j].name,s[min].name) < 0)
            min = j;
        }
        if (min != i) {
                Student temp = s[i];
                s[i] = s[min];
                s[min]= temp;

        }
    }
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