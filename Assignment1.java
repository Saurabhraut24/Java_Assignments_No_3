abstract class Vehicle {
    protected String brand;
    protected int speed; 

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void start();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

interface FuelEfficient {
    double calculateMileage();
}

class Car extends Vehicle implements FuelEfficient {
    private double engineCapacity;

    public Car(String brand, int speed, double engineCapacity) {
        super(brand, speed);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        System.out.println("Car Started...");
    }

    @Override
    public double calculateMileage() {
        return Math.max(5.0, 22.0 - engineCapacity * 2.0);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Car car = new Car("Honda", 80, 1.5);

        car.displayInfo();
        car.start();
        System.out.println("Mileage: " + (int) car.calculateMileage() + " km/l");
    }
}