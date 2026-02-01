/**
 * MethodBasics.java
 * 
 * Demonstrates basic method definition and invocation.
 * 
 * Key Concepts:
 * - Method definition syntax
 * - Method invocation
 * - Method components (header, body, parameters, return)
 */
public class MethodBasics {
    
    /**
     * Main method - entry point of the program
     */
    public static void main(String[] args) {
        System.out.println("=== Method Basics ===");
        System.out.println();
        
        // Calling a simple method
        System.out.println("1. Calling a Simple Method:");
        System.out.println("---------------------------");
        greet();  // Method invocation
        System.out.println();
        
        // Calling method with parameters
        System.out.println("2. Calling Method with Parameters:");
        System.out.println("----------------------------------");
        greetPerson("Alice");
        greetPerson("Bob");
        System.out.println();
        
        // Calling method that returns a value
        System.out.println("3. Calling Method that Returns Value:");
        System.out.println("------------------------------------");
        int sum = add(5, 3);
        System.out.println("Sum of 5 and 3: " + sum);
        System.out.println();
        
        // Using return value directly
        System.out.println("4. Using Return Value Directly:");
        System.out.println("-------------------------------");
        System.out.println("Product of 4 and 7: " + multiply(4, 7));
        System.out.println();
        
        // Multiple method calls
        System.out.println("5. Multiple Method Calls:");
        System.out.println("-------------------------");
        int a = 10;
        int b = 20;
        int result = add(a, b);
        System.out.println(a + " + " + b + " = " + result);
        System.out.println();
        
        // Method call in expression
        System.out.println("6. Method Call in Expression:");
        System.out.println("----------------------------");
        int total = add(5, 3) + multiply(2, 4);
        System.out.println("add(5, 3) + multiply(2, 4) = " + total);
        System.out.println();
    }
    
    /**
     * Simple void method with no parameters
     * Modifier: public static
     * Return type: void (returns nothing)
     * Method name: greet
     * Parameters: none
     */
    public static void greet() {
        System.out.println("Hello, World!");
    }
    
    /**
     * Void method with one parameter
     * @param name The name to greet
     */
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    /**
     * Value-returning method with two parameters
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;  // Return statement
    }
    
    /**
     * Value-returning method
     * @param x First number
     * @param y Second number
     * @return Product of x and y
     */
    public static int multiply(int x, int y) {
        int product = x * y;  // Local variable
        return product;
    }
}

