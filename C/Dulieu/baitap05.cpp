#include <stdio.h>
#include <stdlib.h>

void check (int a[])
{
    //Best case: 6 thao tac
    //Worst case: 6 thao tac
    int flag = 0;
    for (int i=0;i<4;i++)
    {
        for (int j=i+1;j<4;j++)
        {
            if (a[j] == a[i])
            {
                flag = 1;
                break;
            }

        }
    } 
    if (flag == 1)
    printf("Co so trung nhau");
    else 
    printf("Cac so khac nhau");
    
}
int main () {
    int a[4] = {5,6,7,3};
    check(a);
}