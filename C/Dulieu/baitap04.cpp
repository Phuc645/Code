#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void find (int n, int a[]){
    // Best case: 1 thao tac
    // Worst case: n thao tac
    // Average case: (n+1)/2 thao tac
    int f;
    printf("Tim so: ");
    scanf("%d",&f);
    for (int i=0;i<n;i++)
    {
        if (a[i] == f)
        {
            printf("So %d nam o vi tri: %d",f,i+1);
            break;
        }  
        else 
        {
            printf("Khong co so %d trong mang",f);
            break;  
        } 
    }
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

int main ()
{
    int n=10;
    int a[n];
    Array(n,a);
    find(n,a);
}