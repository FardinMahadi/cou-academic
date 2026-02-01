/**
 * MethodOverloading.java
 * 
 * Demonstrates method overloading - multiple methods with same name
 * but different parameter lists.
 * 
 * Key Concepts:
 * - Method overloading
 * - Different number of parameters
 * - Different types of parameters
 * - Method resolution
 */
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading ===");
        System.out.println();
        
        // Overloading with different number of parameters
        System.out.println("1. Different Number of Parameters:");
        System.out.println("----------------------------------");
        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("add(5, 3, 2) = " + add(5, 3, 2));
        System.out.println("add(1, 2, 3, 4) = " + add(1, 2, 3, 4));
        System.out.println();
        
        // Overloading with different types
        System.out.println("2. Different Types:");
        System.out.println("------------------");
        System.out.println("square(5) = " + square(5));
        System.out.println("square(5.5) = " + square(5.5));
        System.out.println();
        
        // Overloading with different parameter order
        System.out.println("3. Different Parameter Order:");
        System.out.println("----------------------------");
        printInfo("Alice", 25);
        printInfo(30, "Bob");
        System.out.println();
        
        // Overloading with mixed types
        System.out.println("4. Mixed Types:");
        System.out.println("-------------");
        System.out.println("multiply(5, 3) = " + multiply(5, 3));
        System.out.println("multiply(5.5, 3.2) = " + multiply(5.5, 3.2));
        System.out.println("multiply(5, 3.5) = " + multiply(5, 3.5));
        System.out.println();
        
        // Max method overloading
        System.out.println("5. Max Method Overloading:");
        System.out.println("--------------------------");
        System.out.println("max(10, 20) = " + max(10, 20));
        System.out.println("max(10.5, 20.3) = " + max(10.5, 20.3));
        System.out.println("max(10, 20, 15) = " + max(10, 20, 15));
        System.out.println();
    }
    
    /**
     * Adds two integers
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Adds three integers
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    /**
     * Adds four integers
     */
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    /**
     * Squares an integer
     */
    public static int square(int x) {
        return x * x;
    }
    
    /**
     * Squares a double
     */
    public static double square(double x) {
        return x * x;
    }
    
    /**
     * Prints name and age (String, int)
     */
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    /**
     * Prints age and name (int, String) - different order
     */
    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
    
    /**
     * Multiplies two integers
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Multiplies two doubles
     */
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Multiplies int and double (returns double)
     */
    public static double multiply(int a, double b) {
        return a * b;
    }
    
    /**
     * Returns maximum of two integers
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    
    /**
     * Returns maximum of two doubles
     */
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
    
    /**
     * Returns maximum of three integers
     */
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}

