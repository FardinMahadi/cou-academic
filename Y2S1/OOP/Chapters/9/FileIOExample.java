import java.io.*;
import java.util.*;

public class FileIOExample {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
        }

        // Create a file and write to it
        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }

        // Read from file
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + mi + " " + lastName + " " + score);
            }
        }
    }
}
