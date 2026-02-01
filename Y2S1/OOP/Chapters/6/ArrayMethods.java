/**
 * ArrayMethods.java
 * 
 * Demonstrates passing arrays to and from methods.
 * 
 * Key Concepts:
 * - Passing arrays to methods
 * - Arrays are passed by reference
 * - Returning arrays from methods
 * - Modifying arrays in methods
 */
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("=== Arrays and Methods ===");
        System.out.println();
        
        // 1. Passing array to method
        System.out.println("1. Passing Array to Method:");
        System.out.println("--------------------------");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before calling method:");
        System.out.println("Array: " + Arrays.toString(numbers));
        
        printArray(numbers);
        System.out.println();
        
        // 2. Modifying array in method
        System.out.println("2. Modifying Array in Method:");
        System.out.println("----------------------------");
        int[] arr = {10, 20, 30};
        System.out.println("Before modification:");
        System.out.println("Array: " + Arrays.toString(arr));
        
        modifyArray(arr);
        
        System.out.println("After modification:");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Note: Original array was modified!");
        System.out.println();
        
        // 3. Returning array from method
        System.out.println("3. Returning Array from Method:");
        System.out.println("------------------------------");
        int[] result = createArray(5);
        System.out.println("Created array: " + Arrays.toString(result));
        System.out.println();
        
        // 4. Method that processes array
        System.out.println("4. Method that Processes Array:");
        System.out.println("------------------------------");
        int[] data = {5, 10, 15, 20, 25};
        double average = calculateAverage(data);
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("Average: " + average);
        System.out.println();
        
        // 5. Method that finds element
        System.out.println("5. Method that Finds Element:");
        System.out.println("----------------------------");
        int[] searchArray = {10, 20, 30, 40, 50};
        int key = 30;
        int index = findIndex(searchArray, key);
        System.out.println("Array: " + Arrays.toString(searchArray));
        System.out.println("Searching for: " + key);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
        System.out.println();
        
        // 6. Method that creates and returns array
        System.out.println("6. Method that Creates Array:");
        System.out.println("---------------------------");
        int[] squares = generateSquares(5);
        System.out.println("Squares array: " + Arrays.toString(squares));
        System.out.println();
        
        // 7. Method with array parameter and return
        System.out.println("7. Method with Array Parameter and Return:");
        System.out.println("------------------------------------------");
        int[] original = {1, 2, 3, 4, 5};
        int[] doubled = doubleArray(original);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Doubled: " + Arrays.toString(doubled));
        System.out.println();
    }
    
    /**
     * Prints all elements of an array
     * @param arr The array to print
     */
    public static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    /**
     * Modifies array elements
     * Note: Modifications affect original array
     * @param arr The array to modify
     */
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  // Double each element
        }
    }
    
    /**
     * Creates and returns an array
     * @param size The size of the array
     * @return Array filled with values 0 to size-1
     */
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }
    
    /**
     * Calculates average of array elements
     * @param arr The array
     * @return Average of array elements
     */
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
    /**
     * Finds index of element in array
     * @param arr The array to search
     * @param key The value to find
     * @return Index of key, or -1 if not found
     */
    public static int findIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Generates array of squares
     * @param n Number of elements
     * @return Array containing squares of 1 to n
     */
    public static int[] generateSquares(int n) {
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        return squares;
    }
    
    /**
     * Creates new array with doubled values
     * @param arr Original array
     * @return New array with doubled values
     */
    public static int[] doubleArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }
}

