package inheritance;
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
    
    // Concrete method to display shape
    void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    private double radius;
    
    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementation of abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementation of abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}
public class Main4 {

	public static void main(String[] args) {
		// Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        
        // Displaying shapes
        circle.display();
        System.out.println("Area of Circle: " + circle.calculateArea());
        
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}

}
