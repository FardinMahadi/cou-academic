# Chapter 6: Single-Dimensional Arrays

## Overview

This chapter covers arrays - data structures that store multiple values of the same type. Arrays allow you to work with collections of data efficiently.

## Table of Contents

1. [Array Basics](#array-basics)
2. [Array Declaration and Initialization](#array-declaration-and-initialization)
3. [Array Indexing](#array-indexing)
4. [Array Length](#array-length)
5. [Array Copying](#array-copying)
6. [Passing Arrays to Methods](#passing-arrays-to-methods)
7. [Arrays Class](#arrays-class)
8. [Search Algorithms](#search-algorithms)
9. [Variable-Length Arguments](#variable-length-arguments)
10. [Case Studies](#case-studies)

---

## Array Basics

### What is an Array?

An array is a collection of variables of the same type, stored in contiguous memory locations and accessed using an index.

### Key Characteristics

- **Fixed size**: Once created, size cannot change
- **Same type**: All elements must be the same data type
- **Indexed**: Elements accessed by index (0 to length-1)
- **Contiguous**: Elements stored in consecutive memory locations

### Array Declaration Syntax

```java
elementType[] arrayName;
// or
elementType arrayName[];
```

**Example:**
```java
int[] numbers;
double[] prices;
String[] names;
```

---

## Array Declaration and Initialization

### Declaration Only

```java
int[] numbers;  // Declared but not initialized
```

### Declaration with Initialization

**Method 1: Using new operator**
```java
int[] numbers = new int[5];  // Array of 5 integers, all initialized to 0
```

**Method 2: Array initializer**
```java
int[] numbers = {1, 2, 3, 4, 5};  // Array with initial values
```

**Method 3: Declaration and initialization separately**
```java
int[] numbers;
numbers = new int[5];
```

### Default Values

When arrays are created with `new`, elements get default values:

| Type | Default Value |
|------|---------------|
| `byte`, `short`, `int`, `long` | 0 |
| `float`, `double` | 0.0 |
| `char` | '\u0000' |
| `boolean` | false |
| Object references | null |

### Examples

```java
int[] arr1 = new int[10];           // 10 zeros
double[] arr2 = new double[5];      // 5 zeros (0.0)
boolean[] arr3 = new boolean[3];    // 3 false values
String[] arr4 = new String[4];      // 4 null references

int[] arr5 = {10, 20, 30};          // Initialized with values
char[] vowels = {'a', 'e', 'i', 'o', 'u'};
```

---

## Array Indexing

### Index Access

Arrays use zero-based indexing. First element is at index 0, last element is at index length-1.

```java
int[] numbers = {10, 20, 30, 40, 50};
// Index:       0   1   2   3   4

int first = numbers[0];   // 10
int third = numbers[2];    // 30
int last = numbers[4];     // 50
```

### Accessing Elements

```java
int[] arr = new int[5];
arr[0] = 10;    // Set first element
arr[1] = 20;    // Set second element
int value = arr[0];  // Get first element
```

### Array Index Out of Bounds

Accessing an invalid index throws `ArrayIndexOutOfBoundsException`:

```java
int[] arr = new int[5];
int x = arr[5];  // Error! Valid indices are 0-4
int y = arr[-1]; // Error! Negative index not allowed
```

---

## Array Length

### length Property

Arrays have a `length` property (not a method) that returns the number of elements.

```java
int[] numbers = new int[10];
int size = numbers.length;  // 10 (not numbers.length())
```

### Common Usage

```java
int[] arr = {1, 2, 3, 4, 5};

// Iterate through array
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Access last element
int last = arr[arr.length - 1];
```

### Important Notes

- `length` is a property, not a method (no parentheses)
- `length` is final (cannot be changed)
- `length` gives the size, not the last index

---

## Array Copying

### Reference Assignment (Not Copying)

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;  // Both reference same array!
arr2[0] = 100;
System.out.println(arr1[0]);  // Prints 100 (both changed!)
```

### Shallow Copy Methods

**Method 1: Loop**
```java
int[] source = {1, 2, 3, 4, 5};
int[] target = new int[source.length];
for (int i = 0; i < source.length; i++) {
    target[i] = source[i];
}
```

**Method 2: System.arraycopy()**
```java
int[] source = {1, 2, 3, 4, 5};
int[] target = new int[source.length];
System.arraycopy(source, 0, target, 0, source.length);
```

**Method 3: clone()**
```java
int[] source = {1, 2, 3, 4, 5};
int[] target = source.clone();
```

**Method 4: Arrays.copyOf()**
```java
int[] source = {1, 2, 3, 4, 5};
int[] target = Arrays.copyOf(source, source.length);
```

---

## Passing Arrays to Methods

### Passing Array Reference

Arrays are passed by reference. The method receives a reference to the array, so modifications affect the original.

```java
public static void modifyArray(int[] arr) {
    arr[0] = 100;  // Modifies original array
}

int[] numbers = {1, 2, 3};
modifyArray(numbers);
System.out.println(numbers[0]);  // Prints 100
```

### Returning Arrays

Methods can return arrays:

```java
public static int[] createArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
        arr[i] = i * 2;
    }
    return arr;
}

int[] result = createArray(5);
```

### Array as Parameter

```java
public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
```

---

## Arrays Class

### Common Methods

The `java.util.Arrays` class provides utility methods for arrays.

| Method | Description | Example |
|--------|-------------|---------|
| `Arrays.toString(arr)` | Returns string representation | `Arrays.toString([1,2,3])` → "[1, 2, 3]" |
| `Arrays.sort(arr)` | Sorts array in ascending order | Sorts in place |
| `Arrays.binarySearch(arr, key)` | Searches sorted array | Returns index or negative |
| `Arrays.fill(arr, value)` | Fills array with value | All elements set to value |
| `Arrays.equals(arr1, arr2)` | Compares two arrays | Returns boolean |
| `Arrays.copyOf(arr, length)` | Copies array | Returns new array |

### Examples

```java
import java.util.Arrays;

int[] arr = {3, 1, 4, 1, 5};

// Convert to string
System.out.println(Arrays.toString(arr));  // [3, 1, 4, 1, 5]

// Sort
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));  // [1, 1, 3, 4, 5]

// Binary search (array must be sorted)
int index = Arrays.binarySearch(arr, 4);  // Returns 3

// Fill
Arrays.fill(arr, 0);
System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0]
```

---

## Search Algorithms

### Linear Search

Sequentially checks each element until found or end of array.

**Time Complexity**: O(n)

```java
public static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == key) {
            return i;  // Found
        }
    }
    return -1;  // Not found
}
```

**Characteristics:**
- Works on unsorted arrays
- Simple to implement
- Slow for large arrays

### Binary Search

Searches sorted array by repeatedly dividing search interval in half.

**Time Complexity**: O(log n)

```java
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
    return -1;  // Not found
}
```

**Characteristics:**
- Requires sorted array
- Much faster than linear search
- More complex to implement

### Comparison

| Algorithm | Best Case | Worst Case | Requires Sorted? |
|-----------|-----------|------------|------------------|
| Linear Search | O(1) | O(n) | No |
| Binary Search | O(1) | O(log n) | Yes |

---

## Variable-Length Arguments

### Varargs Syntax

Methods can accept variable number of arguments using `...`:

```java
public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

int result = sum(1, 2, 3);        // 6
int result2 = sum(1, 2, 3, 4, 5); // 15
```

### How It Works

Varargs are treated as an array inside the method:

```java
public static void printNumbers(int... nums) {
    // nums is an array
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }
}
```

### Rules

- Varargs must be the last parameter
- Only one varargs parameter per method
- Can be combined with regular parameters

```java
public static void method(String name, int... numbers) { ... }  // OK
public static void method(int... nums, String name) { ... }    // Error!
```

---

## Case Studies

### 1. Lotto Numbers

Generate random lotto numbers without duplicates:

```java
int[] lottoNumbers = new int[6];
boolean[] used = new boolean[50];  // Track used numbers

