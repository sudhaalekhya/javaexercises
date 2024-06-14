package inheritance;
//Superclass
class Shape {
 public double calculateArea() {
     return 0.0; // Default implementation for unknown shapes
 }
}

//Subclass 1
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Subclass 2
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double calculateArea() {
     return length * width;
 }
}

//Subclass 3
class Triangle extends Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return 0.5 * base * height;
 }
}

public class Main2 {

	public static void main(String[] args) {
		 // Creating objects of Circle, Rectangle, and Triangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0);
     // Calculating and printing the area of each shape
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
	}

}
