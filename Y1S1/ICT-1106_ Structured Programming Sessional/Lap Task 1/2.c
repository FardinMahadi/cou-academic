// 2.	Write a program that read a positive integer and display sum of it's digit
#include <stdio.h>

int main()
{
    int num, sum = 0, digit;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    if (num < 0)
    {
        printf("Please enter a positive integer.\n");
    }
    else
    {
        while (num != 0)
        {
            digit = num % 100;
            sum += digit;
            num /= 10;
        }

        printf("Sum of the digits = %d\n", sum);
    }

    return 0;
}
