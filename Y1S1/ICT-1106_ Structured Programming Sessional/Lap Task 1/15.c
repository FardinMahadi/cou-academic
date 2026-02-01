// 15.	Write a program that display all Fibonacci numbers from 1 to n
#include <stdio.h>

int main()
{
    int n;
    long long first = 0, second = 1, next;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        if (i == 1)
        {
            printf("%lld ", first);
            continue;
        }
        if (i == 2)
        {
            printf("%lld ", second);
            continue;
        }

        next = first + second;
        if (next >= n)
        {
            return 0;
        }
        printf("%lld ", next);

        first = second;
        second = next;
    }
    return 0;
}