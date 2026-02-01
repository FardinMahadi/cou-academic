/**
 * LeapYear.java
 * 
 * Case study: Determining if a year is a leap year.
 * 
 * Rules for leap year:
 * - Divisible by 4, but not by 100, OR
 * - Divisible by 400
 * 
 * Key Concepts:
 * - Complex boolean expressions
 * - Logical operators
 * - Modulus operator
 */
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Leap Year Determination ===");
        System.out.println();
        
        // Test with multiple years
        int[] testYears = {2000, 2004, 1900, 2024, 2023, 2100};
        
        System.out.println("Testing multiple years:");
        System.out.println("----------------------");
        
        for (int year : testYears) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            
            System.out.print("Year " + year + ": ");
            if (isLeapYear) {
                System.out.println("LEAP YEAR");
            } else {
                System.out.println("Not a leap year");
            }
        }
        System.out.println();
        
        // Interactive version
        System.out.println("Interactive Version:");
        System.out.println("--------------------");
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        // Check if divisible by 4
        boolean divisibleBy4 = (year % 4 == 0);
        
        // Check if divisible by 100
        boolean divisibleBy100 = (year % 100 == 0);
        
        // Check if divisible by 400
        boolean divisibleBy400 = (year % 400 == 0);
        
        // Leap year condition
        boolean isLeapYear = (divisibleBy4 && !divisibleBy100) || divisibleBy400;
        
        System.out.println();
        System.out.println("Year: " + year);
        System.out.println("Divisible by 4: " + divisibleBy4);
        System.out.println("Divisible by 100: " + divisibleBy100);
        System.out.println("Divisible by 400: " + divisibleBy400);
        System.out.println();
        
        if (isLeapYear) {
            System.out.println(year + " is a LEAP YEAR");
            System.out.println("February has 29 days");
        } else {
            System.out.println(year + " is NOT a leap year");
            System.out.println("February has 28 days");
        }
        System.out.println();
        
        // Explanation
        System.out.println("Explanation:");
        System.out.println("-----------");
        if (divisibleBy400) {
            System.out.println("  - Divisible by 400 → Always a leap year");
        } else if (divisibleBy4 && !divisibleBy100) {
            System.out.println("  - Divisible by 4 but not by 100 → Leap year");
        } else if (divisibleBy100) {
            System.out.println("  - Divisible by 100 but not by 400 → Not a leap year");
        } else {
            System.out.println("  - Not divisible by 4 → Not a leap year");
        }
        System.out.println();
        
        // Historical context
        System.out.println("Historical Examples:");
        System.out.println("-------------------");
        System.out.println("2000: Leap year (divisible by 400)");
        System.out.println("1900: Not a leap year (divisible by 100 but not 400)");
        System.out.println("2004: Leap year (divisible by 4, not by 100)");
        System.out.println("2100: Not a leap year (divisible by 100 but not 400)");
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
    }
}

