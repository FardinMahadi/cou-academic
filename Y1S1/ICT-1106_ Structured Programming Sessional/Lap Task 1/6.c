// 6.	Write a program that read two numbers(x,y) and display x^y(x to the power y)
#include <stdio.h>
#include <math.h>

int main()
{
    int x, y;
    long long result = 1;

    printf("Enter X: ");
    scanf("%d", &x);
    printf("Enter Y: ");
    scanf("%d", &y);

    result = pow(x, y);

    printf("%d^%d = %d\n", x, y, result);

    return 0;
}