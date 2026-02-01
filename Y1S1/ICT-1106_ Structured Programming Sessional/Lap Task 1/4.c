// 4.	Write a program that read two numbers and display GCD(greatest common divisor)
#include <stdio.h>

int main()
{
    int num1, num2, gcd, i;

    printf("Enter two positive integers: ");
    scanf("%d %d", &num1, &num2);

    if (num1 <= 0 || num2 <= 0)
    {
        printf("Please enter positive integers only.\n");
    }
    else
    {
        for (i = 1; i <= num1 && i <= num2; ++i)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }
        }

        printf("GCD of %d and %d = %d\n", num1, num2, gcd);
    }

    return 0;
}
