public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = new String("Welcome to Java");

        // Comparison
        System.out.println("s1 == s2: " + (s1 == s2)); // true (interning)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (new object)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content comparison)

        // Manipulation
        System.out.println("Length: " + s1.length());
        System.out.println("Lower case: " + s1.toLowerCase());
        System.out.println("Substring(0, 7): " + s1.substring(0, 7));

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is fun");
        sb.insert(4, " programming");
        sb.reverse();
        System.out.println("StringBuilder result: " + sb.toString());
    }
}
