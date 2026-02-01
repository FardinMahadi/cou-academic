// 13.	Write a program that display first n prime numbers
#include <stdio.h>
#include <stdbool.h>

bool isPrime(int num)
{
    if (num < 2)
    {
        return false;
    }

    for (int i = 2; i < num; i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }

    return true;
}

int main()
{
    int n, primeNumPrinted = 0, i = 2;

    printf("Enter a number: ");
    scanf("%d", &n);

    while (primeNumPrinted < n)
    {
        if (isPrime(i))
        {
            printf("%d ", i);
            primeNumPrinted++;
        }
        i++;
    }

    return 0;
}