// 3.	Write a program that read a positive integer and display reverse.
#include <stdio.h>

int main()
{
    int num, reverse = 0, digit;

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
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        printf("Reversed number = %d\n", reverse);
    }

    return 0;
}
