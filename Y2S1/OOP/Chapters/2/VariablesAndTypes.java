/**
 * VariablesAndTypes.java
 * 
 * Demonstrates variable declaration and different data types in Java.
 * 
 * Key Concepts:
 * - Variable declaration
 * - Primitive data types
 * - Variable initialization
 * - Default values
 */
public class VariablesAndTypes {
    public static void main(String[] args) {
        System.out.println("=== Variables and Data Types ===");
        System.out.println();
        
        // Integer types
        System.out.println("Integer Types:");
        System.out.println("-------------");
        byte byteValue = 127;           // 1 byte: -128 to 127
        short shortValue = 32767;        // 2 bytes: -32,768 to 32,767
        int intValue = 2147483647;       // 4 bytes: -2^31 to 2^31-1
        long longValue = 9223372036854775807L;  // 8 bytes: -2^63 to 2^63-1 (note L suffix)
        
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println();
        
        // Floating-point types
        System.out.println("Floating-Point Types:");
        System.out.println("---------------------");
        float floatValue = 3.14159f;    // 4 bytes (note f suffix)
        double doubleValue = 3.141592653589793;  // 8 bytes (default for decimals)
        
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println();
        
        // Character type
        System.out.println("Character Type:");
        System.out.println("---------------");
        char charValue1 = 'A';          // Single character
        char charValue2 = 65;            // Unicode value (65 = 'A')
        char charValue3 = '\u0041';      // Unicode escape sequence
        
        System.out.println("char (literal): " + charValue1);
        System.out.println("char (Unicode value): " + charValue2);
        System.out.println("char (escape sequence): " + charValue3);
        System.out.println();
        
        // Boolean type
        System.out.println("Boolean Type:");
        System.out.println("-------------");
        boolean isStudent = true;
        boolean isGraduated = false;
        
        System.out.println("isStudent: " + isStudent);
        System.out.println("isGraduated: " + isGraduated);
        System.out.println();
        
        // Variable naming examples
        System.out.println("Variable Naming:");
        System.out.println("----------------");
        int studentCount = 25;          // camelCase - good
        double averageScore = 85.5;     // descriptive name - good
        boolean isActive = true;        // boolean prefix 'is' - good
        
        System.out.println("studentCount: " + studentCount);
        System.out.println("averageScore: " + averageScore);
        System.out.println("isActive: " + isActive);
        System.out.println();
        
        // Multiple variable declaration
        System.out.println("Multiple Declaration:");
        System.out.println("---------------------");
        int x, y, z;                    // Declare multiple variables
        x = 10;
        y = 20;
        z = 30;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println();
        
        // Variable scope demonstration
        System.out.println("Variable Scope:");
        System.out.println("---------------");
        {
            int localVar = 100;         // Local variable
            System.out.println("Local variable: " + localVar);
        }
        // System.out.println(localVar); // Error: localVar not accessible here
        
        System.out.println("=== Demonstration Complete ===");
    }
}

