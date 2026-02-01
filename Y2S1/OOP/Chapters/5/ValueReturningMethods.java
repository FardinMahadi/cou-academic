/**
 * ValueReturningMethods.java
 * 
 * Demonstrates value-returning methods.
 * 
 * Key Concepts:
 * - Methods that return values
 * - Return statement
 * - Using return values
 * - Different return types
 */
public class ValueReturningMethods {
    public static void main(String[] args) {
        System.out.println("=== Value-Returning Methods ===");
        System.out.println();
        
        // Integer return type
        System.out.println("1. Integer Return Type:");
        System.out.println("----------------------");
        int square = square(5);
        System.out.println("Square of 5: " + square);
        System.out.println();
        
        // Double return type
        System.out.println("2. Double Return Type:");
        System.out.println("---------------------");
        double average = calculateAverage(10, 20, 30);
        System.out.println("Average of 10, 20, 30: " + average);
        System.out.println();
        
        // Boolean return type
        System.out.println("3. Boolean Return Type:");
        System.out.println("----------------------");
        boolean isEven = isEven(8);
        System.out.println("Is 8 even? " + isEven);
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println();
        
        // String return type
        System.out.println("4. String Return Type:");
        System.out.println("----------------------");
        String greeting = getGreeting("Java");
        System.out.println(greeting);
        System.out.println();
        
        // Using return value in condition
        System.out.println("5. Using Return Value in Condition:");
        System.out.println("----------------------------------");
        int number = 15;
        if (isEven(number)) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        System.out.println();
        
        // Multiple return statements
        System.out.println("6. Multiple Return Statements:");
        System.out.println("-----------------------------");
        int max = getMax(10, 20);
        System.out.println("Max of 10 and 20: " + max);
        System.out.println("Max of 30 and 15: " + getMax(30, 15));
        System.out.println();
        
        // Return in expression
        System.out.println("7. Return in Expression:");
        System.out.println("------------------------");
        int result = square(3) + square(4);
        System.out.println("square(3) + square(4) = " + result);
        System.out.println();
        
        // Early return
        System.out.println("8. Early Return:");
        System.out.println("----------------");
        int value = 5;
        String sign = getSign(value);
        System.out.println("Sign of " + value + ": " + sign);
        System.out.println("Sign of -3: " + getSign(-3));
        System.out.println("Sign of 0: " + getSign(0));
        System.out.println();
    }
    
    /**
     * Returns the square of a number
     */
    public static int square(int number) {
        return number * number;
    }
    
    /**
     * Calculates and returns the average of three numbers
     */
    public static double calculateAverage(int a, int b, int c) {
        double sum = a + b + c;
        return sum / 3.0;  // Use 3.0 for double division
    }
    
    /**
     * Returns true if number is even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Returns a greeting message
     */
    public static String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to Java programming.";
    }
    
    /**
     * Returns the maximum of two numbers
     * Demonstrates multiple return statements
     */
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;  // First return
        } else {
            return b;  // Second return
        }
    }
    
    /**
     * Returns the sign of a number as a string
     * Demonstrates early return
     */
    public static String getSign(int number) {
        if (number > 0) {
            return "Positive";
        }
        if (number < 0) {
            return "Negative";
        }
        return "Zero";  // Default return
    }
}

