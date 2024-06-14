package example.calculator;
public interface Operation {
    double calculate(double a, double b);
}
public class Addition implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
public class Subtraction implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
public class Multiplication implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
public class Division implements Operation {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
public class Calculator {

	public static void main(String[] args) {
		Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();

        double a = 10;
        double b = 5;

        System.out.println(a + " + " + b + " = " + add.calculate(a, b));
        System.out.println(a + " - " + b + " = " + sub.calculate(a, b));
        System.out.println(a + " * " + b + " = " + mul.calculate(a, b));
        System.out.println(a + " / " + b + " = " + div.calculate(a, b));
	}

}
