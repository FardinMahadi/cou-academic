/**
 * BreakContinue.java
 * 
 * Demonstrates break and continue statements in loops.
 * 
 * Key Concepts:
 * - break statement (exits loop)
 * - continue statement (skips to next iteration)
 * - Labeled break and continue
 * - When to use each
 */
public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("=== Break and Continue Statements ===");
        System.out.println();
        
        // 1. Break in For Loop
        System.out.println("1. Break in For Loop:");
        System.out.println("---------------------");
        System.out.println("Numbers from 1 to 10 (stop at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exit loop when i == 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop exited at i = 5");
        System.out.println();
        
        // 2. Continue in For Loop
        System.out.println("2. Continue in For Loop:");
        System.out.println("------------------------");
        System.out.println("Numbers from 1 to 10 (skip even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 3. Break in While Loop
        System.out.println("3. Break in While Loop:");
        System.out.println("-----------------------");
        int count = 0;
        System.out.println("Counting until 10 or until sum > 20:");
        int sum = 0;
        while (count < 10) {
            count++;
            sum += count;
            System.out.println("Count: " + count + ", Sum: " + sum);
            if (sum > 20) {
                break;  // Exit if sum exceeds 20
            }
        }
        System.out.println("Loop exited. Final sum: " + sum);
        System.out.println();
        
        // 4. Continue in While Loop
        System.out.println("4. Continue in While Loop:");
        System.out.println("--------------------------");
        int num = 0;
        System.out.println("Numbers 1-10 divisible by 3:");
        while (num < 10) {
            num++;
            if (num % 3 != 0) {
                continue;  // Skip numbers not divisible by 3
            }
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        // 5. Finding First Match (Break)
        System.out.println("5. Finding First Match (Break):");
        System.out.println("-------------------------------");
        int[] numbers = {3, 7, 2, 9, 5, 1, 8};
        int target = 5;
        boolean found = false;
        
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Searching for: " + target);
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found at index " + i);
                found = true;
                break;  // Exit once found
            }
        }
        
        if (!found) {
            System.out.println("Not found");
        }
        System.out.println();
        
        // 6. Skipping Specific Values (Continue)
        System.out.println("6. Skipping Specific Values (Continue):");
        System.out.println("----------------------------------------");
        System.out.println("Numbers 1-20, skipping multiples of 3 and 5:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;  // Skip multiples of 3 or 5
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 7. Labeled Break (Breaking Outer Loop)
        System.out.println("7. Labeled Break (Breaking Outer Loop):");
        System.out.println("----------------------------------------");
        System.out.println("Searching in 2D array, break outer loop:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int searchValue = 5;
        boolean found2 = false;
        
        outer: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchValue) {
                    System.out.println("Found " + searchValue + " at [" + i + "][" + j + "]");
                    found2 = true;
                    break outer;  // Break outer loop
                }
            }
        }
        System.out.println();
        
        // 8. Labeled Continue (Continue Outer Loop)
        System.out.println("8. Labeled Continue (Continue Outer Loop):");
        System.out.println("-------------------------------------------");
        System.out.println("Processing rows, skip row if contains negative:");
        int[][] data = {
            {1, 2, 3},
            {-1, 5, 6},
            {7, 8, 9}
        };
        
        outer: for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < 0) {
                    System.out.println("Row " + i + " contains negative, skipping");
                    continue outer;  // Continue outer loop
                }
            }
            System.out.println("Processing row " + i);
        }
        System.out.println();
        
        // 9. Practical Example: Input Validation with Break
        System.out.println("9. Practical Example - Input Validation:");
        System.out.println("---------------------------------------");
        System.out.println("Simulating input validation:");
        int[] inputs = {5, 10, 15, -1, 20};  // -1 is sentinel
        int total = 0;
        
        for (int input : inputs) {
            if (input == -1) {
                System.out.println("Sentinel value encountered, stopping input");
                break;
            }
            if (input < 0) {
                System.out.println("Invalid input: " + input + " (skipping)");
                continue;
            }
            total += input;
            System.out.println("Added " + input + ", total: " + total);
        }
        System.out.println("Final total: " + total);
        System.out.println();
        
        // 10. Performance: Break vs Continue
        System.out.println("10. Performance Consideration:");
        System.out.println("------------------------------");
        System.out.println("Break: Exits loop immediately (saves iterations)");
        System.out.println("Continue: Skips to next iteration (still loops)");
        System.out.println();
        
        // Example: Break saves time
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            if (i == 100) {
                break;  // Exit early
            }
        }
        long breakTime = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            if (i == 100) {
                // No break, continues
            }
        }
        long noBreakTime = System.nanoTime() - startTime;
        
        System.out.println("Break time: " + breakTime + " ns");
        System.out.println("No break time: " + noBreakTime + " ns");
        System.out.println("Break is faster when exiting early!");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- break: Exits loop immediately");
        System.out.println("- continue: Skips to next iteration");
        System.out.println("- Use break when you find what you're looking for");
        System.out.println("- Use continue to skip certain iterations");
        System.out.println("- Labeled break/continue work with nested loops");
    }
}


