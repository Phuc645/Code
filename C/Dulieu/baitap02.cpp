#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int count (int a[], int n){
    int c = 0;
    for (int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
            if((a[i] + a[j]) % 5 == 0){
                c++;
            }
        }
    }
    return c;
}
void randomArray (int a[], int n){
    srand(time(0));
    int max = n-1;
    int i,v;
    for (i=0;i<n;i++){
        v = rand() % max;
        a[i] = v;
    }
}
int main () {
    int n = 100000;
    int a[n];
    int dem = 0;
    double start,end,time;
    randomArray(a,n);
    start = clock();
    dem = count(a,n);
    end = clock();
    time = (end-start)/CLOCKS_PER_SEC;
    printf("Thoi gian: %.6f",time);
}