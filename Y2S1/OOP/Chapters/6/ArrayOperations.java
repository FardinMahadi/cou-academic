/**
 * ArrayOperations.java
 * 
 * Demonstrates array operations: length, copying, and common manipulations.
 * 
 * Key Concepts:
 * - Array length property
 * - Array copying methods
 * - Common array operations
 */
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.println("=== Array Operations ===");
        System.out.println();
        
        // 1. Array length
        System.out.println("1. Array Length:");
        System.out.println("---------------");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Length: " + arr.length);
        System.out.println("First index: 0");
        System.out.println("Last index: " + (arr.length - 1));
        System.out.println();
        
        // 2. Reference assignment (not copying)
        System.out.println("2. Reference Assignment (Not Copying):");
        System.out.println("-----------------------------------");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;  // Both reference same array
        
        System.out.println("Before modification:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        
        arr2[0] = 100;  // Modify arr2
        
        System.out.println("After modifying arr2[0] = 100:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("Note: Both arrays changed! (same reference)");
        System.out.println();
        
        // 3. Copying using loop
        System.out.println("3. Copying Using Loop:");
        System.out.println("--------------------");
        int[] source1 = {1, 2, 3, 4, 5};
        int[] target1 = new int[source1.length];
        
        for (int i = 0; i < source1.length; i++) {
            target1[i] = source1[i];
        }
        
        System.out.println("Source: " + Arrays.toString(source1));
        System.out.println("Target: " + Arrays.toString(target1));
        
        target1[0] = 999;  // Modify target
        
        System.out.println("After modifying target[0] = 999:");
        System.out.println("Source: " + Arrays.toString(source1));
        System.out.println("Target: " + Arrays.toString(target1));
        System.out.println("Note: Source unchanged (different arrays)");
        System.out.println();
        
        // 4. Copying using System.arraycopy()
        System.out.println("4. Copying Using System.arraycopy():");
        System.out.println("----------------------------------");
        int[] source2 = {10, 20, 30, 40, 50};
        int[] target2 = new int[source2.length];
        
        System.arraycopy(source2, 0, target2, 0, source2.length);
        
        System.out.println("Source: " + Arrays.toString(source2));
        System.out.println("Target: " + Arrays.toString(target2));
        System.out.println();
        
        // 5. Copying using clone()
        System.out.println("5. Copying Using clone():");
        System.out.println("------------------------");
        int[] source3 = {100, 200, 300};
        int[] target3 = source3.clone();
        
        System.out.println("Source: " + Arrays.toString(source3));
        System.out.println("Target: " + Arrays.toString(target3));
        System.out.println();
        
        // 6. Copying using Arrays.copyOf()
        System.out.println("6. Copying Using Arrays.copyOf():");
        System.out.println("-------------------------------");
        int[] source4 = {1, 2, 3, 4, 5};
        int[] target4 = Arrays.copyOf(source4, source4.length);
        
        System.out.println("Source: " + Arrays.toString(source4));
        System.out.println("Target: " + Arrays.toString(target4));
        System.out.println();
        
        // 7. Finding sum of array
        System.out.println("7. Finding Sum of Array:");
        System.out.println("----------------------");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println();
        
        // 8. Finding maximum
        System.out.println("8. Finding Maximum:");
        System.out.println("------------------");
        int[] values = {45, 12, 89, 34, 67};
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(values));
        System.out.println("Maximum: " + max);
        System.out.println();
        
        // 9. Finding minimum
        System.out.println("9. Finding Minimum:");
        System.out.println("------------------");
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(values));
        System.out.println("Minimum: " + min);
        System.out.println();
        
        // 10. Reversing array
        System.out.println("10. Reversing Array:");
        System.out.println("-------------------");
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

