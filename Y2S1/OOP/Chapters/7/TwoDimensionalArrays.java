/**
 * TwoDimensionalArrays.java
 * 
 * Demonstrates two-dimensional arrays in Java.
 * 
 * Key Concepts:
 * - 2D array declaration
 * - 2D array initialization
 * - Accessing 2D array elements
 * - Row and column indexing
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        System.out.println("=== Two-Dimensional Arrays ===");
        System.out.println();
        
        // 1. Declaration with new operator
        System.out.println("1. Declaration with new Operator:");
        System.out.println("--------------------------------");
        int[][] matrix1 = new int[3][4];  // 3 rows, 4 columns
        System.out.println("Created 3×4 matrix (all zeros):");
        printMatrix(matrix1);
        System.out.println();
        
        // 2. Array initializer
        System.out.println("2. Array Initializer:");
        System.out.println("---------------------");
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("Initialized matrix:");
        printMatrix(matrix2);
        System.out.println();
        
        // 3. Accessing elements
        System.out.println("3. Accessing Elements:");
        System.out.println("---------------------");
        System.out.println("matrix[0][0] = " + matrix2[0][0]);  // First element
        System.out.println("matrix[0][1] = " + matrix2[0][1]);  // Row 0, Col 1
        System.out.println("matrix[1][2] = " + matrix2[1][2]);  // Row 1, Col 2
        System.out.println("matrix[2][3] = " + matrix2[2][3]);  // Last element
        System.out.println();
        
        // 4. Modifying elements
        System.out.println("4. Modifying Elements:");
        System.out.println("---------------------");
        int[][] matrix3 = new int[3][3];
        System.out.println("Before modification:");
        printMatrix(matrix3);
        
        // Fill with values
        int value = 1;
        for (int row = 0; row < matrix3.length; row++) {
            for (int col = 0; col < matrix3[row].length; col++) {
                matrix3[row][col] = value++;
            }
        }
        
        System.out.println("After modification:");
        printMatrix(matrix3);
        System.out.println();
        
        // 5. Different data types
        System.out.println("5. Different Data Types:");
        System.out.println("------------------------");
        
        double[][] prices = {
            {19.99, 29.99},
            {39.99, 49.99}
        };
        System.out.println("Double matrix:");
        for (double[] row : prices) {
            for (double price : row) {
                System.out.printf("%6.2f ", price);
            }
            System.out.println();
        }
        System.out.println();
        
        char[][] letters = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'}
        };
        System.out.println("Char matrix:");
        for (char[] row : letters) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 6. Array dimensions
        System.out.println("6. Array Dimensions:");
        System.out.println("-------------------");
        int[][] matrix4 = new int[5][7];
        System.out.println("Rows: " + matrix4.length);
        System.out.println("Columns (first row): " + matrix4[0].length);
        System.out.println("Total elements: " + (matrix4.length * matrix4[0].length));
        System.out.println();
        
        // 7. Visual representation
        System.out.println("7. Visual Representation:");
        System.out.println("------------------------");
        int[][] visual = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix layout:");
        System.out.println("     Col 0  Col 1  Col 2");
        for (int row = 0; row < visual.length; row++) {
            System.out.print("Row " + row + " ");
            for (int col = 0; col < visual[row].length; col++) {
                System.out.printf("%4d  ", visual[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
    
    /**
     * Prints a 2D array
     */
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}

