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

void Print(Student s[], int n) {
    for (int i=0;i<n;i++) {
        printf("%-10d %-10s %-10.2f\n", s[i].id, s[i].name, s[i].score);
    }
}

void array(Student s[], int left, int middle, int right) {
    Student temp[right-left+1];
    int i=left;
    int j=middle+1;
    int k=0;
    while ((i <= middle) && (j <= right)) {
        if (s[i].score > s[j].score) {
            temp[k] = s[i];
            i++;
        } else {
            temp[k] = s[j];
            j++;
        }
        k++;
    }
    while (i <= middle) {
        temp[k] = s[i];
        i++;
        k++;
    }
    while (j <= right) {
        temp[k] = s[j];
        j++;
        k++;
    }
    for (int h=0; h < k;h++) {
        s[left+h] = temp[h];
    }
}

void sort(Student s[], int left, int right) {
    int middle = (left + right)/2;
    if (left < right) {
        sort(s,left,middle);
        sort(s,middle+1,right);
        array(s,left,middle,right);
    }

}

int main () {
    int n = Count() + 1;
    int left=0,right=n-1;
    Student s[n];
    loadStudent(s);
    sort(s,left,right);
    Print(s,n);
}