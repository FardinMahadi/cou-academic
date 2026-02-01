/**
 * DeckOfCards.java
 * 
 * Case study: Represent and shuffle a deck of cards.
 * 
 * Key Concepts:
 * - Representing cards as integers
 * - Shuffling algorithm
 * - Array manipulation
 */
import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("=== Deck of Cards ===");
        System.out.println();
        
        // Initialize deck
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                         "Jack", "Queen", "King"};
        
        // Initialize deck with values 0-51
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        
        System.out.println("Initial deck (first 10 cards):");
        printCards(deck, suits, ranks, 0, 10);
        System.out.println();
        
        // Shuffle deck
        shuffleDeck(deck);
        
        System.out.println("Shuffled deck (first 10 cards):");
        printCards(deck, suits, ranks, 0, 10);
        System.out.println();
        
        // Deal first 5 cards
        System.out.println("First 5 cards dealt:");
        printCards(deck, suits, ranks, 0, 5);
        System.out.println();
        
        // Deal next 5 cards
        System.out.println("Next 5 cards dealt:");
        printCards(deck, suits, ranks, 5, 5);
        System.out.println();
    }
    
    /**
     * Shuffles the deck using Fisher-Yates algorithm
     * @param deck The deck to shuffle
     */
    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            // Generate random index from i to deck.length-1
            int j = (int)(Math.random() * (deck.length - i)) + i;
            
            // Swap deck[i] and deck[j]
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
    
    /**
     * Prints cards from deck
     * @param deck The deck array
     * @param suits Array of suit names
     * @param ranks Array of rank names
     * @param start Starting index
     * @param count Number of cards to print
     */
    public static void printCards(int[] deck, String[] suits, String[] ranks,
                                  int start, int count) {
        for (int i = start; i < start + count && i < deck.length; i++) {
            int card = deck[i];
            int suit = card / 13;
            int rank = card % 13;
            System.out.println(ranks[rank] + " of " + suits[suit]);
        }
    }
}

