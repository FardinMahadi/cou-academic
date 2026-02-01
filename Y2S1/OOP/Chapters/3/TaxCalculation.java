/**
 * TaxCalculation.java
 * 
 * Case study: Calculating income tax based on tax brackets.
 * 
 * This example demonstrates:
 * - Multi-way if-else statements
 * - Formatted output using printf
 * - Complex calculations
 * - Tax bracket logic
 * 
 * Key Concepts:
 * - Progressive tax brackets
 * - Formatted output
 * - Conditional logic for calculations
 */
import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Income Tax Calculation ===");
        System.out.println();
        
        // Tax brackets (simplified US tax brackets for 2023)
        // Bracket 1: 0 - $10,275 at 10%
        // Bracket 2: $10,276 - $41,775 at 12%
        // Bracket 3: $41,776 - $89,075 at 22%
        // Bracket 4: $89,076 - $190,750 at 24%
        // Bracket 5: $190,751+ at 32%
        
        System.out.print("Enter your taxable income: $");
        double income = input.nextDouble();
        
        double tax = 0;
        String bracket = "";
        
        // Calculate tax based on income bracket
        if (income <= 10275) {
            // Bracket 1: 10%
            tax = income * 0.10;
            bracket = "10%";
        } else if (income <= 41775) {
            // Bracket 2: 12%
            tax = 10275 * 0.10 + (income - 10275) * 0.12;
            bracket = "12%";
        } else if (income <= 89075) {
            // Bracket 3: 22%
            tax = 10275 * 0.10 + 
                  (41775 - 10275) * 0.12 + 
                  (income - 41775) * 0.22;
            bracket = "22%";
        } else if (income <= 190750) {
            // Bracket 4: 24%
            tax = 10275 * 0.10 + 
                  (41775 - 10275) * 0.12 + 
                  (89075 - 41775) * 0.22 + 
                  (income - 89075) * 0.24;
            bracket = "24%";
        } else {
            // Bracket 5: 32%
            tax = 10275 * 0.10 + 
                  (41775 - 10275) * 0.12 + 
                  (89075 - 41775) * 0.22 + 
                  (190750 - 89075) * 0.24 + 
                  (income - 190750) * 0.32;
            bracket = "32%";
        }
        
        double afterTaxIncome = income - tax;
        double effectiveRate = (tax / income) * 100;
        
        // Display results with formatted output
        System.out.println();
        System.out.println("=== Tax Calculation Results ===");
        System.out.println("-------------------------------");
        System.out.printf("Taxable Income:     $%,.2f\n", income);
        System.out.printf("Tax Bracket:        %s\n", bracket);
        System.out.printf("Tax Owed:           $%,.2f\n", tax);
        System.out.printf("After-Tax Income:   $%,.2f\n", afterTaxIncome);
        System.out.printf("Effective Tax Rate: %.2f%%\n", effectiveRate);
        System.out.println();
        
        // Show tax bracket breakdown
        System.out.println("Tax Bracket Breakdown:");
        System.out.println("--------------------");
        System.out.println("Bracket 1: $0 - $10,275 at 10%");
        System.out.println("Bracket 2: $10,276 - $41,775 at 12%");
        System.out.println("Bracket 3: $41,776 - $89,075 at 22%");
        System.out.println("Bracket 4: $89,076 - $190,750 at 24%");
        System.out.println("Bracket 5: $190,751+ at 32%");
        System.out.println();
        
        // Example calculations
        System.out.println("Example Calculations:");
        System.out.println("--------------------");
        
        double[] examples = {5000, 25000, 50000, 100000, 200000};
        
        System.out.printf("%-15s %-12s %-15s %-18s %-15s\n", 
                         "Income", "Bracket", "Tax", "After-Tax", "Effective Rate");
        System.out.println("----------------------------------------------------------------------------");
        
        for (double exampleIncome : examples) {
            double exampleTax = 0;
            String exampleBracket = "";
            
            if (exampleIncome <= 10275) {
                exampleTax = exampleIncome * 0.10;
                exampleBracket = "10%";
            } else if (exampleIncome <= 41775) {
                exampleTax = 10275 * 0.10 + (exampleIncome - 10275) * 0.12;
                exampleBracket = "12%";
            } else if (exampleIncome <= 89075) {
                exampleTax = 10275 * 0.10 + (41775 - 10275) * 0.12 + (exampleIncome - 41775) * 0.22;
                exampleBracket = "22%";
            } else if (exampleIncome <= 190750) {
                exampleTax = 10275 * 0.10 + (41775 - 10275) * 0.12 + 
                            (89075 - 41775) * 0.22 + (exampleIncome - 89075) * 0.24;
                exampleBracket = "24%";
            } else {
                exampleTax = 10275 * 0.10 + (41775 - 10275) * 0.12 + 
                            (89075 - 41775) * 0.22 + (190750 - 89075) * 0.24 + 
                            (exampleIncome - 190750) * 0.32;
                exampleBracket = "32%";
            }
            
            double exampleAfterTax = exampleIncome - exampleTax;
            double exampleEffective = (exampleTax / exampleIncome) * 100;
            
            System.out.printf("$%,10.2f    %-8s    $%,10.2f    $%,13.2f    %8.2f%%\n",
                           exampleIncome, exampleBracket, exampleTax, 
                           exampleAfterTax, exampleEffective);
        }
        System.out.println();
        
        input.close();
        System.out.println("=== Calculation Complete ===");
    }
}