for (int i = 0; i < lottoNumbers.length; i++) {
    int number;
    do {
        number = (int)(Math.random() * 49) + 1;
    } while (used[number]);
    
    used[number] = true;
    lottoNumbers[i] = number;
}

Arrays.sort(lottoNumbers);
```

### 2. Deck of Cards

Represent and shuffle a deck of cards:

```java
int[] deck = new int[52];
String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
String[] ranks = {"Ace", "2", "3", ..., "King"};

// Initialize deck
for (int i = 0; i < deck.length; i++) {
    deck[i] = i;
}

// Shuffle
for (int i = 0; i < deck.length; i++) {
    int j = (int)(Math.random() * deck.length);
    int temp = deck[i];
    deck[i] = deck[j];
    deck[j] = temp;
}
```

---

## Best Practices

1. **Always check array bounds**
   ```java
   if (index >= 0 && index < array.length) {
       // Safe to access
   }
   ```

2. **Use enhanced for loop when possible**
   ```java
   for (int num : numbers) {
       System.out.println(num);
   }
   ```

3. **Initialize arrays properly**
   ```java
   int[] arr = new int[10];  // All zeros
   int[] arr2 = {1, 2, 3};   // Initialized values
   ```

4. **Use Arrays utility methods**
   ```java
   Arrays.sort(arr);
   Arrays.toString(arr);
   ```

5. **Remember arrays are objects**
   - Arrays are reference types
   - Assignment copies reference, not array
   - Use proper copying methods

---

## Summary

- Arrays store multiple values of the same type
- Arrays have fixed size after creation
- Elements accessed by index (0 to length-1)
- Arrays are passed by reference to methods
- Arrays class provides useful utility methods
- Linear search works on any array; binary search requires sorted array
- Varargs allow variable number of arguments
- Arrays enable efficient data processing

---

## References

- Textbook: "Intro to Java Y D Liang" - Chapter 6
- Java Documentation: [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

