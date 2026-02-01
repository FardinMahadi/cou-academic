/**
 * FutureTuition.java
 * 
 * Case study: Predicting when tuition will double.
 * 
 * Problem: Given current tuition and annual increase rate,
 * calculate how many years until tuition doubles.
 * 
 * Key Concepts:
 * - While loop
 * - Compound interest calculation
 * - Accumulation
 * - Real-world application
 */
import java.util.Scanner;

public class FutureTuition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Future Tuition Prediction ===");
        System.out.println();
        
        // Example 1: Fixed values
        System.out.println("Example 1: Fixed Values");
        System.out.println("----------------------");
        double tuition = 10000;
        double annualIncreaseRate = 0.07;  // 7% per year
        double targetTuition = tuition * 2;
        
        System.out.println("Current tuition: $" + tuition);
        System.out.println("Annual increase rate: " + (annualIncreaseRate * 100) + "%");
        System.out.println("Target tuition: $" + targetTuition);
        System.out.println();
        
        double currentTuition = tuition;
        int years = 0;
        
        System.out.println("Year-by-year calculation:");
        System.out.println("Year\tTuition");
        System.out.println("----\t-------");
        System.out.printf("%d\t$%,.2f\n", years, currentTuition);
        
        while (currentTuition < targetTuition) {
            years++;
            currentTuition *= (1 + annualIncreaseRate);
            System.out.printf("%d\t$%,.2f\n", years, currentTuition);
        }
        
        System.out.println();
        System.out.println("Tuition will double in " + years + " years");
        System.out.println("Final tuition: $" + String.format("%,.2f", currentTuition));
        System.out.println();
        
        // Example 2: User input
        System.out.println("Example 2: User Input");
        System.out.println("--------------------");
        System.out.print("Enter current tuition: $");
        double userTuition = input.nextDouble();
        
        System.out.print("Enter annual increase rate (as decimal, e.g., 0.07 for 7%): ");
        double userRate = input.nextDouble();
        
        double userTarget = userTuition * 2;
        double userCurrent = userTuition;
        int userYears = 0;
        
        System.out.println();
        System.out.println("Current tuition: $" + String.format("%,.2f", userTuition));
        System.out.println("Annual increase: " + (userRate * 100) + "%");
        System.out.println("Target: $" + String.format("%,.2f", userTarget));
        System.out.println();
        
        while (userCurrent < userTarget) {
            userYears++;
            userCurrent *= (1 + userRate);
        }
        
        System.out.println("Tuition will double in " + userYears + " years");
        System.out.println("Final tuition: $" + String.format("%,.2f", userCurrent));
        System.out.println();
        
        // Example 3: Multiple scenarios
        System.out.println("Example 3: Multiple Scenarios");
        System.out.println("----------------------------");
        double[] tuitionRates = {0.05, 0.06, 0.07, 0.08, 0.10};
        double baseTuition = 10000;
        
        System.out.printf("%-15s %-20s %-15s\n", "Rate", "Years to Double", "Final Tuition");
        System.out.println("------------------------------------------------------------");
        
        for (double rate : tuitionRates) {
            double scenarioTuition = baseTuition;
            int scenarioYears = 0;
            double scenarioTarget = baseTuition * 2;
            
            while (scenarioTuition < scenarioTarget) {
                scenarioYears++;
                scenarioTuition *= (1 + rate);
            }
            
            System.out.printf("%-15.1f%% %-20d $%,13.2f\n", 
                            rate * 100, scenarioYears, scenarioTuition);
        }
        System.out.println();
        
        // Example 4: When will tuition reach specific amount
        System.out.println("Example 4: When Will Tuition Reach Specific Amount");
        System.out.println("---------------------------------------------------");
        double startTuition = 10000;
        double increaseRate = 0.07;
        double targetAmount = 30000;
        
        System.out.println("Starting tuition: $" + String.format("%,.2f", startTuition));
        System.out.println("Annual increase: " + (increaseRate * 100) + "%");
        System.out.println("Target amount: $" + String.format("%,.2f", targetAmount));
        System.out.println();
        
        double amountTuition = startTuition;
        int amountYears = 0;
        
        System.out.println("Year\tTuition");
        System.out.println("----\t-------");
        
        while (amountTuition < targetAmount) {
            System.out.printf("%d\t$%,.2f\n", amountYears, amountTuition);
            amountYears++;
            amountTuition *= (1 + increaseRate);
        }
        
        System.out.printf("%d\t$%,.2f\n", amountYears, amountTuition);
        System.out.println();
        System.out.println("Tuition will reach $" + String.format("%,.2f", targetAmount) + 
                         " in " + amountYears + " years");
        System.out.println();
        
        // Example 5: Comparison table
        System.out.println("Example 5: Comparison Table");
        System.out.println("---------------------------");
        System.out.println("Starting tuition: $10,000");
        System.out.println();
        System.out.printf("%-10s %-15s %-20s\n", "Rate", "Years to Double", "10-Year Tuition");
        System.out.println("--------------------------------------------------------");
        
        for (double compRate = 0.05; compRate <= 0.10; compRate += 0.01) {
            double compTuition = 10000;
            int doubleYears = 0;
            double doubleTarget = 10000 * 2;
            
            // Find years to double
            while (compTuition < doubleTarget) {
                doubleYears++;
                compTuition *= (1 + compRate);
            }
            
            // Calculate 10-year tuition
            double tenYearTuition = 10000;
            for (int i = 0; i < 10; i++) {
                tenYearTuition *= (1 + compRate);
            }
            
            System.out.printf("%-10.1f%% %-15d $%,18.2f\n", 
                            compRate * 100, doubleYears, tenYearTuition);
        }
        System.out.println();
        
        input.close();
        System.out.println("=== Demonstration Complete ===");
    }
}

