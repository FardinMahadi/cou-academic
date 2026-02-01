/**
 * ConditionalExpressions.java
 * 
 * Demonstrates conditional expressions (ternary operator) in Java.
 * 
 * Key Concepts:
 * - Ternary operator (? :)
 * - Conditional expressions
 * - Nested conditional expressions
 * - When to use vs if-else
 */
public class ConditionalExpressions {
    public static void main(String[] args) {
        System.out.println("=== Conditional Expressions (Ternary Operator) ===");
        System.out.println();
        
        // 1. Basic Ternary Operator
        System.out.println("1. Basic Ternary Operator:");
        System.out.println("--------------------------");
        int score = 85;
        System.out.println("Score: " + score);
        
        // Syntax: condition ? valueIfTrue : valueIfFalse
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        System.out.println();
        
        // Equivalent if-else:
        // if (score >= 60) {
        //     result = "Pass";
        // } else {
        //     result = "Fail";
        // }
        
        // 2. Assigning to Different Types
        System.out.println("2. Assigning to Different Types:");
        System.out.println("--------------------------------");
        int age = 20;
        System.out.println("Age: " + age);
        
        String message = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Message: " + message);
        
        int discount = (age < 18) ? 10 : 0;  // 10% discount for minors
        System.out.println("Discount: " + discount + "%");
        System.out.println();
        
        // 3. Using in Print Statements
        System.out.println("3. Using in Print Statements:");
        System.out.println("-----------------------------");
        int number = -5;
        System.out.println("Number: " + number);
        System.out.println("Absolute value: " + ((number >= 0) ? number : -number));
        System.out.println();
        
        // 4. Nested Conditional Expressions
        System.out.println("4. Nested Conditional Expressions:");
        System.out.println("----------------------------------");
        int testScore = 85;
        System.out.println("Test Score: " + testScore);
        
        String grade = (testScore >= 90) ? "A" : 
                      (testScore >= 80) ? "B" : 
                      (testScore >= 70) ? "C" : 
                      (testScore >= 60) ? "D" : "F";
        
        System.out.println("Grade: " + grade);
        System.out.println();
        
        // Equivalent if-else chain:
        // if (testScore >= 90) {
        //     grade = "A";
        // } else if (testScore >= 80) {
        //     grade = "B";
        // } else if (testScore >= 70) {
        //     grade = "C";
        // } else if (testScore >= 60) {
        //     grade = "D";
        // } else {
        //     grade = "F";
        // }
        
        // 5. Finding Maximum/Minimum
        System.out.println("5. Finding Maximum/Minimum:");
        System.out.println("---------------------------");
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b);
        
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println();
        
        // 6. Even/Odd Check
        System.out.println("6. Even/Odd Check:");
        System.out.println("------------------");
        int num = 7;
        System.out.println("Number: " + num);
        
        String parity = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Parity: " + parity);
        System.out.println();
        
        // 7. Sign Check
        System.out.println("7. Sign Check:");
        System.out.println("--------------");
        int value = -15;
        System.out.println("Value: " + value);
        
        String sign = (value > 0) ? "Positive" : 
                     (value < 0) ? "Negative" : "Zero";
        System.out.println("Sign: " + sign);
        System.out.println();
        
        // 8. Practical Example: Price Calculation
        System.out.println("8. Practical Example - Price Calculation:");
        System.out.println("------------------------------------------");
        double price = 100.0;
        boolean isMember = true;
        System.out.println("Price: $" + price);
        System.out.println("Is Member: " + isMember);
        
        double discountRate = isMember ? 0.10 : 0.0;  // 10% for members
        double finalPrice = price * (1 - discountRate);
        
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println();
        
        // 9. When NOT to Use Ternary Operator
        System.out.println("9. When NOT to Use Ternary Operator:");
        System.out.println("------------------------------------");
        System.out.println("Ternary is great for simple assignments,");
        System.out.println("but use if-else for complex logic:");
        System.out.println();
        
        // Complex logic - better with if-else
        int x = 5;
        if (x > 0) {
            System.out.println("Positive number");
            System.out.println("Processing...");
        } else {
            System.out.println("Non-positive number");
        }
        System.out.println("(This is better as if-else, not ternary)");
        System.out.println();
        
        // 10. Comparison with If-Else
        System.out.println("10. Comparison with If-Else:");
        System.out.println("-----------------------------");
        int temperature = 75;
        System.out.println("Temperature: " + temperature + "°F");
        
        // Using ternary
        String weather = (temperature > 80) ? "Hot" : 
                        (temperature > 60) ? "Warm" : "Cool";
        System.out.println("Weather (ternary): " + weather);
        
        // Using if-else (more readable for complex logic)
        if (temperature > 80) {
            weather = "Hot";
        } else if (temperature > 60) {
            weather = "Warm";
        } else {
            weather = "Cool";
        }
        System.out.println("Weather (if-else): " + weather);
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
        System.out.println();
        System.out.println("Best Practice:");
        System.out.println("- Use ternary for simple, one-line assignments");
        System.out.println("- Use if-else for complex logic or multiple statements");
    }
}

