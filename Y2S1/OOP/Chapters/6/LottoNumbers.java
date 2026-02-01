/**
 * LottoNumbers.java
 * 
 * Case study: Generate random lotto numbers without duplicates.
 * 
 * Key Concepts:
 * - Random number generation
 * - Avoiding duplicates
 * - Array manipulation
 * - Sorting arrays
 */
import java.util.Arrays;

public class LottoNumbers {
    public static void main(String[] args) {
        System.out.println("=== Lotto Number Generator ===");
        System.out.println();
        
        // Generate 6 unique lotto numbers (1-49)
        int[] lottoNumbers = generateLottoNumbers(6, 1, 49);
        
        System.out.println("Generated Lotto Numbers:");
        System.out.println(Arrays.toString(lottoNumbers));
        System.out.println();
        
        // Generate multiple sets
        System.out.println("Multiple Sets:");
        System.out.println("-------------");
        for (int i = 1; i <= 5; i++) {
            int[] numbers = generateLottoNumbers(6, 1, 49);
            Arrays.sort(numbers);
            System.out.println("Set " + i + ": " + Arrays.toString(numbers));
        }
        System.out.println();
        
        // Verify uniqueness
        System.out.println("Verifying Uniqueness:");
        System.out.println("--------------------");
        int[] testNumbers = generateLottoNumbers(10, 1, 20);
        System.out.println("Generated: " + Arrays.toString(testNumbers));
        System.out.println("All unique: " + allUnique(testNumbers));
    }
    
    /**
     * Generates array of unique random numbers
     * @param count Number of numbers to generate
     * @param min Minimum value (inclusive)
     * @param max Maximum value (inclusive)
     * @return Array of unique random numbers
     */
    public static int[] generateLottoNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        boolean[] used = new boolean[max - min + 1];
        
        for (int i = 0; i < count; i++) {
            int number;
            do {
                number = (int)(Math.random() * (max - min + 1)) + min;
            } while (used[number - min]);
            
            used[number - min] = true;
            numbers[i] = number;
        }
        
        Arrays.sort(numbers);
        return numbers;
    }
    
    /**
     * Checks if all elements in array are unique
     * @param arr The array to check
     * @return true if all unique, false otherwise
     */
    public static boolean allUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

