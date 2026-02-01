/**
 * DoWhileLoop.java
 * 
 * Demonstrates do-while loop in Java.
 * 
 * Key Concepts:
 * - Do-while loop syntax
 * - Posttest loop (condition checked after execution)
 * - Always executes at least once
 * - Useful for input validation
 */
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Do-While Loop Demonstration ===");
        System.out.println();
        
        // 1. Basic Do-While Loop
        System.out.println("1. Basic Do-While Loop:");
        System.out.println("----------------------");
        int count = 0;
        System.out.println("Counting from 0 to 4:");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);
        System.out.println("Loop finished. Final count: " + count);
        System.out.println();
        
        // 2. Always Executes At Least Once
        System.out.println("2. Always Executes At Least Once:");
        System.out.println("--------------------------------");
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("Loop condition: x < 5");
        
        do {
            System.out.println("This executes once even though condition is false!");
            x++;
        } while (x < 5);
        System.out.println("Note: Loop executed once before checking condition");
        System.out.println();
        
        // 3. Menu-Driven Program
        System.out.println("3. Menu-Driven Program:");
        System.out.println("----------------------");
        int choice;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        } while (choice != 0);
        System.out.println();
        
        // 4. Input Validation
        System.out.println("4. Input Validation:");
        System.out.println("--------------------");
        int age;
        do {
            System.out.print("Enter your age (must be 18 or older): ");
            age = input.nextInt();
            if (age < 18) {
                System.out.println("Invalid age! Must be 18 or older.");
            }
        } while (age < 18);
        
        System.out.println("Age accepted: " + age);
        System.out.println();
        
        // 5. Positive Number Input
        System.out.println("5. Positive Number Input:");
        System.out.println("------------------------");
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = input.nextInt();
            if (number <= 0) {
                System.out.println("Invalid! Number must be positive.");
            }
        } while (number <= 0);
        
        System.out.println("Valid number entered: " + number);
        System.out.println();
        
        // 6. Sum Until Negative
        System.out.println("6. Sum Until Negative:");
        System.out.println("----------------------");
        int sum = 0;
        int value;
        
        do {
            System.out.print("Enter a number (negative to stop): ");
            value = input.nextInt();
            if (value >= 0) {
                sum += value;
                System.out.println("Current sum: " + sum);
            }
        } while (value >= 0);
        
        System.out.println("Final sum: " + sum);
        System.out.println();
        
        // 7. Password Validation
        System.out.println("7. Password Validation:");
        System.out.println("----------------------");
        String password;
        String correctPassword = "secret123";
        
        do {
            System.out.print("Enter password: ");
            password = input.next();
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password! Try again.");
            }
        } while (!password.equals(correctPassword));
        
        System.out.println("Password correct! Access granted.");
        System.out.println();
        
        // 8. Range Validation
        System.out.println("8. Range Validation:");
        System.out.println("--------------------");
        int score;
        do {
            System.out.print("Enter test score (0-100): ");
            score = input.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score! Must be between 0 and 100.");
            }
        } while (score < 0 || score > 100);
        
        System.out.println("Valid score entered: " + score);
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- Do-while loop is a posttest loop");
        System.out.println("- Condition checked after each iteration");
        System.out.println("- Always executes at least once");
        System.out.println("- Ideal for input validation and menu-driven programs");
    }
}

