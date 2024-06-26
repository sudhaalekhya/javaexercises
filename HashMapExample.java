package day2;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {

	public static void main(String[] args) {
		// Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the key from the user
        System.out.println("Enter the key:");
        String key = scanner.nextLine();

        // Input the value from the user
        System.out.println("Enter the value:");
        String value = scanner.nextLine();

        // Associate the specified value with the specified key in the HashMap
        map.put(key, value);

        // Print the HashMap to show the result
        System.out.println("The HashMap contains: " + map);

        // Close the Scanner
        scanner.close();	

	}

}
