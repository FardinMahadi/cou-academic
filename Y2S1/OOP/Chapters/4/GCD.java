/**
 * GCD.java
 * 
 * Case study: Finding Greatest Common Divisor (GCD) using Euclidean algorithm.
 * 
 * The Euclidean algorithm:
 * - GCD(a, b) = GCD(b, a % b)
 * - Continue until b becomes 0
 * - Then GCD is the remaining value
 * 
 * Key Concepts:
 * - While loop
 * - Euclidean algorithm
 * - Modulus operator
 * - Algorithm implementation
 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Greatest Common Divisor (GCD) ===");
        System.out.println();
        
        // Method 1: Euclidean Algorithm with While Loop
        System.out.println("Method 1: Euclidean Algorithm");
        System.out.println("------------------------------");
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        
        int originalN1 = n1;
        int originalN2 = n2;
        
        System.out.println();
        System.out.println("Finding GCD(" + n1 + ", " + n2 + ")");
        System.out.println();
        
        int step = 1;
        while (n2 != 0) {
            System.out.println("Step " + step + ":");
            System.out.println("  n1 = " + n1 + ", n2 = " + n2);
            System.out.println("  GCD(" + n1 + ", " + n2 + ") = GCD(" + n2 + ", " + n1 + " % " + n2 + ")");
            System.out.println("  " + n1 + " % " + n2 + " = " + (n1 % n2));
            
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
            
            System.out.println("  New values: n1 = " + n1 + ", n2 = " + n2);
            System.out.println();
            step++;
        }
        
        int gcd = n1;
        System.out.println("GCD(" + originalN1 + ", " + originalN2 + ") = " + gcd);
        System.out.println();
        
        // Method 2: Alternative Implementation
        System.out.println("Method 2: Alternative Implementation");
        System.out.println("------------------------------------");
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        
        int originalA = a;
        int originalB = b;
        
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        System.out.println("GCD(" + originalA + ", " + originalB + ") = " + a);
        System.out.println();
        
        // Examples with Multiple Pairs
        System.out.println("Examples:");
        System.out.println("--------");
        int[][] testCases = {
            {48, 18},
            {100, 25},
            {17, 13},
            {56, 42},
            {81, 27}
        };
        
        for (int[] testCase : testCases) {
            int x = testCase[0];
            int y = testCase[1];
            int tempX = x;
            int tempY = y;
            
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            
            System.out.println("GCD(" + tempX + ", " + tempY + ") = " + x);
        }
        System.out.println();
        
        // Verification: Check if GCD divides both numbers
        System.out.println("Verification:");
        System.out.println("------------");
        int num1 = 48;
        int num2 = 18;
        int verifyN1 = num1;
        int verifyN2 = num2;
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        int resultGCD = num1;
        System.out.println("GCD(" + verifyN1 + ", " + verifyN2 + ") = " + resultGCD);
        System.out.println(verifyN1 + " % " + resultGCD + " = " + (verifyN1 % resultGCD));
        System.out.println(verifyN2 + " % " + resultGCD + " = " + (verifyN2 % resultGCD));
        System.out.println("Both numbers are divisible by GCD: " + 
                          ((verifyN1 % resultGCD == 0) && (verifyN2 % resultGCD == 0)));
        System.out.println();
        
        // Finding LCM using GCD
        System.out.println("Bonus: Finding LCM using GCD");
        System.out.println("----------------------------");
        System.out.println("LCM(a, b) = (a × b) / GCD(a, b)");
        
        int lcmNum1 = 12;
        int lcmNum2 = 18;
        int lcmTemp1 = lcmNum1;
        int lcmTemp2 = lcmNum2;
        
        // Find GCD first
        while (lcmNum2 != 0) {
            int temp = lcmNum2;
            lcmNum2 = lcmNum1 % lcmNum2;
            lcmNum1 = temp;
        }
        
        int lcmGCD = lcmNum1;
        int lcm = (lcmTemp1 * lcmTemp2) / lcmGCD;
        
        System.out.println("LCM(" + lcmTemp1 + ", " + lcmTemp2 + ") = " + lcm);
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
    }
}

