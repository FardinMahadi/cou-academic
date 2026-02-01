// 16.	Write a program that a number Fibonacci or not Fibonacci
#include <stdio.h>

int main()
{
    int n;
    long long first = 0, second = 1, next;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (n == 0 || n == 1)
    {
        printf("%d is a Fibonacci number. \n", n);
        return 0;
    }

    first = 0;
    second = 1;
    next = first + second;

    while (next < n)
    {
        first = second;
        second = next;
        next = first + second;
    }

    if (next == n)
    {
        printf("%d is Fibonacci number.\n", n);
    }
    else
    {
        printf("%d is not Fibonacci number.\n", n);
    }
}
