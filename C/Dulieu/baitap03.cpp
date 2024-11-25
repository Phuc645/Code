#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int max (int n, int a[]){
    // Best case: n thao tac
    // Worst case: n thao tac
    // Average case: n thao tac
    int max = a[0];
    for(int i=1;i<n;i++)
    {
        if (a[i] > max)
        max = a[i];
    }
    return max;
}
void Array (int n,int a[]){
    srand(time(0));
    int max = n-1;
    int i,v;
    for (i=0;i<n;i++){
        v = rand() % max;
        a[i] = v;
    }
}
int main (){
    int n=10;
    int a[n];
    Array(n,a);
    int b = max(n,a);
    printf("So lon nhat la: %d",b);
}