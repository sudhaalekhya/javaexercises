package operators;

public class ArithmeticAssignmentExample {

	public static void main(String[] args) {
		// Addition and Assignment (+=)
        int x = 5;
        x += 3; // Equivalent to x = x + 3
        System.out.println("x after addition: " + x); // Output: 8
        
        // Subtraction and Assignment (-=)
        int y = 10;
        y -= 4; // Equivalent to y = y - 4
        System.out.println("y after subtraction: " + y); // Output: 6
        
        // Multiplication and Assignment (*=)
        int z = 3;
        z *= 5; // Equivalent to z = z * 5
        System.out.println("z after multiplication: " + z); // Output: 15
        
        // Division and Assignment (/=)
        int a = 20;
        a /= 4; // Equivalent to a = a / 4
        System.out.println("a after division: " + a); // Output: 5
        
        // Modulus and Assignment (%=)
        int b = 17;
        b %= 5; // Equivalent to b = b % 5
        System.out.println("b after modulus: " + b); // Output: 2
	}

}
