/**
 * ForLoop.java
 * 
 * Demonstrates for loop in Java.
 * 
 * Key Concepts:
 * - For loop syntax
 * - Count-controlled loops
 * - Initialization, condition, update
 * - Different counting patterns
 * - Enhanced for loop (for-each)
 */
public class ForLoop {
    public static void main(String[] args) {
        System.out.println("=== For Loop Demonstration ===");
        System.out.println();
        
        // 1. Basic For Loop
        System.out.println("1. Basic For Loop:");
        System.out.println("------------------");
        System.out.println("Counting from 0 to 9:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 2. Counting Up
        System.out.println("2. Counting Up:");
        System.out.println("---------------");
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 3. Counting Down
        System.out.println("3. Counting Down:");
        System.out.println("----------------");
        System.out.println("Countdown from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast off!");
        System.out.println();
        
        // 4. Step Size
        System.out.println("4. Step Size:");
        System.out.println("-------------");
        System.out.println("Even numbers from 0 to 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Multiples of 5 from 0 to 50:");
        for (int i = 0; i <= 50; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 5. Sum of Numbers
        System.out.println("5. Sum of Numbers:");
        System.out.println("------------------");
        int sum = 0;
        System.out.println("Summing numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        System.out.println();
        
        // 6. Factorial
        System.out.println("6. Factorial:");
        System.out.println("-------------");
        int n = 5;
        long factorial = 1;
        System.out.println("Calculating " + n + "!:");
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(i + "! = " + factorial);
        }
        System.out.println("Final: " + n + "! = " + factorial);
        System.out.println();
        
        // 7. Multiple Variables
        System.out.println("7. Multiple Variables:");
        System.out.println("----------------------");
        System.out.println("Using multiple variables in for loop:");
        for (int i = 0, j = 10; i < 10; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println();
        
        // 8. Nested For Loop Preview
        System.out.println("8. Nested For Loop Preview:");
        System.out.println("---------------------------");
        System.out.println("Multiplication table (5x5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println();
        
        // 9. Enhanced For Loop (For-Each)
        System.out.println("9. Enhanced For Loop (For-Each):");
        System.out.println("---------------------------------");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        // 10. Character Loop
        System.out.println("10. Character Loop:");
        System.out.println("-------------------");
        System.out.println("Alphabet from A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println();
        
        // 11. Conditional Break in For Loop
        System.out.println("11. Conditional Break in For Loop:");
        System.out.println("-----------------------------------");
        System.out.println("Numbers from 1 to 20 (stop at 15):");
        for (int i = 1; i <= 20; i++) {
            if (i > 15) {
                break;  // Exit loop
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 12. Continue in For Loop
        System.out.println("12. Continue in For Loop:");
        System.out.println("------------------------");
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 13. Empty For Loop Body
        System.out.println("13. Empty For Loop Body:");
        System.out.println("------------------------");
        int count = 0;
        for (int i = 0; i < 10; i++, count++);  // Empty body
        System.out.println("Count after empty loop: " + count);
        System.out.println();
        
        // 14. For Loop Components Explained
        System.out.println("14. For Loop Components:");
        System.out.println("------------------------");
        System.out.println("for (initialization; condition; update) {");
        System.out.println("    // body");
        System.out.println("}");
        System.out.println();
        System.out.println("Example:");
        System.out.println("for (int i = 0;    i < 10;    i++) {");
        System.out.println("     ^              ^          ^");
        System.out.println("  initialization  condition  update");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- For loop combines initialization, condition, and update");
        System.out.println("- Ideal for count-controlled loops");
        System.out.println("- Can use multiple variables");
        System.out.println("- Enhanced for loop (for-each) for arrays/collections");
    }
}

