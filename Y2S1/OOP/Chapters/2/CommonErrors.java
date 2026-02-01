/**
 * CommonErrors.java
 * 
 * Demonstrates the three types of programming errors:
 * 1. Syntax Errors (compile-time)
 * 2. Runtime Errors
 * 3. Logic Errors
 * 
 * Note: Some examples are commented out because they would prevent compilation.
 */
public class CommonErrors {
    public static void main(String[] args) {
        System.out.println("=== Common Programming Errors ===");
        System.out.println();
        
        // 1. SYNTAX ERRORS (Compile-time errors)
        System.out.println("1. Syntax Errors (Compile-time):");
        System.out.println("--------------------------------");
        System.out.println("These errors prevent the program from compiling.");
        System.out.println();
        System.out.println("Examples of syntax errors:");
        System.out.println("- Missing semicolon: int x = 5  // Error!");
        System.out.println("- Wrong type: int y = \"hello\";  // Error!");
        System.out.println("- Missing parenthesis: System.out.println(\"Hello\"  // Error!");
        System.out.println("- Undefined variable: System.out.println(unknown);  // Error!");
        System.out.println();
        
        // Correct syntax examples
        int x = 5;  // Correct
        String y = "hello";  // Correct
        System.out.println("Correct syntax examples work fine!");
        System.out.println();
        
        // 2. RUNTIME ERRORS
        System.out.println("2. Runtime Errors:");
        System.out.println("------------------");
        System.out.println("These errors occur when the program runs.");
        System.out.println();
        
        // Division by zero (commented to prevent actual error)
        System.out.println("Example: Division by zero");
        System.out.println("Code: int result = 5 / 0;");
        System.out.println("Error: ArithmeticException: / by zero");
        System.out.println();
        
        // Array index out of bounds
        System.out.println("Example: Array index out of bounds");
        int[] arr = new int[5];
        System.out.println("Array size: " + arr.length);
        System.out.println("Valid indices: 0 to " + (arr.length - 1));
        System.out.println("Code: int value = arr[10];  // Error if index >= 5");
        System.out.println("Error: ArrayIndexOutOfBoundsException");
        System.out.println();
        
        // Null pointer (commented to prevent actual error)
        System.out.println("Example: Null pointer");
        System.out.println("Code: String str = null; int len = str.length();");
        System.out.println("Error: NullPointerException");
        System.out.println();
        
        // Input mismatch (would occur with actual Scanner input)
        System.out.println("Example: Input mismatch");
        System.out.println("Code: Scanner input = new Scanner(System.in);");
        System.out.println("      int num = input.nextInt();  // User enters 'abc'");
        System.out.println("Error: InputMismatchException");
        System.out.println();
        
        // 3. LOGIC ERRORS
        System.out.println("3. Logic Errors:");
        System.out.println("---------------");
        System.out.println("Program runs but produces incorrect results.");
        System.out.println();
        
        // Wrong formula example
        System.out.println("Example 1: Wrong formula");
        int a = 10;
        int b = 20;
        // Wrong: integer division when we want average
        int wrongAverage = (a + b) / 2;
        // Correct: use double
        double correctAverage = (a + b) / 2.0;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Wrong average (int): " + wrongAverage);  // 15 (correct by chance)
        System.out.println("Correct average (double): " + correctAverage);  // 15.0
        System.out.println();
        
        // Off-by-one error example
        System.out.println("Example 2: Off-by-one error");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Correct loop: for (int i = 0; i < numbers.length; i++)");
        System.out.println("Wrong loop: for (int i = 0; i <= numbers.length; i++)  // Out of bounds!");
        System.out.println();
        
        // Wrong operator example
        System.out.println("Example 3: Wrong operator");
        int age = 18;
        // Wrong: assignment instead of comparison
        // if (age = 18) {  // This would be a syntax error, but similar logic error exists
        System.out.println("Wrong: if (age = 18)  // Assignment, not comparison!");
        System.out.println("Correct: if (age == 18)  // Comparison");
        if (age == 18) {
            System.out.println("Age is 18 (correct comparison)");
        }
        System.out.println();
        
        // Incorrect calculation
        System.out.println("Example 4: Incorrect calculation");
        double price = 100.0;
        double taxRate = 0.08;  // 8%
        // Wrong: forgot to add 1 for total
        double wrongTotal = price * taxRate;  // Only tax, not total
        // Correct: total with tax
        double correctTotal = price * (1 + taxRate);
        System.out.println("Price: $" + price);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Wrong total: $" + wrongTotal + " (only tax!)");
        System.out.println("Correct total: $" + correctTotal);
        System.out.println();
        
        // Error Prevention Tips
        System.out.println("Error Prevention Tips:");
        System.out.println("---------------------");
        System.out.println("1. Syntax Errors:");
        System.out.println("   - Use IDE with syntax highlighting");
        System.out.println("   - Compile frequently");
        System.out.println("   - Read error messages carefully");
        System.out.println();
        System.out.println("2. Runtime Errors:");
        System.out.println("   - Validate input");
        System.out.println("   - Check array bounds");
        System.out.println("   - Handle exceptions");
        System.out.println("   - Test edge cases");
        System.out.println();
        System.out.println("3. Logic Errors:");
        System.out.println("   - Plan algorithm carefully");
        System.out.println("   - Test with known values");
        System.out.println("   - Use debugger");
        System.out.println("   - Add print statements for debugging");
        System.out.println("   - Code review");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}

