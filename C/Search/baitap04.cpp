#include <stdio.h>
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
int main () {
    int n = Count() + 1;
    Student s[n];
    loadStudent(s);
    Print(s,n);

}

