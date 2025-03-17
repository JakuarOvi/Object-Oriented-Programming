/*
Task 1 - Shape Hierarchy:
Create a class hierarchy for geometric shapes like Circle and Rectangle
with a common base class, Shape.
Encapsulate attributes in the base class: area and color.
Implement polymorphism with the following methods:
calculateArea(): Calculate and return the area of the shape.
displayInfo(): Display the color and area of the shape.
*/
package ovi.task1;


// Base class
abstract class Shape {
    protected double area;
    protected String color;
    
    public Shape(String color) {
        this.color = color;
        this.area = 0;
    }
    
    abstract void calculateArea();
    
    public void displayInfo() {
        System.out.println("Color: " + color + ", Area: " + area);
    }
}

// Derived class - Circle
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
    
    @Override
    public void displayInfo() {
        calculateArea();
        System.out.print("Shape: Circle, ");
        super.displayInfo();
    }
}

// Derived class - Rectangle
class Rectangle extends Shape {
    private double width, height;
    
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void calculateArea() {
        area = width * height;
    }
    
    @Override
    public void displayInfo() {
        calculateArea();
        System.out.print("Shape: Rectangle, ");
        super.displayInfo();
    }
}

public class Task1 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, "Red");
        Rectangle r = new Rectangle(4.0, 6.0, "Blue");
        
        c.displayInfo();
        r.displayInfo();
    }
}
