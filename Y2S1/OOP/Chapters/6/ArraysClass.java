/**
 * ArraysClass.java
 * 
 * Demonstrates utility methods from java.util.Arrays class.
 * 
 * Key Concepts:
 * - Arrays.toString()
 * - Arrays.sort()
 * - Arrays.binarySearch()
 * - Arrays.fill()
 * - Arrays.equals()
 * - Arrays.copyOf()
 */
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        System.out.println("=== Arrays Utility Class ===");
        System.out.println();
        
        // 1. Arrays.toString()
        System.out.println("1. Arrays.toString():");
        System.out.println("---------------------");
        int[] arr = {3, 1, 4, 1, 5};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println();
        
        // 2. Arrays.sort()
        System.out.println("2. Arrays.sort():");
        System.out.println("-----------------");
        int[] unsorted = {5, 2, 8, 1, 9, 3};
        System.out.println("Before sorting: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("After sorting: " + Arrays.toString(unsorted));
        System.out.println();
        
        // 3. Arrays.binarySearch()
        System.out.println("3. Arrays.binarySearch():");
        System.out.println("------------------------");
        int[] sorted = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("Array: " + Arrays.toString(sorted));
        
        int key = 7;
        int index = Arrays.binarySearch(sorted, key);
        if (index >= 0) {
            System.out.println("Found " + key + " at index: " + index);
        } else {
            System.out.println(key + " not found");
        }
        System.out.println();
        
        // 4. Arrays.fill()
        System.out.println("4. Arrays.fill():");
        System.out.println("-----------------");
        int[] arr2 = new int[5];
        System.out.println("Before fill: " + Arrays.toString(arr2));
        Arrays.fill(arr2, 42);
        System.out.println("After fill(42): " + Arrays.toString(arr2));
        System.out.println();
        
        // 5. Arrays.equals()
        System.out.println("5. Arrays.equals():");
        System.out.println("------------------");
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {1, 2, 4};
        
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr3.equals(arr4): " + Arrays.equals(arr3, arr4));
        System.out.println("arr3.equals(arr5): " + Arrays.equals(arr3, arr5));
        System.out.println();
        
        // 6. Arrays.copyOf()
        System.out.println("6. Arrays.copyOf():");
        System.out.println("------------------");
        int[] original = {1, 2, 3, 4, 5};
        int[] copy1 = Arrays.copyOf(original, original.length);
        int[] copy2 = Arrays.copyOf(original, 3);  // Shorter
        int[] copy3 = Arrays.copyOf(original, 8);   // Longer (filled with 0)
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy (same length): " + Arrays.toString(copy1));
        System.out.println("Copy (shorter): " + Arrays.toString(copy2));
        System.out.println("Copy (longer): " + Arrays.toString(copy3));
        System.out.println();
        
        // 7. Arrays.copyOfRange()
        System.out.println("7. Arrays.copyOfRange():");
        System.out.println("------------------------");
        int[] source = {10, 20, 30, 40, 50, 60};
        int[] range1 = Arrays.copyOfRange(source, 1, 4);  // Indices 1-3
        int[] range2 = Arrays.copyOfRange(source, 2, source.length);
        
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Range [1, 4): " + Arrays.toString(range1));
        System.out.println("Range [2, end): " + Arrays.toString(range2));
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

