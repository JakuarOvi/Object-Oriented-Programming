/*
Task 6 - Online Shopping Cart:
Build an online shopping cart with various product types like Electronics
and Clothing that inherit from a common Product class.
Encapsulate attributes in the base class: name, price and quantity.
Implement polymorphism with the following methods:
calculateTotalCost(): Calculate and return the total cost of the product.
displayProductInfo(): Display the product name, price, and quantity.
*/

package ovi.task6;
import java.util.*;

// Base class
abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public abstract double calculateTotalCost();
    
    public void displayProductInfo() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Derived class - Electronics
class Electronics extends Product {
    private int warrantyPeriod;
    
    public Electronics(String name, double price, int quantity, int warrantyPeriod) {
        super(name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }
    
    @Override
    public double calculateTotalCost() {
        return price * quantity;
    }
    
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

// Derived class - Clothing
class Clothing extends Product {
    private String size;
    private String material;
    
    public Clothing(String name, double price, int quantity, String size, String material) {
        super(name, price, quantity);
        this.size = size;
        this.material = material;
    }
    
    @Override
    public double calculateTotalCost() {
        return price * quantity;
    }
    
    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size + ", Material: " + material);
    }
}

public class Task6{
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 1000.0, 2, 2);
        Clothing tshirt = new Clothing("T-Shirt", 25.0, 3, "M", "Cotton");
        
        laptop.displayProductInfo();
        System.out.println("Total Cost: " + laptop.calculateTotalCost());
        
        tshirt.displayProductInfo();
        System.out.println("Total Cost: " + tshirt.calculateTotalCost());
    }
}

