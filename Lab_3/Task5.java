package com.mycompany.task5;
class Device {
    String brand;
    int totalUnit;

    public Device(String brand, int totalUnit) {
        this.brand = brand;
        this.totalUnit = totalUnit;
    }

    public void displayDeviceInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Total Unit: " + totalUnit);
    }

    public int sumOfDigits() {
        int sum = 0;
        while (totalUnit > 0) {
            sum += totalUnit % 10;
            totalUnit /= 10;
        }
        return sum;
    }
}

class Phone extends Device {
    String operatingSystem;

    public Phone(String brand, int totalUnit, String operatingSystem) {
        super(brand, totalUnit);
        this.operatingSystem = operatingSystem;
    }

    public void displayPhoneInfo() {
        System.out.println("\nPhone Information:");
        displayDeviceInfo();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("The sum of " + totalUnit + " is " + sumOfDigits() + ".");
    }
}

class Laptop extends Device {
    double screenSize;

    public Laptop(String brand, int totalUnit, double screenSize) {
        super(brand, totalUnit);
        this.screenSize = screenSize;
    }

    public void displayLaptopInfo() {
        System.out.println("\nLaptop Information:");
        displayDeviceInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("The sum of " + totalUnit + " is " + sumOfDigits() + ".");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", 150, "iOS");
        Laptop laptop = new Laptop("Dell", 125, 15.6);

        phone.displayPhoneInfo();
        laptop.displayLaptopInfo();
    }
}
