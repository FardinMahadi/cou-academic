import java.util.Arrays;

class PrimeNumberFinder {
    private int count;
    
    public PrimeNumberFinder(int count) {
        this.count = count;
    }
    
    public void findAndPrint() {
        int found = 0;
        int number = 2;
        int numbersPerLine = 10;
        
        while (found < count) {
            if (isPrime(number)) {
                System.out.print(number);
                found++;
                
                if (found % numbersPerLine == 0) {
                    System.out.println();
                } else if (found < count) {
                    System.out.print(" ");
                }
            }
            number++;
        }
        
        if (found % numbersPerLine != 0) {
            System.out.println();
        }
    }
    
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class BinarySearch {
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                return mid;
            }
            
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}

class BubbleSort {
    public void sort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("=== Problem 1: First 200 Prime Numbers ===");
        PrimeNumberFinder primeFinder = new PrimeNumberFinder(200);
        primeFinder.findAndPrint();
        
        System.out.println("\n=== Problem 2: Binary Search ===");
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 67, 78, 90};
        BinarySearch binarySearch = new BinarySearch();
        int target = 23;
        int result = binarySearch.search(sortedArray, target);
        System.out.println("Array: " + Arrays.toString(sortedArray));
        System.out.println("Searching for: " + target);
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
        
        System.out.println("\n=== Problem 3: Bubble Sort ===");
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90, 5};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
        bubbleSort.sort(unsortedArray);
        System.out.println("After sorting: " + Arrays.toString(unsortedArray));
    }
}