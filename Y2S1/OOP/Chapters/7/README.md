# Chapter 7: Multidimensional Arrays

## Overview

This chapter covers multidimensional arrays - arrays of arrays. The most common type is two-dimensional arrays, which are useful for representing tables, matrices, and grids.

## Table of Contents

1. [Two-Dimensional Arrays](#two-dimensional-arrays)
2. [Processing 2D Arrays](#processing-2d-arrays)
3. [Passing 2D Arrays to Methods](#passing-2d-arrays-to-methods)
4. [Irregular Arrays](#irregular-arrays)
5. [Higher-Dimensional Arrays](#higher-dimensional-arrays)
6. [Case Studies](#case-studies)

---

## Two-Dimensional Arrays

### What is a 2D Array?

A two-dimensional array is an array of arrays. Think of it as a table with rows and columns.

### Declaration and Initialization

**Syntax:**
```java
elementType[][] arrayName;
// or
elementType arrayName[][];
```

**Initialization Methods:**

**Method 1: Using new operator**
```java
int[][] matrix = new int[3][4];  // 3 rows, 4 columns
```

**Method 2: Array initializer**
```java
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

**Method 3: Separate declaration and initialization**
```java
int[][] matrix;
matrix = new int[3][4];
```

### Visual Representation

```
     Column
     0  1  2  3
Row 0 [1][2][3][4]
    1 [5][6][7][8]
    2 [9][10][11][12]
```

### Accessing Elements

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

int value = matrix[0][1];  // 2 (row 0, column 1)
matrix[1][2] = 10;         // Set element at row 1, column 2
```

### Indexing

- First index: row number (0 to rows-1)
- Second index: column number (0 to columns-1)
- `matrix[row][column]`

---

## Processing 2D Arrays

### Iterating Through 2D Arrays

**Using nested for loops:**
```java
int[][] matrix = new int[3][4];

// Initialize with values
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = row * 4 + col + 1;
    }
}

// Print all elements
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```

**Using enhanced for loop:**
```java
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

### Row Operations

**Sum of a row:**
```java
public static int sumRow(int[][] matrix, int row) {
    int sum = 0;
    for (int col = 0; col < matrix[row].length; col++) {
        sum += matrix[row][col];
    }
    return sum;
}
```

**Find largest in row:**
```java
public static int maxInRow(int[][] matrix, int row) {
    int max = matrix[row][0];
    for (int col = 1; col < matrix[row].length; col++) {
        if (matrix[row][col] > max) {
            max = matrix[row][col];
        }
    }
    return max;
}
```

### Column Operations

**Sum of a column:**
```java
public static int sumColumn(int[][] matrix, int col) {
    int sum = 0;
    for (int row = 0; row < matrix.length; row++) {
        sum += matrix[row][col];
    }
    return sum;
}
```

**Find largest in column:**
```java
public static int maxInColumn(int[][] matrix, int col) {
    int max = matrix[0][col];
    for (int row = 1; row < matrix.length; row++) {
        if (matrix[row][col] > max) {
            max = matrix[row][col];
        }
    }
    return max;
}
```

### Total Sum

```java
public static int sumAll(int[][] matrix) {
    int total = 0;
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            total += matrix[row][col];
        }
    }
    return total;
}
```

---

## Passing 2D Arrays to Methods

### Passing 2D Array Reference

2D arrays are passed by reference, just like 1D arrays.

```java
public static void printMatrix(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            System.out.printf("%4d", matrix[row][col]);
        }
        System.out.println();
    }
}

int[][] myMatrix = {{1, 2, 3}, {4, 5, 6}};
printMatrix(myMatrix);
```

### Modifying 2D Arrays

```java
public static void fillMatrix(int[][] matrix, int value) {
    for (int row = 0; row < matrix.length; row++) {
        for (int col = 0; col < matrix[row].length; col++) {
            matrix[row][col] = value;
        }
    }
}
```

### Returning 2D Arrays

```java
public static int[][] createMatrix(int rows, int cols) {
    int[][] matrix = new int[rows][cols];
    for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
            matrix[row][col] = row * cols + col;
        }
    }
    return matrix;
}
```

---

## Irregular Arrays

### What are Irregular Arrays?

Arrays where rows have different lengths. Also called "ragged arrays."

### Creating Irregular Arrays

```java
// Create array with different row lengths
int[][] irregular = new int[3][];
irregular[0] = new int[5];  // Row 0 has 5 columns
irregular[1] = new int[3];  // Row 1 has 3 columns
irregular[2] = new int[4];  // Row 2 has 4 columns
```

### Initializing Irregular Arrays

```java
int[][] irregular = {
    {1, 2, 3, 4, 5},      // 5 elements
    {6, 7, 8},            // 3 elements
    {9, 10, 11, 12}       // 4 elements
};
```

### Processing Irregular Arrays

```java
for (int row = 0; row < irregular.length; row++) {
    for (int col = 0; col < irregular[row].length; col++) {
        System.out.print(irregular[row][col] + " ");
    }
    System.out.println();
}
```

**Important**: Always use `array[row].length` instead of a fixed column size!

---

## Higher-Dimensional Arrays

### Three-Dimensional Arrays

```java
int[][][] cube = new int[3][4][5];  // 3×4×5 array

