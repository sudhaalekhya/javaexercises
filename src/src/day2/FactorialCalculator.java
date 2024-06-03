package day2;
import java.util.Scanner;
public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        // Calculate factorial using iterative method
        long iterativeResult = factorialIterative(number);
        System.out.println("Factorial of " + number + " using iterative approach is: " + iterativeResult);

        // Calculate factorial using recursive method
        long recursiveResult = factorialRecursive(number);
        System.out.println("Factorial of " + number + " using recursive approach is: " + recursiveResult);

        scanner.close();
    }

    // Iterative method to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
	
	}


