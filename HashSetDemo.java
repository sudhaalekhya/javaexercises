package day1;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		 // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add the numbers 5, 10, 15, 20, and 25 to the set
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Display the elements of the set
        System.out.println("Elements in the set: " + numbers);

        // Check if the set contains the number 10
        if (numbers.contains(10)) {
            System.out.println("The set contains the number 10.");
        } else {
            System.out.println("The set does not contain the number 10.");
        }

        // Remove the number 15 from the set
        numbers.remove(15);

        // Display the size of the set
        System.out.println("Size of the set after removing 15: " + numbers.size());
	}

}
