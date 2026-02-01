/**
 * ScannerInput.java
 * 
 * Demonstrates console input using the Scanner class.
 * 
 * Key Concepts:
 * - Importing Scanner
 * - Creating Scanner object
 * - Reading different data types
 * - Handling input
 * - Closing Scanner
 */
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        // Create a Scanner object to read from console
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Scanner Input Demonstration ===");
        System.out.println();
        
        // Reading different data types
        System.out.println("Reading Different Data Types:");
        System.out.println("------------------------------");
        
        // Reading integer
        System.out.print("Enter an integer: ");
        int intValue = input.nextInt();
        System.out.println("You entered: " + intValue);
        System.out.println();
        
        // Reading double
        System.out.print("Enter a decimal number: ");
        double doubleValue = input.nextDouble();
        System.out.println("You entered: " + doubleValue);
        System.out.println();
        
        // Reading string (single word)
        System.out.print("Enter a word: ");
        String word = input.next();  // Reads until whitespace
        System.out.println("You entered: " + word);
        System.out.println();
        
        // Consume the remaining newline character
        input.nextLine();
        
        // Reading string (entire line)
        System.out.print("Enter a full sentence: ");
        String sentence = input.nextLine();  // Reads entire line
        System.out.println("You entered: " + sentence);
        System.out.println();
        
        // Reading character (workaround - read string and take first char)
        System.out.print("Enter a single character: ");
        String charInput = input.next();
        char charValue = charInput.charAt(0);
        System.out.println("You entered: " + charValue);
        System.out.println();
        
        // Reading boolean
        System.out.print("Enter true or false: ");
        boolean boolValue = input.nextBoolean();
        System.out.println("You entered: " + boolValue);
        System.out.println();
        
        // Example: Reading multiple values
        System.out.println("Example: Student Information");
        System.out.println("----------------------------");
        System.out.print("Enter student name: ");
        input.nextLine();  // Consume newline
        String name = input.nextLine();
        
        System.out.print("Enter student age: ");
        int age = input.nextInt();
        
        System.out.print("Enter student GPA: ");
        double gpa = input.nextDouble();
        
        System.out.println();
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println();
        
        // Important: Always close Scanner when done
        input.close();
        
        System.out.println("=== Demonstration Complete ===");
        System.out.println("Note: Scanner has been closed.");
    }
}

