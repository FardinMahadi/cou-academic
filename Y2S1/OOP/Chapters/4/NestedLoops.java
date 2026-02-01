/**
 * NestedLoops.java
 * 
 * Demonstrates nested loops in Java.
 * 
 * Key Concepts:
 * - Loop inside another loop
 * - Outer and inner loops
 * - Pattern printing
 * - Two-dimensional processing
 * - Performance considerations
 */
public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("=== Nested Loops Demonstration ===");
        System.out.println();
        
        // 1. Basic Nested Loop
        System.out.println("1. Basic Nested Loop:");
        System.out.println("---------------------");
        System.out.println("All combinations of i and j (i: 1-3, j: 1-3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println();
        
        // 2. Pattern: Right Triangle
        System.out.println("2. Pattern: Right Triangle:");
        System.out.println("---------------------------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 3. Pattern: Inverted Right Triangle
        System.out.println("3. Pattern: Inverted Right Triangle:");
        System.out.println("------------------------------------");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 4. Pattern: Square
        System.out.println("4. Pattern: Square:");
        System.out.println("-------------------");
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 5. Pattern: Hollow Square
        System.out.println("5. Pattern: Hollow Square:");
        System.out.println("--------------------------");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // 6. Pattern: Number Triangle
        System.out.println("6. Pattern: Number Triangle:");
        System.out.println("---------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 7. Multiplication Table
        System.out.println("7. Multiplication Table:");
        System.out.println("------------------------");
        System.out.print("   ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("   " + "----".repeat(10));
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println();
        
        // 8. Two-Dimensional Array Processing
        System.out.println("8. Two-Dimensional Array Processing:");
        System.out.println("------------------------------------");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 9. Sum of Each Row
        System.out.println("9. Sum of Each Row:");
        System.out.println("-------------------");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
        System.out.println();
        
        // 10. Sum of Each Column
        System.out.println("10. Sum of Each Column:");
        System.out.println("----------------------");
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
        System.out.println();
        
        // 11. Pattern: Pyramid
        System.out.println("11. Pattern: Pyramid:");
        System.out.println("--------------------");
        int pyramidRows = 5;
        for (int i = 1; i <= pyramidRows; i++) {
            // Print spaces
            for (int j = 1; j <= pyramidRows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 12. Pattern: Diamond
        System.out.println("12. Pattern: Diamond:");
        System.out.println("--------------------");
        int diamondRows = 5;
        // Upper half
        for (int i = 1; i <= diamondRows; i++) {
            for (int j = 1; j <= diamondRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = diamondRows - 1; i >= 1; i--) {
            for (int j = 1; j <= diamondRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // 13. Performance: Total Iterations
        System.out.println("13. Performance: Total Iterations:");
        System.out.println("-----------------------------------");
        int outerIterations = 3;
        int innerIterations = 4;
        int total = 0;
        
        for (int i = 0; i < outerIterations; i++) {
            for (int j = 0; j < innerIterations; j++) {
                total++;
            }
        }
        
        System.out.println("Outer iterations: " + outerIterations);
        System.out.println("Inner iterations: " + innerIterations);
        System.out.println("Total iterations: " + total);
        System.out.println("Formula: outer × inner = " + (outerIterations * innerIterations));
        System.out.println();
        
        // 14. Different Loop Types in Nested Loops
        System.out.println("14. Different Loop Types:");
        System.out.println("------------------------");
        System.out.println("While loop inside for loop:");
        for (int i = 1; i <= 3; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Key Points:");
        System.out.println("- Inner loop completes all iterations for each outer loop iteration");
        System.out.println("- Total iterations = outer iterations × inner iterations");
        System.out.println("- Useful for 2D arrays, patterns, and combinations");
    }
}

