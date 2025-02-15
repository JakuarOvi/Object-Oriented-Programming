/*
Task 5: 
Create a class hierarchy to model different types of electronic devices.
• Start with a base class called "Device" with attributes "brand" and "totalUnit",
along with a method to display device information.
• Add a method in the Device class to compute the sum of all the digits in the
totalUnit variable.
• Then, create two subclasses "Phone" and "Laptop" that inherit from the Device
class.
• Add specific attributes and methods for each subclass.
• Finally, create instances of both Phone and Laptop classes and demonstrate the
inheritance and method overriding.

Output:
Phone Information:
Brand: Apple
Total Unit: 150
Operating System: iOS
The sum of 150 is 6.

Laptop Information:
Brand: Dell
Total Unit: 125
Screen Size: 15.6 inches
The sum of 125 is 8.
*/

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
