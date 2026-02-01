// 7.	Write a program that read two numbers(n,r) and display nPr(Permutation)
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
    int n, r, nPr;

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
        nPr = factorial(n) / factorial(n - r);
        printf("%dP%d = %d\n", n, r, nPr);
    }

    return 0;
}