package day2;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string from the user
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        
        // Input the word to be counted
        System.out.println("Enter the word to count:");
        String wordToCount = scanner.nextLine();
        
        // Convert the input string to lowercase to ensure the count is case-insensitive
        inputString = inputString.toLowerCase();
        wordToCount = wordToCount.toLowerCase();
        
        // Split the string into words
        String[] words = inputString.split("\\s+");
        
        // Count the occurrences of the word
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        
        // Print the result
        System.out.println("The word \"" + wordToCount + "\" occurs " + count + " times.");
        
        scanner.close();
	

	}

}
