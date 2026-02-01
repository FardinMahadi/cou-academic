/**
 * Operators.java
 * 
 * Demonstrates various operators in Java: arithmetic, shorthand, increment/decrement.
 * 
 * Key Concepts:
 * - Arithmetic operators (+, -, *, /, %)
 * - Shorthand operators (+=, -=, *=, /=, %=)
 * - Increment/decrement operators (++, --)
 * - Operator precedence
 */
public class Operators {
    public static void main(String[] args) {
        System.out.println("=== Java Operators ===");
        System.out.println();
        
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("---------------------");
        int a = 10;
        int b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));      // Addition: 13
        System.out.println("a - b = " + (a - b));      // Subtraction: 7
        System.out.println("a * b = " + (a * b));       // Multiplication: 30
        System.out.println("a / b = " + (a / b));       // Division: 3 (integer division)
        System.out.println("a % b = " + (a % b));       // Modulus: 1 (remainder)
        System.out.println();
        
        // Floating-point division
        System.out.println("Floating-Point Division:");
        System.out.println("------------------------");
        double x = 10.0;
        double y = 3.0;
        System.out.println("x / y = " + (x / y));       // Result: 3.333...
        System.out.println();
        
        // Shorthand Operators
        System.out.println("Shorthand Operators:");
        System.out.println("--------------------");
        int num = 10;
        System.out.println("Initial value: " + num);
        
        num += 5;  // Equivalent to: num = num + 5
        System.out.println("After num += 5: " + num);  // 15
        
        num -= 3;  // Equivalent to: num = num - 3
        System.out.println("After num -= 3: " + num);  // 12
        
        num *= 2;  // Equivalent to: num = num * 2
        System.out.println("After num *= 2: " + num);  // 24
        
        num /= 4;  // Equivalent to: num = num / 4
        System.out.println("After num /= 4: " + num);  // 6
        
        num %= 4;  // Equivalent to: num = num % 4
        System.out.println("After num %= 4: " + num);  // 2
        System.out.println();
        
        // Increment and Decrement Operators
        System.out.println("Increment/Decrement Operators:");
        System.out.println("------------------------------");
        int value = 5;
        System.out.println("Initial value: " + value);
        
        // Post-increment
        System.out.println("value++ (post-increment): " + value++);  // Prints 5, then value becomes 6
        System.out.println("Value after post-increment: " + value);   // 6
        
        // Pre-increment
        System.out.println("++value (pre-increment): " + ++value);   // value becomes 7, prints 7
        System.out.println("Value after pre-increment: " + value);     // 7
        
        // Post-decrement
        System.out.println("value-- (post-decrement): " + value--);  // Prints 7, then value becomes 6
        System.out.println("Value after post-decrement: " + value);   // 6
        
        // Pre-decrement
        System.out.println("--value (pre-decrement): " + --value);   // value becomes 5, prints 5
        System.out.println("Value after pre-decrement: " + value);     // 5
        System.out.println();
        
        // Operator Precedence
        System.out.println("Operator Precedence:");
        System.out.println("--------------------");
        int result1 = 2 + 3 * 4;           // Multiplication first: 2 + 12 = 14
        int result2 = (2 + 3) * 4;          // Parentheses first: 5 * 4 = 20
        int result3 = 10 - 4 / 2;           // Division first: 10 - 2 = 8
        int result4 = (10 - 4) / 2;         // Parentheses first: 6 / 2 = 3
        
        System.out.println("2 + 3 * 4 = " + result1);
        System.out.println("(2 + 3) * 4 = " + result2);
        System.out.println("10 - 4 / 2 = " + result3);
        System.out.println("(10 - 4) / 2 = " + result4);
        System.out.println();
        
        // Complex expression
        System.out.println("Complex Expression:");
        System.out.println("-------------------");
        int result5 = 5 + 3 * 2 - 8 / 4;    // Order: *, /, +, -
        // Step 1: 3 * 2 = 6, 8 / 4 = 2
        // Step 2: 5 + 6 - 2 = 9
        System.out.println("5 + 3 * 2 - 8 / 4 = " + result5);
        System.out.println();
        
        // Modulus operator examples
        System.out.println("Modulus Operator Examples:");
        System.out.println("-------------------------");
        System.out.println("10 % 3 = " + (10 % 3));        // 1
        System.out.println("15 % 4 = " + (15 % 4));        // 3
        System.out.println("20 % 5 = " + (20 % 5));        // 0 (divisible)
        System.out.println("7 % 2 = " + (7 % 2));          // 1 (odd number)
        System.out.println("8 % 2 = " + (8 % 2));          // 0 (even number)
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

