/**
 * WhileLoop.java
 * 
 * Demonstrates while loop in Java.
 * 
 * Key Concepts:
 * - While loop syntax
 * - Pretest loop (condition checked before execution)
 * - Loop control variable
 * - Count-controlled loops
 * - Condition-controlled loops
 */
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== While Loop Demonstration ===");
        System.out.println();
        
        // 1. Basic Count-Controlled Loop
        System.out.println("1. Basic Count-Controlled Loop:");
        System.out.println("------------------------------");
        int count = 0;
        System.out.println("Counting from 0 to 4:");
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;  // Important: Update loop control variable
        }
        System.out.println("Loop finished. Final count: " + count);
        System.out.println();
        
        // 2. Counting Down
        System.out.println("2. Counting Down:");
        System.out.println("-----------------");
        int number = 10;
        System.out.println("Counting down from 10:");
        while (number > 0) {
            System.out.println(number);
            number--;
        }
        System.out.println("Blast off!");
        System.out.println();
        
        // 3. Sum of Numbers
        System.out.println("3. Sum of Numbers:");
        System.out.println("-----------------");
        int sum = 0;
        int i = 1;
        System.out.println("Summing numbers from 1 to 10:");
        while (i <= 10) {
            sum += i;
            System.out.println("Adding " + i + ", sum = " + sum);
            i++;
        }
        System.out.println("Final sum: " + sum);
        System.out.println();
        
        // 4. Condition-Controlled Loop
        System.out.println("4. Condition-Controlled Loop:");
        System.out.println("-----------------------------");
        System.out.println("Enter positive numbers (enter 0 to stop):");
        int value;
        int total = 0;
        int count2 = 0;
        
        System.out.print("Enter a number: ");
        value = input.nextInt();
        
        while (value != 0) {
            total += value;
            count2++;
            System.out.print("Enter a number: ");
            value = input.nextInt();
        }
        
        if (count2 > 0) {
            double average = (double) total / count2;
            System.out.println("Total: " + total);
            System.out.println("Count: " + count2);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
        System.out.println();
        
        // 5. Finding Maximum
        System.out.println("5. Finding Maximum:");
        System.out.println("------------------");
        System.out.println("Enter numbers to find maximum (enter -1 to stop):");
        int max = Integer.MIN_VALUE;
        int num;
        
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        while (num != -1) {
            if (num > max) {
                max = num;
            }
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        
        if (max != Integer.MIN_VALUE) {
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No numbers entered.");
        }
        System.out.println();
        
        // 6. Power Calculation
        System.out.println("6. Power Calculation:");
        System.out.println("---------------------");
        int base = 2;
        int exponent = 5;
        int result = 1;
        int power = exponent;
        
        System.out.println("Calculating " + base + "^" + exponent + ":");
        while (power > 0) {
            result *= base;
            power--;
            System.out.println("Intermediate result: " + result);
        }
        System.out.println("Final result: " + base + "^" + exponent + " = " + result);
        System.out.println();
        
        // 7. Factorial Calculation
        System.out.println("7. Factorial Calculation:");
        System.out.println("------------------------");
        int n = 5;
        long factorial = 1;
        int factNum = n;
        
        System.out.println("Calculating " + n + "!:");
        while (factNum > 0) {
            factorial *= factNum;
            System.out.println(factNum + "! = " + factorial);
            factNum--;
        }
        System.out.println("Final: " + n + "! = " + factorial);
        System.out.println();
        
        // 8. Character Processing
        System.out.println("8. Character Processing:");
        System.out.println("------------------------");
        String text = "Hello";
        int index = 0;
        
        System.out.println("Processing string: \"" + text + "\"");
        while (index < text.length()) {
            char ch = text.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
            index++;
        }
        System.out.println();
        
        // 9. Zero Iterations Example
        System.out.println("9. Zero Iterations Example:");
        System.out.println("---------------------------");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("Loop condition: x < 5");
        
        while (x < 5) {
            System.out.println("This won't execute");
            x++;
        }
        System.out.println("Loop didn't execute because condition was false initially");
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- While loop is a pretest loop");
        System.out.println("- Condition checked before each iteration");
        System.out.println("- May execute zero times");
        System.out.println("- Must update loop control variable inside loop");
    }
}

