/**
 * ComputerBasics.java
 * 
 * This program demonstrates basic Java program structure and execution.
 * It shows how a simple Java program is organized and executed.
 * 
 * Key Concepts:
 * - Class declaration
 * - Main method (entry point)
 * - System output
 * - Program execution flow
 */
public class ComputerBasics {
    
    /**
     * Main method - the entry point of the program
     * The JVM calls this method when the program starts
     * 
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Display information about program execution
        System.out.println("=== Computer Basics Demonstration ===");
        System.out.println();
        
        // Show program structure
        System.out.println("Program Structure:");
        System.out.println("1. Source Code: ComputerBasics.java");
        System.out.println("2. Compilation: javac ComputerBasics.java");
        System.out.println("3. Bytecode: ComputerBasics.class");
        System.out.println("4. Execution: java ComputerBasics");
        System.out.println();
        
        // Demonstrate basic output
        System.out.println("This program demonstrates:");
        System.out.println("- How Java source code is written");
        System.out.println("- How the compiler creates bytecode");
        System.out.println("- How the JVM executes the bytecode");
        System.out.println();
        
        // Show platform information
        System.out.println("Platform Information:");
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.name"));
        System.out.println("JVM Version: " + System.getProperty("java.vm.version"));
        System.out.println();
        
        System.out.println("=== Program Execution Complete ===");
    }
}


