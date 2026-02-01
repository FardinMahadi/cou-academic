import java.util.Scanner;

public class SolveYourAllProbs {

    public SolveYourAllProbs() {
        System.out.println("Welcome! Default constructor called.");
    }

    public SolveYourAllProbs(String userName) {
        System.out.println("Welcome " + userName + "! Parameterized constructor called.");
    }

    public static void main(String[] args) {

        SolveYourAllProbs obj1 = new SolveYourAllProbs();
        SolveYourAllProbs obj2 = new SolveYourAllProbs("Student");

        System.out.println("\nWhich problem do you want to solve? (Enter problem number)");
        System.out.println("1. Find the LCM of two integers.");
        System.out.println("2. Print first 100 prime numbers");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        if (option != 1 && option != 2) {
            System.out.println("Enter a valid option");
        } else {
            if (option == 1) {
                System.out.print("Enter first number: ");
                int x = input.nextInt();

                System.out.print("Enter second number: ");
                int y = input.nextInt();

                int res = lcm(x, y);
                System.out.println("LCM of " + x + " and " + y + " is " + res);
            } else {
                PrintPrims();
            }
        }
        input.close();
    }

    public static int lcm(int x, int y) {
        int res = (x > y) ? x : y;

        while (true) {
            if (res % x == 0 && res % y == 0)
                break;
            res++;
        }
        return res;
    }

    public static void PrintPrims() {
        System.out.println("First 100 prime numbers are:");

        int count = 0;
        int num = 2;

        while (count < 100) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Add(int a, int b, int c) {
        return a + b + c;
    }
}
