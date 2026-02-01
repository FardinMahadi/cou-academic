/**
 * IfStatements.java
 * 
 * Demonstrates different types of if statements in Java.
 * 
 * Key Concepts:
 * - One-way if statement
 * - Two-way if-else statement
 * - Multi-way if-else statement
 * - Nested if statements
 */
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== If Statements Demonstration ===");
        System.out.println();
        
        // 1. One-Way If Statement
        System.out.println("1. One-Way If Statement:");
        System.out.println("------------------------");
        int score = 85;
        System.out.println("Score: " + score);
        
        if (score >= 60) {
            System.out.println("You passed!");
        }
        System.out.println("(Statement continues regardless)");
        System.out.println();
        
        // 2. Two-Way If-Else Statement
        System.out.println("2. Two-Way If-Else Statement:");
        System.out.println("-----------------------------");
        int temperature = 75;
        System.out.println("Temperature: " + temperature + "°F");
        
        if (temperature >= 70) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cool outside!");
        }
        System.out.println();
        
        // 3. Multi-Way If-Else Statement
        System.out.println("3. Multi-Way If-Else Statement:");
        System.out.println("-------------------------------");
        int testScore = 85;
        System.out.println("Test Score: " + testScore);
        
        if (testScore >= 90) {
            System.out.println("Grade: A");
        } else if (testScore >= 80) {
            System.out.println("Grade: B");
        } else if (testScore >= 70) {
            System.out.println("Grade: C");
        } else if (testScore >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();
        
        // 4. Nested If Statements
        System.out.println("4. Nested If Statements:");
        System.out.println("------------------------");
        int age = 20;
        boolean hasLicense = true;
        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);
        
        if (age >= 18) {
            System.out.println("You are an adult.");
            if (hasLicense) {
                System.out.println("You can drive!");
            } else {
                System.out.println("You need a license to drive.");
            }
        } else {
            System.out.println("You are a minor.");
            if (age >= 16) {
                System.out.println("You can get a learner's permit.");
            } else {
                System.out.println("You're too young to drive.");
            }
        }
        System.out.println();
        
        // 5. Complex Condition Example
        System.out.println("5. Complex Conditions:");
        System.out.println("----------------------");
        int number = 15;
        System.out.println("Number: " + number);
        
        if (number > 0 && number < 10) {
            System.out.println("Single digit positive number");
        } else if (number >= 10 && number < 100) {
            System.out.println("Two-digit number");
        } else if (number >= 100) {
            System.out.println("Three or more digit number");
        } else {
            System.out.println("Negative or zero");
        }
        System.out.println();
        
        // 6. Common Pitfall: Assignment vs Comparison
        System.out.println("6. Common Pitfall - Assignment vs Comparison:");
        System.out.println("-----------------------------------------------");
        int x = 5;
        System.out.println("x = " + x);
        
        // WRONG: This is assignment, not comparison!
        // if (x = 10) {  // This would be a compile error
        //     System.out.println("x is 10");
        // }
        
        // CORRECT: Use == for comparison
        if (x == 10) {
            System.out.println("x is 10");
        } else {
            System.out.println("x is not 10");
        }
        System.out.println();
        
        // 7. Real-world Example: Age Verification
        System.out.println("7. Real-world Example - Age Verification:");
        System.out.println("-----------------------------------------");
        int userAge = 25;
        boolean hasID = true;
        System.out.println("Age: " + userAge);
        System.out.println("Has ID: " + hasID);
        
        if (userAge >= 21) {
            if (hasID) {
                System.out.println("Access granted: You can enter the bar.");
            } else {
                System.out.println("Access denied: ID required.");
            }
        } else if (userAge >= 18) {
            System.out.println("Access granted: You can enter (no alcohol).");
        } else {
            System.out.println("Access denied: You are too young.");
        }
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
    }
}

