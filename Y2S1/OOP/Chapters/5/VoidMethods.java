/**
 * VoidMethods.java
 * 
 * Demonstrates void methods (methods that don't return values).
 * 
 * Key Concepts:
 * - Void methods perform actions
 * - No return value
 * - Early return with return;
 */
public class VoidMethods {
    public static void main(String[] args) {
        System.out.println("=== Void Methods ===");
        System.out.println();
        
        // Simple void method
        System.out.println("1. Simple Void Method:");
        System.out.println("---------------------");
        printMessage("Hello, World!");
        System.out.println();
        
        // Void method with parameters
        System.out.println("2. Void Method with Parameters:");
        System.out.println("------------------------------");
        printSum(5, 3);
        printSum(10, 20);
        System.out.println();
        
        // Void method with multiple parameters
        System.out.println("3. Void Method with Multiple Parameters:");
        System.out.println("----------------------------------------");
        printInfo("Alice", 25, 3.8);
        printInfo("Bob", 30, 3.5);
        System.out.println();
        
        // Void method with early return
        System.out.println("4. Void Method with Early Return:");
        System.out.println("--------------------------------");
        printPositive(5);
        printPositive(-3);  // Won't print
        printPositive(0);   // Won't print
        System.out.println();
        
        // Void method that modifies output
        System.out.println("5. Void Method for Formatting:");
        System.out.println("------------------------------");
        printFormatted("Java Programming", 20);
        printFormatted("Methods", 15);
        System.out.println();
        
        // Multiple void method calls
        System.out.println("6. Multiple Void Method Calls:");
        System.out.println("------------------------------");
        printHeader("Student Information");
        printInfo("Charlie", 22, 3.9);
        printFooter();
        System.out.println();
    }
    
    /**
     * Prints a message
     * @param message The message to print
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }
    
    /**
     * Prints the sum of two numbers
     * @param a First number
     * @param b Second number
     */
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
    
    /**
     * Prints student information
     * @param name Student name
     * @param age Student age
     * @param gpa Student GPA
     */
    public static void printInfo(String name, int age, double gpa) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    
    /**
     * Prints number only if positive
     * Demonstrates early return in void method
     * @param number The number to check and print
     */
    public static void printPositive(int number) {
        if (number <= 0) {
            return;  // Exit early, don't print
        }
        System.out.println("Positive number: " + number);
    }
    
    /**
     * Prints formatted text with specified width
     * @param text The text to print
     * @param width The width for formatting
     */
    public static void printFormatted(String text, int width) {
        System.out.print("| ");
        System.out.print(text);
        // Add spaces to reach width
        for (int i = text.length(); i < width; i++) {
            System.out.print(" ");
        }
        System.out.println(" |");
    }
    
    /**
     * Prints a header line
     * @param title The title for the header
     */
    public static void printHeader(String title) {
        System.out.println("=================================");
        System.out.println("  " + title);
        System.out.println("=================================");
    }
    
    /**
     * Prints a footer line
     */
    public static void printFooter() {
        System.out.println("=================================");
    }
}

