#include <stdio.h>
#include <stdlib.h>
double power (double a, int n) {
    //Do phuc tap: O(1)
    if (n == 0)
    return 1;
    else
    return power(a,n-1) * a;
}

int main () {
    double a=5;
    int n=3; 
    double b = power(a,n);
    printf("%.1lf",b);
}