import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Hangman {

    public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra" };

    public static String[] gallows = { "+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" + // if you were wondering, the only way to print '\' is with a trailing escape
                                  // character, which also happens to be '\'
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n" };

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Get random word from list
        String word = randomWord();

        // Split word into letters
        String[] letters = word.split("");

        // Get length of word
        int wordLength = letters.length;

        // Create new array of word length
        String[] placeholder = new String[wordLength];

        // Fill new array with empty lines
        Arrays.fill(placeholder, "_");

        // Counter for mistakes
        int mistakes = 0;

        // Array for wrong guesses
        String[] misses = new String[6];

        String guess = "";

        // Board
        while (mistakes <= 6) {
            System.out.println(gallows[mistakes]);
            printPlaceholder(placeholder);
            printMisses(misses);
            System.out.println("Guess: " + guess);
            // System.out.println(Arrays.toString(letters));

            if (Arrays.equals(letters, placeholder)) {
                System.out.println("\nYou Win!");
                break;
            }

            if (mistakes == 6) {
                System.out.println("\nGame Over. The word was: " + word + ".");
                break;
            }

            System.out.println("\nGuess a letter.");
            guess = scan.next();

            if (checkGuess(guess, word)) {
                updatePlaceholder(guess, letters, placeholder);
            } else {
                misses[mistakes] = guess;
                mistakes++;
            }
        }

    }

    // Return a random word from the list
    public static String randomWord() {
        double randomNum = Math.random() * 64;
        int randomInt = (int) randomNum;
        return words[randomInt];
    }

    // Print the placeholder
    public static void printPlaceholder(String[] placeholder) {
        System.out.print("Word: \t");
        for (int i = 0; i < placeholder.length; i++) {
            System.out.print(placeholder[i] + " ");
        }
        System.out.println("\n");
    }

    // Print the misses
    public static void printMisses(String[] misses) {
        System.out.print("Misses: ");
        for (int i = 0; i < misses.length; i++) {
            if (misses[i] == null) {
                System.out.print("");
            } else {
                System.out.print(misses[i]);
            }

        }
        System.out.println("\n");
    }

    // Checks if letter in word
    public static boolean checkGuess(String letter, String word) {
        boolean result = word.contains(letter);
        return result;
    }

    // Updates the placeholder
    public static void updatePlaceholder(String letter, String[] word, String[] placeholder) {
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(letter)) {
                placeholder[i] = letter;
            }
        }
    }

}
