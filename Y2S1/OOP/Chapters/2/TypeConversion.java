/**
 * TypeConversion.java
 * 
 * Demonstrates type conversion in Java: implicit (widening) and explicit (casting).
 * 
 * Key Concepts:
 * - Implicit conversion (automatic widening)
 * - Explicit conversion (casting)
 * - Type conversion hierarchy
 * - Loss of precision in casting
 */
public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("=== Type Conversion ===");
        System.out.println();
        
        // Implicit Conversion (Widening)
        System.out.println("Implicit Conversion (Widening):");
        System.out.println("------------------------------");
        int intValue = 100;
        long longValue = intValue;        // int automatically converted to long
        float floatValue = longValue;     // long automatically converted to float
        double doubleValue = floatValue;  // float automatically converted to double
        
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println();
        
        // Explicit Conversion (Casting)
        System.out.println("Explicit Conversion (Casting):");
        System.out.println("-----------------------------");
        double price = 19.99;
        int dollars = (int) price;        // Cast double to int (truncates)
        System.out.println("double price: " + price);
        System.out.println("int dollars (cast): " + dollars);  // 19 (decimal part lost)
        System.out.println();
        
        // Integer division vs. floating-point division
        System.out.println("Integer vs. Floating-Point Division:");
        System.out.println("------------------------------------");
        int total = 7;
        int count = 3;
        int intResult = total / count;                    // Integer division: 2
        double doubleResult = (double) total / count;      // Floating-point: 2.333...
        
        System.out.println("total = " + total + ", count = " + count);
        System.out.println("Integer division: " + total + " / " + count + " = " + intResult);
        System.out.println("Floating-point division: (double)" + total + " / " + count + " = " + doubleResult);
        System.out.println();
        
        // Character to integer conversion
        System.out.println("Character Conversions:");
        System.out.println("----------------------");
        char letter = 'A';
        int asciiValue = (int) letter;    // Get ASCII/Unicode value
        System.out.println("char 'A': " + letter);
        System.out.println("ASCII value: " + asciiValue);  // 65
        
        int code = 66;
        char character = (char) code;      // Convert integer to character
        System.out.println("Unicode 66: " + character);   // 'B'
        System.out.println();
        
        // Multiple conversions
        System.out.println("Multiple Conversions:");
        System.out.println("---------------------");
        byte byteValue = 100;
        short shortValue = byteValue;      // Implicit: byte to short
        int intValue2 = shortValue;       // Implicit: short to int
        long longValue2 = intValue2;      // Implicit: int to long
        float floatValue2 = longValue2;   // Implicit: long to float
        double doubleValue2 = floatValue2; // Implicit: float to double
        
        System.out.println("byte → short → int → long → float → double");
        System.out.println(byteValue + " → " + shortValue + " → " + intValue2 + 
                          " → " + longValue2 + " → " + floatValue2 + " → " + doubleValue2);
        System.out.println();
        
        // Narrowing conversions (require explicit casting)
        System.out.println("Narrowing Conversions (Explicit Casting Required):");
        System.out.println("---------------------------------------------------");
        double bigValue = 123.456;
        float floatValue3 = (float) bigValue;  // double to float
        long longValue3 = (long) floatValue3;  // float to long
        int intValue3 = (int) longValue3;      // long to int
        short shortValue2 = (short) intValue3; // int to short
        byte byteValue2 = (byte) shortValue2;  // short to byte
        
        System.out.println("double → float → long → int → short → byte");
        System.out.println(bigValue + " → " + floatValue3 + " → " + longValue3 + 
                          " → " + intValue3 + " → " + shortValue2 + " → " + byteValue2);
        System.out.println();
        
        // Loss of precision warning
        System.out.println("Precision Loss Example:");
        System.out.println("-----------------------");
        double preciseValue = 3.141592653589793;
        float lessPrecise = (float) preciseValue;
        System.out.println("Original double: " + preciseValue);
        System.out.println("After casting to float: " + lessPrecise);
        System.out.println("Note: Some precision is lost!");
        System.out.println();
        
        // Mixing types in expressions
        System.out.println("Mixing Types in Expressions:");
        System.out.println("---------------------------");
        int num1 = 5;
        double num2 = 3.0;
        double result = num1 + num2;  // int automatically promoted to double
        System.out.println(num1 + " (int) + " + num2 + " (double) = " + result + " (double)");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

