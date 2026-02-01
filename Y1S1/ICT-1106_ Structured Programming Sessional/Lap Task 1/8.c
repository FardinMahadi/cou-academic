// 8.	Write a program that read two numbers(n,r) and display nCr(Combination)

#include <stdio.h>

int factorial(int num)
{
    int fact = 1;
    for (int i = 1; i <= num; i++)
    {
        fact *= i;
    }
    return fact;
}

int main()
{

    int n, r, nCr;

    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("Enter the value of r: ");
    scanf("%d", &r);

    if (n < 0 || r < 0 || n < r)
    {
        printf("Invalid Input");
    }
    else
    {
        nCr = factorial(n) / (factorial(r) * factorial(n - r));
        printf("%dC%d = %d", n, r, nCr);
    }

    return 0;
}