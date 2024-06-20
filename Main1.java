package day1;
interface Vehicle {
    void start();
    void stop();
}

// LandVehicle.java
interface LandVehicle extends Vehicle {
    void drive();
}

// SeaVehicle.java
 interface SeaVehicle extends Vehicle {
    void floatOnWater();
}

// Car.java
class Car implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}

// Bicycle.java
 class Bicycle implements LandVehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping.");
    }

    @Override
    public void drive() {
        System.out.println("Bicycle is being ridden.");
    }
}

// Ship.java
class Ship implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Ship is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Ship is stopping.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Ship is floating on water.");
    }
}

// Submarine.java
 class Submarine implements SeaVehicle {
    @Override
    public void start() {
        System.out.println("Submarine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Submarine is stopping.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Submarine is floating on water.");
    }
}
public class Main1 {

	public static void main(String[] args) {
		// Create instances of each vehicle
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Ship ship = new Ship();
        Submarine submarine = new Submarine();

        // Test Car methods
        System.out.println("Testing Car:");
        car.start();
        car.drive();
        car.stop();
        System.out.println("---------");

        // Test Bicycle methods
        System.out.println("Testing Bicycle:");
        bicycle.start();
        bicycle.drive();
        bicycle.stop();
        System.out.println("---------");

        // Test Ship methods
        System.out.println("Testing Ship:");
        ship.start();
        ship.floatOnWater();
        ship.stop();
        System.out.println("---------");

        // Test Submarine methods
        System.out.println("Testing Submarine:");
        submarine.start();
        submarine.floatOnWater();
        submarine.stop();
        System.out.println("---------");

	}


	}


