#include <stdio.h>
#include <stdlib.h>
double power (double a, int n) {
    //Do phuc tap: O(1)
    if (n==0)
    return 1;
    if (n % 2 == 0)
    {
        double half = power(a, n/2);
        return half * half;
    }
    else 
    return power(a, n-1) * a;
}
int main () {
    double a=6;
    int n=5;
    double s = power(a,n);
    printf("%.1lf",s);
}