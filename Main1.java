package inheritance;
//Engine class
class Engine {
 public void start() {
     System.out.println("Engine started");
 }
}

//Wheel class
class Wheel {
 private int size;

 public Wheel(int size) {
     this.size = size;
 }

 public void rotate() {
     System.out.println("Wheel rotating");
 }
}

//Body class
class Body {
 private String color;

 public Body(String color) {
     this.color = color;
 }

 public void displayColor() {
     System.out.println("Body color: " + color);
 }
}

//Car class using composition
class Car {
 private Engine engine;
 private Wheel[] wheels;
 private Body body;

 public Car() {
     // Create engine object
     engine = new Engine();

     // Create four wheels
     wheels = new Wheel[4];
     for (int i = 0; i < 4; i++) {
         wheels[i] = new Wheel(17); // Assuming wheel size is 17 inches
     }

     // Create body object
     body = new Body("Red");
 }

 public void startCar() {
     engine.start();
 }

 public void drive() {
     for (Wheel wheel : wheels) {
         wheel.rotate();
     }
 }

 public void displayColor() {
     body.displayColor();
 }
}

//Main class to test composition
public class Main1 {

	public static void main(String[] args) {
		 Car myCar = new Car();
	        myCar.startCar();
	        myCar.drive();
	        myCar.displayColor();

	}

}
