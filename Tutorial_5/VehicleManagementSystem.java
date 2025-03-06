class Vehicle {
    int speed; // Speed in km/h
    double fuel; // Fuel in liters

    Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    void move() {
        System.out.println("Vehicle moving at speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    boolean hasAirConditioner;

    Car(int speed, double fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    void turnOnAC() {
        if (hasAirConditioner) {
            System.out.println("Air Conditioner is ON.");
        } else {
            System.out.println("Air Conditioner is unavailable.");
        }
    }
}

class Bike extends Vehicle {
    boolean hasKickStart;

    Bike(int speed, double fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    void startBike() {
        if (hasKickStart) {
            System.out.println("Bike has Kick-Start.");
        } else {
            System.out.println("Bike has Self-Start.");
        }
    }
}

class Truck extends Vehicle {
    int cargoCapacity;

    Truck(int speed, double fuel, int cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    void loadCargo() {
        System.out.println("Truck can load up to " + cargoCapacity + " kg.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car = new Car(120, 50, true);
        Bike bike = new Bike(80, 10, false);
        Truck truck = new Truck(60, 200, 5000);

        System.out.println("Car:");
        car.move();
        car.turnOnAC();

        System.out.println("\nBike:");
        bike.move();
        bike.startBike();

        System.out.println("\nTruck:");
        truck.move();
        truck.loadCargo();
    }
}
