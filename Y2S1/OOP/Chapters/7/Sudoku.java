/**
 * Sudoku.java
 * 
 * Case study: Sudoku solution checker using 2D arrays.
 * 
 * Key Concepts:
 * - 2D array for Sudoku grid
 * - Row validation
 * - Column validation
 * - 3×3 box validation
 */
public class Sudoku {
    public static void main(String[] args) {
        System.out.println("=== Sudoku Solution Checker ===");
        System.out.println();
        
        // Valid Sudoku solution
        int[][] validGrid = {
            {6, 3, 9, 5, 7, 4, 1, 8, 2},
            {5, 4, 1, 8, 2, 9, 3, 7, 6},
            {7, 8, 2, 6, 1, 3, 9, 5, 4},
            {1, 9, 8, 4, 6, 7, 5, 2, 3},
            {3, 6, 5, 9, 8, 2, 4, 1, 7},
            {4, 2, 7, 1, 3, 5, 8, 6, 9},
            {9, 5, 6, 7, 4, 8, 2, 3, 1},
            {8, 1, 3, 2, 9, 6, 7, 4, 5},
            {2, 7, 4, 3, 5, 1, 6, 9, 8}
        };
        
        System.out.println("Sudoku Grid:");
        printGrid(validGrid);
        System.out.println();
        
        if (isValid(validGrid)) {
            System.out.println("Valid Sudoku solution!");
        } else {
            System.out.println("Invalid Sudoku solution!");
        }
        System.out.println();
        
        // Invalid Sudoku (duplicate in row)
        int[][] invalidGrid = {
            {6, 3, 9, 5, 7, 4, 1, 8, 2},
            {5, 4, 1, 8, 2, 9, 3, 7, 6},
            {7, 8, 2, 6, 1, 3, 9, 5, 4},
            {1, 9, 8, 4, 6, 7, 5, 2, 3},
            {3, 6, 5, 9, 8, 2, 4, 1, 7},
            {4, 2, 7, 1, 3, 5, 8, 6, 9},
            {9, 5, 6, 7, 4, 8, 2, 3, 1},
            {8, 1, 3, 2, 9, 6, 7, 4, 5},
            {2, 7, 4, 3, 5, 1, 6, 9, 6}  // Duplicate 6 in last row
        };
        
        System.out.println("Invalid Grid (duplicate in last row):");
        printGrid(invalidGrid);
        System.out.println();
        
        if (isValid(invalidGrid)) {
            System.out.println("Valid Sudoku solution!");
        } else {
            System.out.println("Invalid Sudoku solution!");
        }
    }
    
    /**
     * Checks if Sudoku grid is valid
     */
    public static boolean isValid(int[][] grid) {
        // Check rows
        for (int row = 0; row < 9; row++) {
            if (!isValidRow(grid, row)) {
                System.out.println("Invalid row: " + row);
                return false;
            }
        }
        
        // Check columns
        for (int col = 0; col < 9; col++) {
            if (!isValidColumn(grid, col)) {
                System.out.println("Invalid column: " + col);
                return false;
            }
        }
        
        // Check 3×3 boxes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValidBox(grid, i, j)) {
                    System.out.println("Invalid box: [" + i + ", " + j + "]");
                    return false;
                }
            }
        }
        
        return true;
    }
    
    /**
     * Checks if a row is valid (contains 1-9 exactly once)
     */
    public static boolean isValidRow(int[][] grid, int row) {
        boolean[] used = new boolean[10];
        for (int col = 0; col < 9; col++) {
            int value = grid[row][col];
            if (value < 1 || value > 9 || used[value]) {
                return false;
            }
            used[value] = true;
        }
        return true;
    }
    
    /**
     * Checks if a column is valid (contains 1-9 exactly once)
     */
    public static boolean isValidColumn(int[][] grid, int col) {
        boolean[] used = new boolean[10];
        for (int row = 0; row < 9; row++) {
            int value = grid[row][col];
            if (value < 1 || value > 9 || used[value]) {
                return false;
            }
            used[value] = true;
        }
        return true;
    }
    
    /**
     * Checks if a 3×3 box is valid (contains 1-9 exactly once)
     */
    public static boolean isValidBox(int[][] grid, int boxRow, int boxCol) {
        boolean[] used = new boolean[10];
        int startRow = boxRow * 3;
        int startCol = boxCol * 3;
        
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                int value = grid[row][col];
                if (value < 1 || value > 9 || used[value]) {
                    return false;
                }
                used[value] = true;
            }
        }
        return true;
    }
    
    /**
     * Prints Sudoku grid
     */
    public static void printGrid(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("------+-------+------");
            }
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}

