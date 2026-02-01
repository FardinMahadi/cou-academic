/**
 * StringOperations.java
 * 
 * Demonstrates String operations and methods in Java.
 * 
 * Key Concepts:
 * - String creation
 * - String concatenation
 * - Common String methods
 * - String immutability
 * - String comparison
 */
public class StringOperations {
    public static void main(String[] args) {
        System.out.println("=== String Operations ===");
        System.out.println();
        
        // String creation
        System.out.println("String Creation:");
        System.out.println("----------------");
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "";  // Empty string
        System.out.println("str1: \"" + str1 + "\"");
        System.out.println("str2: \"" + str2 + "\"");
        System.out.println("str3: \"" + str3 + "\" (empty)");
        System.out.println();
        
        // String concatenation
        System.out.println("String Concatenation:");
        System.out.println("---------------------");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);
        System.out.println();
        
        // Concatenation with numbers
        int age = 25;
        String info = "Age: " + age;  // Automatic conversion
        System.out.println("Concatenation with number: " + info);
        System.out.println();
        
        // String length
        System.out.println("String Length:");
        System.out.println("--------------");
        String text = "Hello, World!";
        int length = text.length();
        System.out.println("Text: \"" + text + "\"");
        System.out.println("Length: " + length);
        System.out.println();
        
        // Character access
        System.out.println("Character Access:");
        System.out.println("----------------");
        String word = "Java";
        System.out.println("Word: \"" + word + "\"");
        System.out.println("First character: " + word.charAt(0));  // 'J'
        System.out.println("Last character: " + word.charAt(word.length() - 1));  // 'a'
        System.out.println();
        
        // Substring operations
        System.out.println("Substring Operations:");
        System.out.println("---------------------");
        String sentence = "Programming is fun";
        System.out.println("Original: \"" + sentence + "\"");
        System.out.println("Substring from index 12: \"" + sentence.substring(12) + "\"");  // "fun"
        System.out.println("Substring from 0 to 11: \"" + sentence.substring(0, 11) + "\"");  // "Programming"
        System.out.println();
        
        // Case conversion
        System.out.println("Case Conversion:");
        System.out.println("----------------");
        String mixed = "Hello World";
        System.out.println("Original: \"" + mixed + "\"");
        System.out.println("Lowercase: \"" + mixed.toLowerCase() + "\"");
        System.out.println("Uppercase: \"" + mixed.toUpperCase() + "\"");
        System.out.println();
        
        // String comparison
        System.out.println("String Comparison:");
        System.out.println("------------------");
        String str4 = "Hello";
        String str5 = "Hello";
        String str6 = "hello";
        String str7 = new String("Hello");
        
        System.out.println("str4 = \"" + str4 + "\"");
        System.out.println("str5 = \"" + str5 + "\"");
        System.out.println("str6 = \"" + str6 + "\"");
        System.out.println("str7 = new String(\"Hello\")");
        System.out.println();
        
        // Using equals() method (content comparison)
        System.out.println("Using equals() method:");
        System.out.println("str4.equals(str5): " + str4.equals(str5));  // true
        System.out.println("str4.equals(str6): " + str4.equals(str6));  // false (case-sensitive)
        System.out.println("str4.equals(str7): " + str4.equals(str7));  // true (content same)
        System.out.println();
        
        // Using equalsIgnoreCase() method
        System.out.println("Using equalsIgnoreCase() method:");
        System.out.println("str4.equalsIgnoreCase(str6): " + str4.equalsIgnoreCase(str6));  // true
        System.out.println();
        
        // Using == operator (reference comparison - NOT recommended for strings)
        System.out.println("Using == operator (reference comparison):");
        System.out.println("str4 == str5: " + (str4 == str5));  // true (same literal)
        System.out.println("str4 == str7: " + (str4 == str7));  // false (different objects)
        System.out.println("Note: Use equals() for content comparison, not == !");
        System.out.println();
        
        // String immutability demonstration
        System.out.println("String Immutability:");
        System.out.println("--------------------");
        String original = "Hello";
        System.out.println("Original: \"" + original + "\"");
        String modified = original + " World";  // Creates new string
        System.out.println("After concatenation:");
        System.out.println("Original: \"" + original + "\" (unchanged)");
        System.out.println("Modified: \"" + modified + "\" (new string)");
        System.out.println();
        
        // More string methods
        System.out.println("Additional String Methods:");
        System.out.println("-------------------------");
        String example = "  Hello World  ";
        System.out.println("Original: \"" + example + "\"");
        System.out.println("trim(): \"" + example.trim() + "\"");  // Removes leading/trailing whitespace
        
        String search = "Hello World";
        System.out.println("Search in \"" + search + "\":");
        System.out.println("Contains 'World': " + search.contains("World"));  // true
        System.out.println("Starts with 'Hello': " + search.startsWith("Hello"));  // true
        System.out.println("Ends with 'World': " + search.endsWith("World"));  // true
        System.out.println("Index of 'W': " + search.indexOf('W'));  // 6
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

