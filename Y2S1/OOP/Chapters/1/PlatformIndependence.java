/**
 * PlatformIndependence.java
 * 
 * This program demonstrates Java's platform independence feature.
 * The same bytecode can run on any platform with a JVM installed.
 * 
 * Key Concepts:
 * - Platform independence through bytecode
 * - JVM abstraction layer
 * - System properties to identify platform
 */
public class PlatformIndependence {
    
    /**
     * Main method demonstrates platform independence
     */
    public static void main(String[] args) {
        System.out.println("=== Java Platform Independence Demonstration ===");
        System.out.println();
        
        // Display platform-specific information
        // This shows that the same code can run on different platforms
        System.out.println("Current Platform Information:");
        System.out.println("---------------------------");
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("OS Architecture: " + System.getProperty("os.arch"));
        System.out.println();
        
        // Display Java platform information
        System.out.println("Java Platform Information:");
        System.out.println("---------------------------");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
        System.out.println("JVM Version: " + System.getProperty("java.vm.version"));
        System.out.println();
        
        // Demonstrate that the same bytecode runs on different platforms
        System.out.println("Key Point:");
        System.out.println("The same .class file (bytecode) can run on:");
        System.out.println("- Windows (with Windows JVM)");
        System.out.println("- macOS (with macOS JVM)");
        System.out.println("- Linux (with Linux JVM)");
        System.out.println("- Any platform with a compatible JVM");
        System.out.println();
        
        System.out.println("This is Java's 'Write Once, Run Anywhere' principle!");
        System.out.println();
        
        // Show file separator (platform-specific)
        System.out.println("Platform-Specific Details:");
        System.out.println("File Separator: '" + System.getProperty("file.separator") + "'");
        System.out.println("Line Separator: '" + System.getProperty("line.separator").replace("\n", "\\n").replace("\r", "\\r") + "'");
        System.out.println("Path Separator: '" + System.getProperty("path.separator") + "'");
        System.out.println();
        
        System.out.println("=== Demonstration Complete ===");
    }
}


