// 5.	Write a program that read two numbers and display LCM(least common multiple)
#include <stdio.h>

int main()
{
    int num1, num2, lcm;

    printf("Enter two positive integers: ");
    scanf("%d %d", &num1, &num2);

    if (num1 <= 0 || num2 <= 0)
    {
        printf("Please enter positive integers only.\n");
    }
    else
    {
        lcm = (num1 > num2) ? num1 : num2;

        while (1)
        {
            if (lcm % num1 == 0 && lcm % num2 == 0)
            {
                printf("LCM of %d and %d = %d\n", num1, num2, lcm);
                break;
            }
            lcm++;
        }
    }

    return 0;
}
