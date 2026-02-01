// 1.	Write a program that read a positive integer and display it's factorial.
#include <stdio.h>

int main()
{
    int num, factorial = 1;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    if (num < 0)
    {
        printf("Please enter a positive integer.\n");
    }
    else
    {
        for (int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }

        printf("Factorial of %d = %d\n", num, factorial);
    }

    return 0;
}
