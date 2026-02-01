// 11.	Write a program that print all prime numbers from m to n(m<n)
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
    int m, n;

    printf("Enter a number(m): ");
    scanf("%d", &m);
    printf("Enter a number(n): ");
    scanf("%d", &n);

    for (int i = m; i <= n; i++)
    {
        if (isPrime(i))
        {
            printf("%d ", i);
        }
    }

    return 0;
}