/**
 * MathClassExamples.java
 * 
 * Demonstrates common methods from the Math class.
 * 
 * Key Concepts:
 * - Math.pow() - power
 * - Math.sqrt() - square root
 * - Math.abs() - absolute value
 * - Math.max() / Math.min() - maximum/minimum
 * - Math.random() - random numbers
 * - Math.round() / Math.ceil() / Math.floor() - rounding
 * - Math.PI and Math.E - constants
 */
public class MathClassExamples {
    public static void main(String[] args) {
        System.out.println("=== Math Class Examples ===");
        System.out.println();
        
        // Math.pow() - Power
        System.out.println("1. Math.pow() - Power:");
        System.out.println("---------------------");
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.println("5^2 = " + Math.pow(5, 2));
        System.out.println("10^0.5 = " + Math.pow(10, 0.5));
        System.out.println();
        
        // Math.sqrt() - Square Root
        System.out.println("2. Math.sqrt() - Square Root:");
        System.out.println("----------------------------");
        System.out.println("sqrt(16) = " + Math.sqrt(16));
        System.out.println("sqrt(25) = " + Math.sqrt(25));
        System.out.println("sqrt(2) = " + Math.sqrt(2));
        System.out.println();
        
        // Math.abs() - Absolute Value
        System.out.println("3. Math.abs() - Absolute Value:");
        System.out.println("------------------------------");
        System.out.println("abs(-5) = " + Math.abs(-5));
        System.out.println("abs(5) = " + Math.abs(5));
        System.out.println("abs(-3.7) = " + Math.abs(-3.7));
        System.out.println();
        
        // Math.max() and Math.min()
        System.out.println("4. Math.max() and Math.min():");
        System.out.println("----------------------------");
        System.out.println("max(10, 20) = " + Math.max(10, 20));
        System.out.println("min(10, 20) = " + Math.min(10, 20));
        System.out.println("max(5.5, 3.2) = " + Math.max(5.5, 3.2));
        System.out.println();
        
        // Math.random() - Random Numbers
        System.out.println("5. Math.random() - Random Numbers:");
        System.out.println("---------------------------------");
        System.out.println("Random number [0.0, 1.0): " + Math.random());
        System.out.println("Random number [0.0, 1.0): " + Math.random());
        System.out.println();
        
        // Random integers
        System.out.println("6. Random Integers:");
        System.out.println("------------------");
        // Random integer from 0 to 9
        int random1 = (int)(Math.random() * 10);
        System.out.println("Random integer [0, 9]: " + random1);
        
        // Random integer from 1 to 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("Random integer [1, 10]: " + random2);
        
        // Random integer from 5 to 15
        int random3 = (int)(Math.random() * 11) + 5;
        System.out.println("Random integer [5, 15]: " + random3);
        System.out.println();
        
        // Math.round(), Math.ceil(), Math.floor()
        System.out.println("7. Rounding Functions:");
        System.out.println("---------------------");
        double num1 = 3.7;
        double num2 = 3.2;
        double num3 = -3.7;
        
        System.out.println("Number: " + num1);
        System.out.println("  round: " + Math.round(num1));
        System.out.println("  ceil: " + Math.ceil(num1));
        System.out.println("  floor: " + Math.floor(num1));
        
        System.out.println("Number: " + num2);
        System.out.println("  round: " + Math.round(num2));
        System.out.println("  ceil: " + Math.ceil(num2));
        System.out.println("  floor: " + Math.floor(num2));
        
        System.out.println("Number: " + num3);
        System.out.println("  round: " + Math.round(num3));
        System.out.println("  ceil: " + Math.ceil(num3));
        System.out.println("  floor: " + Math.floor(num3));
        System.out.println();
        
        // Math.PI and Math.E
        System.out.println("8. Constants:");
        System.out.println("------------");
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
        System.out.println();
        
        // Practical examples
        System.out.println("9. Practical Examples:");
        System.out.println("---------------------");
        
        // Circle area
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle with radius " + radius + ":");
        System.out.println("  Area = π × r² = " + area);
        
        // Distance between points
        double x1 = 0, y1 = 0;
        double x2 = 3, y2 = 4;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between (0,0) and (3,4): " + distance);
        
        // Hypotenuse
        double a = 3.0, b = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse of triangle with sides " + a + " and " + b + ": " + hypotenuse);
        System.out.println();
        
        // Random number generation examples
        System.out.println("10. Random Number Generation Examples:");
        System.out.println("-------------------------------------");
        System.out.println("10 random integers [1, 100]:");
        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random() * 100) + 1;
            System.out.print(random + " ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

