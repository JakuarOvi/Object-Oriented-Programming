package com.mycompany.main;

/**
 *
 * @author Gcl
 */
class Vehicle {
    protected String makeBy;
    protected int makingYear;

    public Vehicle(String makeBy, int makingYear) {
        this.makeBy = makeBy;
        this.makingYear = makingYear;
    }

    public void displayInfo() {
        System.out.println("Make: " + makeBy);
        System.out.println("Year: " + makingYear);
    }

    public boolean isPalindromeYear() {
        String yearStr = Integer.toString(makingYear);
        return yearStr.equals(new StringBuilder(yearStr).reverse().toString());
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String makeBy, int makingYear, int numDoors) {
        super(makeBy, makingYear);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information:");
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println(isPalindromeYear() ? "This Car manufacturing year is a palindrome.\n" : "The Car manufacturing year is not a palindrome.\n");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String makeBy, int makingYear, boolean hasSidecar) {
        super(makeBy, makingYear);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
        System.out.println(isPalindromeYear() ? "This Motorcycle manufacturing year is a palindrome.\n" : "The Motorcycle manufacturing year is not a palindrome.\n");
    }
}

// The public class must match the file name: Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2002, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2003, true);

        car.displayInfo();
        motorcycle.displayInfo();
    }
}
