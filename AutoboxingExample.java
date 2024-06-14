
public class AutoboxingExample {
	 // Method to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Method to add an Integer and a Double (autoboxing)
    public double add(Integer a, Double b) {
        System.out.println("Adding an Integer and a Double (autoboxing)");
        return a.doubleValue() + b;
    }

	public static void main(String[] args) {
		AutoboxingExample example = new AutoboxingExample();

        // Call the overloaded methods with different parameter types
        System.out.println("Result (int): " + example.add(5, 3));
        System.out.println("Result (double): " + example.add(5.5, 3.3));
        System.out.println("Result (Integer, Double): " + example.add(5, 3.3));

	}

}
