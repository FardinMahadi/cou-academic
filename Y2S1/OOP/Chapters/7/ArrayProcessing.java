/**
 * ArrayProcessing.java
 * 
 * Demonstrates processing operations on 2D arrays.
 * 
 * Key Concepts:
 * - Row operations (sum, max, min)
 * - Column operations (sum, max, min)
 * - Total sum
 * - Finding specific elements
 */
public class ArrayProcessing {
    public static void main(String[] args) {
        System.out.println("=== 2D Array Processing ===");
        System.out.println();
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println();
        
        // 1. Sum of each row
        System.out.println("1. Sum of Each Row:");
        System.out.println("------------------");
        for (int row = 0; row < matrix.length; row++) {
            int sum = sumRow(matrix, row);
            System.out.println("Row " + row + " sum: " + sum);
        }
        System.out.println();
        
        // 2. Sum of each column
        System.out.println("2. Sum of Each Column:");
        System.out.println("---------------------");
        for (int col = 0; col < matrix[0].length; col++) {
            int sum = sumColumn(matrix, col);
            System.out.println("Column " + col + " sum: " + sum);
        }
        System.out.println();
        
        // 3. Maximum in each row
        System.out.println("3. Maximum in Each Row:");
        System.out.println("----------------------");
        for (int row = 0; row < matrix.length; row++) {
            int max = maxInRow(matrix, row);
            System.out.println("Row " + row + " max: " + max);
        }
        System.out.println();
        
        // 4. Maximum in each column
        System.out.println("4. Maximum in Each Column:");
        System.out.println("-------------------------");
        for (int col = 0; col < matrix[0].length; col++) {
            int max = maxInColumn(matrix, col);
            System.out.println("Column " + col + " max: " + max);
        }
        System.out.println();
        
        // 5. Total sum
        System.out.println("5. Total Sum:");
        System.out.println("-------------");
        int total = sumAll(matrix);
        System.out.println("Total sum of all elements: " + total);
        System.out.println();
        
        // 6. Average
        System.out.println("6. Average:");
        System.out.println("-----------");
        double average = average(matrix);
        System.out.println("Average of all elements: " + average);
        System.out.println();
        
        // 7. Find element
        System.out.println("7. Find Element:");
        System.out.println("----------------");
        int key = 7;
        int[] position = findElement(matrix, key);
        if (position != null) {
            System.out.println("Found " + key + " at row " + position[0] + 
                             ", column " + position[1]);
        } else {
            System.out.println(key + " not found");
        }
        System.out.println();
    }
    
    /**
     * Prints a 2D array
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }
    
    /**
     * Calculates sum of a row
     */
    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int col = 0; col < matrix[row].length; col++) {
            sum += matrix[row][col];
        }
        return sum;
    }
    
    /**
     * Calculates sum of a column
     */
    public static int sumColumn(int[][] matrix, int col) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][col];
        }
        return sum;
    }
    
    /**
     * Finds maximum value in a row
     */
    public static int maxInRow(int[][] matrix, int row) {
        int max = matrix[row][0];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] > max) {
                max = matrix[row][col];
            }
        }
        return max;
    }
    
    /**
     * Finds maximum value in a column
     */
    public static int maxInColumn(int[][] matrix, int col) {
        int max = matrix[0][col];
        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row][col] > max) {
                max = matrix[row][col];
            }
        }
        return max;
    }
    
    /**
     * Calculates sum of all elements
     */
    public static int sumAll(int[][] matrix) {
        int total = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                total += element;
            }
        }
        return total;
    }
    
    /**
     * Calculates average of all elements
     */
    public static double average(int[][] matrix) {
        int total = sumAll(matrix);
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return (double) total / count;
    }
    
    /**
     * Finds position of element
     * @return Array with [row, col] or null if not found
     */
    public static int[] findElement(int[][] matrix, int key) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == key) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}

