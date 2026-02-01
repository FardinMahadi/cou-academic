/**
 * Lottery.java
 * 
 * Case study: Lottery number matching game.
 * 
 * Rules:
 * - Generate a random 2-digit lottery number
 * - User enters a 2-digit guess
 * - Prizes:
 *   - Exact match: $10,000
 *   - All digits match (reversed): $3,000
 *   - One digit matches: $1,000
 *   - No match: $0
 * 
 * Key Concepts:
 * - Random number generation
 * - Digit extraction
 * - Complex conditional logic
 * - Logical operators
 */
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Lottery Game ===");
        System.out.println();
        
        // Generate a random 2-digit lottery number (00-99)
        int lottery = (int)(Math.random() * 100);
        
        // Ensure it's 2 digits (pad with leading zero if needed)
        System.out.println("Lottery number generated!");
        System.out.println();
        
        // Get user's guess
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        
        // Extract digits from lottery number
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        
        // Extract digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        System.out.println();
        System.out.println("Lottery number: " + 
                          (lottery < 10 ? "0" + lottery : lottery));
        System.out.println("Your guess: " + 
                          (guess < 10 ? "0" + guess : guess));
        System.out.println();
        
        // Check for matches
        System.out.println("Matching Analysis:");
        System.out.println("-----------------");
        System.out.println("Lottery digits: " + lotteryDigit1 + " and " + lotteryDigit2);
        System.out.println("Your digits: " + guessDigit1 + " and " + guessDigit2);
        System.out.println();
        
        // Determine prize
        if (guess == lottery) {
            // Exact match
            System.out.println("*** EXACT MATCH ***");
            System.out.println("You win $10,000!");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            // All digits match (reversed order)
            System.out.println("*** ALL DIGITS MATCH ***");
            System.out.println("You win $3,000!");
        } else if (guessDigit1 == lotteryDigit1 || 
                   guessDigit1 == lotteryDigit2 ||
                   guessDigit2 == lotteryDigit1 || 
                   guessDigit2 == lotteryDigit2) {
            // One digit matches
            System.out.println("*** ONE DIGIT MATCHES ***");
            System.out.println("You win $1,000!");
        } else {
            // No match
            System.out.println("*** NO MATCH ***");
            System.out.println("Sorry, you win $0");
        }
        System.out.println();
        
        // Detailed match information
        System.out.println("Detailed Match Information:");
        System.out.println("--------------------------");
        boolean digit1MatchesLottery1 = (guessDigit1 == lotteryDigit1);
        boolean digit1MatchesLottery2 = (guessDigit1 == lotteryDigit2);
        boolean digit2MatchesLottery1 = (guessDigit2 == lotteryDigit1);
        boolean digit2MatchesLottery2 = (guessDigit2 == lotteryDigit2);
        
        System.out.println("Your first digit matches lottery first digit: " + digit1MatchesLottery1);
        System.out.println("Your first digit matches lottery second digit: " + digit1MatchesLottery2);
        System.out.println("Your second digit matches lottery first digit: " + digit2MatchesLottery1);
        System.out.println("Your second digit matches lottery second digit: " + digit2MatchesLottery2);
        System.out.println();
        
        // Test with multiple scenarios
        System.out.println("Example Scenarios:");
        System.out.println("-----------------");
        System.out.println("Scenario 1: Lottery = 12, Guess = 12");
        System.out.println("  → Exact match: $10,000");
        System.out.println();
        System.out.println("Scenario 2: Lottery = 12, Guess = 21");
        System.out.println("  → All digits match (reversed): $3,000");
        System.out.println();
        System.out.println("Scenario 3: Lottery = 12, Guess = 13");
        System.out.println("  → One digit matches: $1,000");
        System.out.println();
        System.out.println("Scenario 4: Lottery = 12, Guess = 34");
        System.out.println("  → No match: $0");
        System.out.println();
        
        input.close();
        System.out.println("=== Game Complete ===");
    }
}

