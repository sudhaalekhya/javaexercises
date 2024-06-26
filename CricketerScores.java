package day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CricketerScores {

	public static void main(String[] args) {
		// Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Populate the map with some cricketer names and scores
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Ricky Ponting", 13704);
        cricketerScores.put("Brian Lara", 10405);
        cricketerScores.put("AB de Villiers", 9577);

        // Ask the user for the cricketer's name to search
        System.out.println("Enter the cricketer's name to search for his score:");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer's score
        if (cricketerScores.containsKey(cricketerName)) {
            int score = cricketerScores.get(cricketerName);
            System.out.println(cricketerName + "'s score is: " + score);
        } else {
            System.out.println("Cricketer not found in the records.");
        }

        // Close the Scanner
        scanner.close();

	}

}
