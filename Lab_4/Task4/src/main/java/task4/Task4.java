/*
Task 4:
Create a multi-level inheritance hierarchy for vehicles. Start with an
abstract base class "Vehicle" with final attributes "manufacturerName" and
"modelYear". Add a static counter "totalVehicles". Create an intermediate
abstract class "PoweredVehicle" that extends Vehicle and adds an abstract
method "startEngine()". Finally, create concrete classes "Car" and
"Motorcycle" that extend PoweredVehicle and implement the abstract
methods. Each concrete class should increment the static counter in its
constructor. Create a static method in the Vehicle class to report statistics
about all vehicles created.

Sample Output:
Car - Toyota Corolla (2022): Engine started.
Motorcycle - Yamaha R1 (2021): Engine started.

Total vehicles created: 2
*/
package task4;
 class Vehicle {
    static int totalVehicles = 0;
    String manufacturerName;
    int modelYear;

    public Vehicle(String manufacturerName, int modelYear) {
        this.manufacturerName = manufacturerName;
        this.modelYear = modelYear;
        totalVehicles++;
    }

    public static void reportStatistics() {
        System.out.println("Total vehicles created: " + totalVehicles);
    }
}

abstract class PoweredVehicle extends Vehicle {
    public PoweredVehicle(String manufacturerName, int modelYear) {
        super(manufacturerName, modelYear);
    }

    public abstract void startEngine();
}

class Car extends PoweredVehicle {
    public Car(String manufacturerName, int modelYear) {
        super(manufacturerName, modelYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Car - " + manufacturerName + " " + modelYear + ": Engine started.");
    }
}

class Motorcycle extends PoweredVehicle {
    public Motorcycle(String manufacturerName, int modelYear) {
        super(manufacturerName, modelYear);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle - " + manufacturerName + " " + modelYear + ": Engine started.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla", 2022);
        Motorcycle motorcycle = new Motorcycle("Yamaha R1", 2021);

        car.startEngine();
        motorcycle.startEngine();

        Vehicle.reportStatistics();
    }
}
