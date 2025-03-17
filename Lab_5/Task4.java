/*
Task 4 - Vehicle Rental:
Develop a vehicle rental system with different types of vehicles like Cars
and Bikes that inherit from a common Vehicle class.
Encapsulate attributes in the base class: make, model and rentalRate.
Implement polymorphism with the following methods:
calculateRentalCost(int days): Calculate and return the rental cost for the
specified number of days.
displayVehicleInfo(): Display the make, model, and rental rate.
*/

package ovi.task4;
import java.util.*;

// Base class
abstract class Vehicle {
    protected String make;
    protected String model;
    protected double rentalRate;
    
    public Vehicle(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }
    
    public abstract double calculateRentalCost(int days);
    
    public void displayVehicleInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Rental Rate: " + rentalRate);
    }
}

// Derived class - Car
class Car extends Vehicle {
    private boolean luxury;
    
    public Car(String make, String model, double rentalRate, boolean luxury) {
        super(make, model, rentalRate);
        this.luxury = luxury;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return luxury ? rentalRate * days * 1.2 : rentalRate * days;
    }
}

// Derived class - Bike
class Bike extends Vehicle {
    private boolean electric;
    
    public Bike(String make, String model, double rentalRate, boolean electric) {
        super(make, model, rentalRate);
        this.electric = electric;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return electric ? rentalRate * days * 1.1 : rentalRate * days;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 50.0, true);
        Bike bike = new Bike("Yamaha", "MT-15", 20.0, false);
        
        car.displayVehicleInfo();
        System.out.println("Rental Cost for 5 days: " + car.calculateRentalCost(5));
        
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for 3 days: " + bike.calculateRentalCost(3));
    }
}