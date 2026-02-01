// 9.	Write a program that read any integer and test prime or not prime
#include <stdio.h>
#include <stdbool.h>

int main()
{
    int num;
    bool isPrime = true;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (num > 1)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
    }
    else
    {
        printf("Enter a greater number");
        return 0;
    }

    if (isPrime)
    {
        printf("%d is a prime number", num);
    }
    else
    {
        printf("%d is not a prime number", num);
    }

    return 0;
}