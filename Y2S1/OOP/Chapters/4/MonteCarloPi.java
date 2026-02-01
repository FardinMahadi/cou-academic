
/**
 * MonteCarloPi.java
 * 
 * Case study: Estimating π using Monte Carlo simulation.
 * 
 * Method:
 * - Generate random points in a unit square (0 to 1)
 * - Count points that fall inside unit circle (distance from origin <= 1)
 * - Ratio of inside points to total points approximates π/4
 * - Therefore: π ≈ 4 × (inside points / total points)
 * 
 * Key Concepts:
 * - For loop
 * - Random number generation
 * - Monte Carlo method
 * - Statistical estimation
 */
import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        System.out.println("=== Monte Carlo π Estimation ===");
        System.out.println();

        // Example 1: Basic simulation
        System.out.println("Example 1: Basic Simulation");
        System.out.println("----------------------------");
        int numberOfTrials = 1000000;
        int numberOfHits = 0;

        Random random = new Random();

        System.out.println("Number of trials: " + numberOfTrials);
        System.out.println("Generating random points...");

        for (int i = 0; i < numberOfTrials; i++) {
            // Generate random point in unit square [0,1) × [0,1)
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Check if point is inside unit circle (distance from origin <= 1)
            // Distance from origin: sqrt(x² + y²)
            // If distance <= 1, point is inside circle
            if (x * x + y * y <= 1.0) {
                numberOfHits++;
            }
        }

        // Estimate π
        double piEstimate = 4.0 * numberOfHits / numberOfTrials;

        System.out.println("Points inside circle: " + numberOfHits);
        System.out.println("Total points: " + numberOfTrials);
        System.out.println("Ratio: " + ((double) numberOfHits / numberOfTrials));
        System.out.println();
        System.out.println("Estimated π: " + piEstimate);
        System.out.println("Actual π: " + Math.PI);
        System.out.println("Error: " + Math.abs(piEstimate - Math.PI));
        System.out.println("Percentage error: " +
                (Math.abs(piEstimate - Math.PI) / Math.PI * 100) + "%");
        System.out.println();

        // Example 2: Multiple trials with different sample sizes
        System.out.println("Example 2: Accuracy vs Sample Size");
        System.out.println("----------------------------------");
        int[] sampleSizes = { 1000, 10000, 100000, 1000000, 10000000 };

        System.out.printf("%-15s %-20s %-15s %-15s\n",
                "Trials", "Estimated π", "Error", "Error %");
        System.out.println("------------------------------------------------------------");

        for (int trials : sampleSizes) {
            int hits = 0;
            Random r = new Random();

            for (int i = 0; i < trials; i++) {
                double x = r.nextDouble();
                double y = r.nextDouble();
                if (x * x + y * y <= 1.0) {
                    hits++;
                }
            }

            double estimate = 4.0 * hits / trials;
            double error = Math.abs(estimate - Math.PI);
            double errorPercent = error / Math.PI * 100;

            System.out.printf("%-15d %-20.10f %-15.10f %-15.6f%%\n",
                    trials, estimate, error, errorPercent);
        }
        System.out.println();

        // Example 3: Visual representation (simplified)
        System.out.println("Example 3: Visual Representation (10x10 grid)");
        System.out.println("---------------------------------------------");
        System.out.println("Points inside circle marked with '*', outside with '.'");
        System.out.println();

        int gridSize = 10;
        int gridHits = 0;
        Random gridRandom = new Random();

        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                // Map grid position to [0,1) coordinates
                double x = (col + 0.5) / gridSize;
                double y = (row + 0.5) / gridSize;

                // Check if inside circle
                if (x * x + y * y <= 1.0) {
                    System.out.print("* ");
                    gridHits++;
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        double gridEstimate = 4.0 * gridHits / (gridSize * gridSize);
        System.out.println();
        System.out.println("Grid estimate: " + gridEstimate);
        System.out.println("Actual π: " + Math.PI);
        System.out.println();

        // Example 4: Running average
        System.out.println("Example 4: Running Average");
        System.out.println("-------------------------");
        int runningTrials = 100000;
        int runningHits = 0;
        Random runningRandom = new Random();

        System.out.println("Showing estimate every 10,000 trials:");
        System.out.printf("%-15s %-20s %-15s\n", "Trials", "Estimate", "Error");
        System.out.println("------------------------------------------------");

        for (int i = 1; i <= runningTrials; i++) {
            double x = runningRandom.nextDouble();
            double y = runningRandom.nextDouble();
            if (x * x + y * y <= 1.0) {
                runningHits++;
            }

            // Print every 10,000 trials
            if (i % 10000 == 0) {
                double estimate = 4.0 * runningHits / i;
                double error = Math.abs(estimate - Math.PI);
                System.out.printf("%-15d %-20.10f %-15.10f\n", i, estimate, error);
            }
        }
        System.out.println();

        // Example 5: Mathematical explanation
        System.out.println("Example 5: Mathematical Explanation");
        System.out.println("-----------------------------------");
        System.out.println("Area of unit square: 1 × 1 = 1");
        System.out.println("Area of quarter circle: π × 1² / 4 = π/4");
        System.out.println();
        System.out.println("Ratio of quarter circle to square: (π/4) / 1 = π/4");
        System.out.println();
        System.out.println("If we generate random points:");
        System.out.println("  - Points inside circle / Total points ≈ π/4");
        System.out.println("  - Therefore: π ≈ 4 × (Points inside / Total points)");
        System.out.println();

        // Final accurate estimate
        System.out.println("Final Accurate Estimate:");
        System.out.println("-----------------------");
        int finalTrials = 10000000;
        int finalHits = 0;
        Random finalRandom = new Random();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < finalTrials; i++) {
            double x = finalRandom.nextDouble();
            double y = finalRandom.nextDouble();
            if (x * x + y * y <= 1.0) {
                finalHits++;
            }
        }
        long endTime = System.currentTimeMillis();

        double finalEstimate = 4.0 * finalHits / finalTrials;
        double finalError = Math.abs(finalEstimate - Math.PI);

        System.out.println("Trials: " + finalTrials);
        System.out.println("Hits: " + finalHits);
        System.out.println("Estimated π: " + finalEstimate);
        System.out.println("Actual π: " + Math.PI);
        System.out.println("Error: " + finalError);
        System.out.println("Error percentage: " + (finalError / Math.PI * 100) + "%");
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println();

        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- More trials = better accuracy");
        System.out.println("- Monte Carlo method uses random sampling");
        System.out.println("- Useful when exact calculation is difficult");
    }
}
