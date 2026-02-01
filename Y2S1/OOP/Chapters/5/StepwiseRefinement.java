/**
 * StepwiseRefinement.java
 * 
 * Demonstrates stepwise refinement - breaking complex problems
 * into smaller, manageable methods.
 * 
 * Key Concepts:
 * - Modular programming
 * - Breaking problems into subproblems
 * - Each method does one thing
 * - Code reusability
 */
import java.util.Scanner;

public class StepwiseRefinement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Stepwise Refinement Example ===");
        System.out.println();
        System.out.println("Program: Calculate and display student grades");
        System.out.println();
        
        // Main program flow
        String name = getName(input);
        double[] scores = getScores(input, 3);
        double average = calculateAverage(scores);
        char grade = getLetterGrade(average);
        
        displayResults(name, scores, average, grade);
        
        input.close();
    }
    
    /**
     * Gets student name from user
     * Subproblem 1: Get input
     */
    public static String getName(Scanner input) {
        System.out.print("Enter student name: ");
        return input.nextLine();
    }
    
    /**
     * Gets specified number of scores from user
     * Subproblem 2: Get multiple scores
     * @param input Scanner for input
     * @param count Number of scores to get
     * @return Array of scores
     */
    public static double[] getScores(Scanner input, int count) {
        double[] scores = new double[count];
        System.out.println("Enter " + count + " test scores:");
        for (int i = 0; i < count; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
        }
        input.nextLine();  // Consume newline
        return scores;
    }
    
    /**
     * Calculates average of scores
     * Subproblem 3: Calculate average
     * @param scores Array of scores
     * @return Average of scores
     */
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    
    /**
     * Converts numeric average to letter grade
     * Subproblem 4: Determine letter grade
     * @param average Numeric average
     * @return Letter grade
     */
    public static char getLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    /**
     * Displays all results
     * Subproblem 5: Display output
     * @param name Student name
     * @param scores Array of scores
     * @param average Numeric average
     * @param grade Letter grade
     */
    public static void displayResults(String name, double[] scores, 
                                      double average, char grade) {
        System.out.println();
        System.out.println("=== Results ===");
        System.out.println("Name: " + name);
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
    }
}

