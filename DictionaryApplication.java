package day2;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApplication {

	public static void main(String[] args) {
		 // Create a TreeMap to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input word-definition pairs and add them to the dictionary
        System.out.println("Enter number of word-definition pairs to add:");
        int numPairs = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numPairs; i++) {
            System.out.println("Enter word:");
            String word = scanner.nextLine();
            System.out.println("Enter definition:");
            String definition = scanner.nextLine();
            dictionary.put(word, definition);
        }

        // Retrieve and display the definition of a specific word
        System.out.println("Enter a word to retrieve its definition:");
        String searchWord = scanner.nextLine();
        if (dictionary.containsKey(searchWord)) {
            System.out.println(searchWord + ": " + dictionary.get(searchWord));
        } else {
            System.out.println("Word not found in the dictionary.");
        }

        // Iterate through the dictionary and display all word-definition pairs
        System.out.println("\nAll word-definition pairs in alphabetical order:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the Scanner
        scanner.close();	

	}

}
