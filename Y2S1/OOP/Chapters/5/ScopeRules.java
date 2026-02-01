/**
 * ScopeRules.java
 * 
 * Demonstrates variable scope rules in Java.
 * 
 * Key Concepts:
 * - Local variables
 * - Parameter scope
 * - Block scope
 * - Variable shadowing
 * - Variable lifetime
 */
public class ScopeRules {
    // Class-level variable (not used in this example, but exists)
    
    public static void main(String[] args) {
        System.out.println("=== Variable Scope Rules ===");
        System.out.println();
        
        // Local variable in main
        int x = 10;
        System.out.println("1. Local Variable in main:");
        System.out.println("--------------------------");
        System.out.println("x in main: " + x);
        System.out.println();
        
        // Call method with parameter
        System.out.println("2. Parameter Scope:");
        System.out.println("-------------------");
        demonstrateParameterScope(5);
        System.out.println();
        
        // Block scope
        System.out.println("3. Block Scope:");
        System.out.println("--------------");
        demonstrateBlockScope();
        System.out.println();
        
        // Variable shadowing
        System.out.println("4. Variable Shadowing:");
        System.out.println("---------------------");
        int value = 100;
        System.out.println("value before block: " + value);
        {
            int value2 = 200;  // Different variable
            System.out.println("value2 in block: " + value2);
            System.out.println("value in block (outer): " + value);
        }
        // value2 is not accessible here
        System.out.println("value after block: " + value);
        System.out.println();
        
        // Method local variables
        System.out.println("5. Method Local Variables:");
        System.out.println("-------------------------");
        demonstrateLocalVariables();
        System.out.println();
    }
    
    /**
     * Demonstrates parameter scope
     * Parameter 'x' is local to this method
     */
    public static void demonstrateParameterScope(int x) {
        System.out.println("Parameter x in method: " + x);
        // Can modify parameter (but doesn't affect caller)
        x = 20;
        System.out.println("Parameter x after modification: " + x);
        
        // Local variable in method
        int y = 30;
        System.out.println("Local variable y: " + y);
    }
    
    /**
     * Demonstrates block scope
     */
    public static void demonstrateBlockScope() {
        int outer = 10;
        System.out.println("outer variable: " + outer);
        
        if (true) {
            int inner = 20;  // Local to if block
            System.out.println("inner variable: " + inner);
            System.out.println("outer variable in block: " + outer);
        }
        
        // inner is not accessible here
        // System.out.println(inner);  // Error!
        System.out.println("outer variable after block: " + outer);
    }
    
    /**
     * Demonstrates local variables in methods
     */
    public static void demonstrateLocalVariables() {
        int a = 1;
        System.out.println("a = " + a);
        
        {
            int b = 2;
            System.out.println("a = " + a + ", b = " + b);
            
            {
                int c = 3;
                System.out.println("a = " + a + ", b = " + b + ", c = " + c);
            }
            // c is not accessible here
            System.out.println("a = " + a + ", b = " + b);
        }
        // b and c are not accessible here
        System.out.println("a = " + a);
    }
}

