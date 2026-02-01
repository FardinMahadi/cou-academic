/**
 * IrregularArrays.java
 * 
 * Demonstrates irregular (ragged) arrays - arrays with rows of different lengths.
 * 
 * Key Concepts:
 * - Creating irregular arrays
 * - Rows with different lengths
 * - Processing irregular arrays
 */
public class IrregularArrays {
    public static void main(String[] args) {
        System.out.println("=== Irregular Arrays ===");
        System.out.println();
        
        // 1. Creating irregular array
        System.out.println("1. Creating Irregular Array:");
        System.out.println("----------------------------");
        int[][] irregular = new int[3][];
        irregular[0] = new int[5];  // Row 0 has 5 columns
        irregular[1] = new int[3];  // Row 1 has 3 columns
        irregular[2] = new int[4];  // Row 2 has 4 columns
        
        // Initialize with values
        int value = 1;
        for (int row = 0; row < irregular.length; row++) {
            for (int col = 0; col < irregular[row].length; col++) {
                irregular[row][col] = value++;
            }
        }
        
        System.out.println("Irregular array:");
        printIrregularArray(irregular);
        System.out.println();
        
        // 2. Initializing with array initializer
        System.out.println("2. Initializing with Array Initializer:");
        System.out.println("--------------------------------------");
        int[][] irregular2 = {
            {1, 2, 3, 4, 5},      // 5 elements
            {6, 7, 8},            // 3 elements
            {9, 10, 11, 12}       // 4 elements
        };
        
        System.out.println("Irregular array (initialized):");
        printIrregularArray(irregular2);
        System.out.println();
        
        // 3. Processing irregular array
        System.out.println("3. Processing Irregular Array:");
        System.out.println("------------------------------");
        System.out.println("Row lengths:");
        for (int row = 0; row < irregular2.length; row++) {
            System.out.println("Row " + row + ": " + irregular2[row].length + " elements");
        }
        System.out.println();
        
        // 4. Sum of each row
        System.out.println("4. Sum of Each Row:");
        System.out.println("------------------");
        for (int row = 0; row < irregular2.length; row++) {
            int sum = 0;
            for (int col = 0; col < irregular2[row].length; col++) {
                sum += irregular2[row][col];
            }
            System.out.println("Row " + row + " sum: " + sum);
        }
        System.out.println();
        
        // 5. Triangular pattern
        System.out.println("5. Triangular Pattern:");
        System.out.println("----------------------");
        int[][] triangle = new int[5][];
        for (int row = 0; row < triangle.length; row++) {
            triangle[row] = new int[row + 1];  // Each row has row+1 elements
            for (int col = 0; col < triangle[row].length; col++) {
                triangle[row][col] = col + 1;
            }
        }
        
        System.out.println("Triangular array:");
        printIrregularArray(triangle);
        System.out.println();
        
        // 6. Important: Always use row.length
        System.out.println("6. Important: Use row.length:");
        System.out.println("-----------------------------");
        System.out.println("Correct way (using row.length):");
        for (int row = 0; row < irregular2.length; row++) {
            for (int col = 0; col < irregular2[row].length; col++) {  // Correct!
                System.out.print(irregular2[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Wrong way (using fixed size):");
        System.out.println("for (int col = 0; col < 5; col++) { ... }");
        System.out.println("This would cause ArrayIndexOutOfBoundsException!");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
    
    /**
     * Prints an irregular array
     */
    public static void printIrregularArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Row " + row + ": ");
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

