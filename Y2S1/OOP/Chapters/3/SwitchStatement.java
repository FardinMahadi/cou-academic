/**
 * SwitchStatement.java
 * 
 * Demonstrates switch statements in Java.
 * 
 * Key Concepts:
 * - Basic switch statement
 * - Break statement
 * - Default case
 * - Fall-through behavior
 * - Switch with strings
 */
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Switch Statement Demonstration ===");
        System.out.println();
        
        // 1. Basic Switch Statement
        System.out.println("1. Basic Switch Statement:");
        System.out.println("--------------------------");
        int day = 3;
        System.out.println("Day number: " + day);
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();
        
        // 2. Switch Without Break (Fall-through)
        System.out.println("2. Switch Without Break (Fall-through):");
        System.out.println("----------------------------------------");
        int month = 2;
        System.out.println("Month: " + month);
        
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println();
        
        // 3. Switch with Characters
        System.out.println("3. Switch with Characters:");
        System.out.println("--------------------------");
        char grade = 'B';
        System.out.println("Grade: " + grade);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below average");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println();
        
        // 4. Switch with Strings (Java 7+)
        System.out.println("4. Switch with Strings:");
        System.out.println("-----------------------");
        String dayName = "Friday";
        System.out.println("Day name: " + dayName);
        
        switch (dayName) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("Weekday");
                break;
            case "Friday":
                System.out.println("TGIF! (Weekday but almost weekend)");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day name");
        }
        System.out.println();
        
        // 5. Menu Selection Example
        System.out.println("5. Menu Selection Example:");
        System.out.println("--------------------------");
        int choice = 2;
        System.out.println("Menu choice: " + choice);
        
        switch (choice) {
            case 1:
                System.out.println("You selected: Create new file");
                break;
            case 2:
                System.out.println("You selected: Open file");
                break;
            case 3:
                System.out.println("You selected: Save file");
                break;
            case 4:
                System.out.println("You selected: Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println();
        
        // 6. Calculator Example
        System.out.println("6. Calculator Example:");
        System.out.println("----------------------");
        char operator = '+';
        double num1 = 10;
        double num2 = 5;
        System.out.println("Operation: " + num1 + " " + operator + " " + num2);
        
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println();
        
        // 7. Demonstrating Importance of Break
        System.out.println("7. Demonstrating Importance of Break:");
        System.out.println("-------------------------------------");
        int value = 1;
        System.out.println("Value: " + value);
        System.out.println("Without break statements:");
        
        switch (value) {
            case 1:
                System.out.println("Case 1 executed");
                // Missing break - falls through!
            case 2:
                System.out.println("Case 2 executed");
                // Missing break - falls through!
            case 3:
                System.out.println("Case 3 executed");
                break;
            default:
                System.out.println("Default case");
        }
        System.out.println("Note: All cases executed until break!");
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
    }
}