// Access element
cube[0][1][2] = 10;

// Iterate
for (int i = 0; i < cube.length; i++) {
    for (int j = 0; j < cube[i].length; j++) {
        for (int k = 0; k < cube[i][j].length; k++) {
            // Process cube[i][j][k]
        }
    }
}
```

### N-Dimensional Arrays

Java supports arrays of any dimension, though 2D and 3D are most common.

---

## Case Studies

### 1. Grading Multiple-Choice Tests

```java
char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    // ... more students
};

char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

// Grade each student
for (int student = 0; student < answers.length; student++) {
    int correctCount = 0;
    for (int question = 0; question < answers[student].length; question++) {
        if (answers[student][question] == keys[question]) {
            correctCount++;
        }
    }
    System.out.println("Student " + student + ": " + correctCount + " correct");
}
```

### 2. Finding Closest Pair

```java
double[][] points = {
    {-1, 3}, {-1, -1}, {1, 1}, {2, 0.5},
    {2, -1}, {3, 3}, {4, 2}, {4, -0.5}
};

// Find two closest points
double minDistance = Double.MAX_VALUE;
int point1 = 0, point2 = 1;

for (int i = 0; i < points.length; i++) {
    for (int j = i + 1; j < points.length; j++) {
        double distance = Math.sqrt(
            Math.pow(points[i][0] - points[j][0], 2) +
            Math.pow(points[i][1] - points[j][1], 2)
        );
        if (distance < minDistance) {
            minDistance = distance;
            point1 = i;
            point2 = j;
        }
    }
}
```

### 3. Sudoku Solution Checker

```java
public static boolean isValid(int[][] grid) {
    // Check rows
    for (int row = 0; row < 9; row++) {
        if (!isValidRow(grid, row)) return false;
    }
    
    // Check columns
    for (int col = 0; col < 9; col++) {
        if (!isValidColumn(grid, col)) return false;
    }
    
    // Check 3×3 boxes
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (!isValidBox(grid, i, j)) return false;
        }
    }
    
    return true;
}
```

---

## Best Practices

1. **Use meaningful variable names**
   ```java
   int[][] matrix;  // Good
   int[][] m;       // Bad
   ```

2. **Always check array bounds**
   ```java
   if (row >= 0 && row < matrix.length &&
       col >= 0 && col < matrix[row].length) {
       // Safe access
   }
   ```

3. **Use enhanced for loop when possible**
   ```java
   for (int[] row : matrix) {
       for (int element : row) {
           // Process element
       }
   }
   ```

4. **Handle irregular arrays carefully**
   ```java
   // Always use row.length, not fixed size
   for (int col = 0; col < matrix[row].length; col++) {
       // ...
   }
   ```

5. **Initialize properly**
   ```java
   // Good: Initialize all elements
   for (int row = 0; row < matrix.length; row++) {
       for (int col = 0; col < matrix[row].length; col++) {
           matrix[row][col] = 0;
       }
   }
   ```

---

## Summary

- 2D arrays are arrays of arrays
- First index is row, second index is column
- Use nested loops to process 2D arrays
- 2D arrays are passed by reference to methods
- Irregular arrays have rows of different lengths
- Higher-dimensional arrays extend the concept
- 2D arrays are useful for tables, matrices, and grids

---

## References

- Textbook: "Intro to Java Y D Liang" - Chapter 7
- Java Documentation: [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

