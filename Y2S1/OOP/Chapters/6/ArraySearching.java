/**
 * ArraySearching.java
 * 
 * Demonstrates linear and binary search algorithms.
 * 
 * Key Concepts:
 * - Linear search
 * - Binary search
 * - Time complexity
 * - Sorted vs unsorted arrays
 */
import java.util.Arrays;

public class ArraySearching {
    public static void main(String[] args) {
        System.out.println("=== Array Searching Algorithms ===");
        System.out.println();
        
        // Linear search on unsorted array
        System.out.println("1. Linear Search (Unsorted Array):");
        System.out.println("--------------------------------");
        int[] unsorted = {45, 12, 89, 34, 67, 23, 56};
        int key1 = 34;
        System.out.println("Array: " + Arrays.toString(unsorted));
        System.out.println("Searching for: " + key1);
        
        int index1 = linearSearch(unsorted, key1);
        if (index1 != -1) {
            System.out.println("Found at index: " + index1);
        } else {
            System.out.println("Not found");
        }
        System.out.println();
        
        // Binary search on sorted array
        System.out.println("2. Binary Search (Sorted Array):");
        System.out.println("-------------------------------");
        int[] sorted = {12, 23, 34, 45, 56, 67, 89};
        int key2 = 45;
        System.out.println("Array: " + Arrays.toString(sorted));
        System.out.println("Searching for: " + key2);
        
        int index2 = binarySearch(sorted, key2);
        if (index2 != -1) {
            System.out.println("Found at index: " + index2);
        } else {
            System.out.println("Not found");
        }
        System.out.println();
        
        // Comparison
        System.out.println("3. Performance Comparison:");
        System.out.println("------------------------");
        int[] largeArray = new int[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        
        int searchKey = 999999;
        
        // Linear search
        long startTime = System.nanoTime();
        int linearResult = linearSearch(largeArray, searchKey);
        long linearTime = System.nanoTime() - startTime;
        
        // Binary search
        startTime = System.nanoTime();
        int binaryResult = binarySearch(largeArray, searchKey);
        long binaryTime = System.nanoTime() - startTime;
        
        System.out.println("Array size: " + largeArray.length);
        System.out.println("Search key: " + searchKey);
        System.out.println("Linear search time: " + linearTime + " ns");
        System.out.println("Binary search time: " + binaryTime + " ns");
        System.out.println("Binary search is " + (linearTime / binaryTime) + "x faster");
        System.out.println();
        
        // Using Arrays.binarySearch()
        System.out.println("4. Using Arrays.binarySearch():");
        System.out.println("------------------------------");
        int[] arr = {10, 20, 30, 40, 50};
        int key3 = 30;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Searching for: " + key3);
        
        int index3 = Arrays.binarySearch(arr, key3);
        if (index3 >= 0) {
            System.out.println("Found at index: " + index3);
        } else {
            System.out.println("Not found (insertion point: " + (-index3 - 1) + ")");
        }
        System.out.println();
    }
    
    /**
     * Linear search algorithm
     * Time complexity: O(n)
     * @param arr Array to search
     * @param key Value to find
     * @return Index of key, or -1 if not found
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Binary search algorithm
     * Time complexity: O(log n)
     * Requires: Array must be sorted
     * @param arr Sorted array to search
     * @param key Value to find
     * @return Index of key, or -1 if not found
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
}

