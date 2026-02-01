// 12.	Write a program that count total prime numbers from 1 to n
#include <stdio.h>
#include <stdbool.h>

bool isPrime(int num)
{
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
    int n, count = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        if (isPrime(i))
        {
            count++;
        }
    }

    printf("Total prime number: %d", count);
    return 0;
}