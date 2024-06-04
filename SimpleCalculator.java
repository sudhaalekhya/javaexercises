package day2;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter an operation (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);

	        double result;

	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("The result is: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("The result is: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("The result is: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("The result is: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                break;
	        }

	        scanner.close();
	    
	

	}

}
