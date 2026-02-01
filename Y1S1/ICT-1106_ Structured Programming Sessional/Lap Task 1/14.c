// 14.	Write a program that display first n Fibonacci numbers
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
        printf("%lld ", next);

        first = second;
        second = next;
    }
    return 0;
}