/**
 * ArrayBasics.java
 * 
 * Demonstrates basic array operations: declaration, initialization, and access.
 * 
 * Key Concepts:
 * - Array declaration
 * - Array initialization
 * - Accessing array elements
 * - Array indexing
 */
public class ArrayBasics {
    public static void main(String[] args) {
        System.out.println("=== Array Basics ===");
        System.out.println();
        
        // 1. Declaration only
        System.out.println("1. Declaration Only:");
        System.out.println("-------------------");
        int[] numbers;  // Declared but not initialized
        System.out.println("Array declared (not initialized yet)");
        System.out.println();
        
        // 2. Declaration with new operator
        System.out.println("2. Declaration with new Operator:");
        System.out.println("--------------------------------");
        int[] arr1 = new int[5];  // Array of 5 integers (all zeros)
        System.out.println("Array of size 5 created:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        System.out.println();
        
        // 3. Array initializer
        System.out.println("3. Array Initializer:");
        System.out.println("---------------------");
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Array initialized with values:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        System.out.println();
        
        // 4. Accessing elements
        System.out.println("4. Accessing Elements:");
        System.out.println("----------------------");
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("First element: arr3[0] = " + arr3[0]);
        System.out.println("Third element: arr3[2] = " + arr3[2]);
        System.out.println("Last element: arr3[4] = " + arr3[4]);
        System.out.println("Last element (using length): arr3[" + (arr3.length - 1) + "] = " + arr3[arr3.length - 1]);
        System.out.println();
        
        // 5. Modifying elements
        System.out.println("5. Modifying Elements:");
        System.out.println("---------------------");
        int[] arr4 = new int[5];
        System.out.println("Before modification:");
        printArray(arr4);
        
        arr4[0] = 100;
        arr4[1] = 200;
        arr4[2] = 300;
        System.out.println("After modification:");
        printArray(arr4);
        System.out.println();
        
        // 6. Different data types
        System.out.println("6. Different Data Types:");
        System.out.println("----------------------");
        double[] prices = {19.99, 29.99, 39.99};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean[] flags = {true, false, true};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.println("Double array:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
        
        System.out.println("Char array:");
        for (char vowel : vowels) {
            System.out.print(vowel + " ");
        }
        System.out.println();
        
        System.out.println("Boolean array:");
        for (boolean flag : flags) {
            System.out.print(flag + " ");
        }
        System.out.println();
        
        System.out.println("String array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println();
        
        // 7. Array length
        System.out.println("7. Array Length:");
        System.out.println("---------------");
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array length: " + arr5.length);
        System.out.println("Valid indices: 0 to " + (arr5.length - 1));
        System.out.println();
    }
    
    /**
     * Helper method to print array
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

