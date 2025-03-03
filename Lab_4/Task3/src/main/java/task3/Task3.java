/*
Task 3: 
Create an abstract class called "Shape" with a final attribute "color"
and static attribute "shapeCount". Include abstract methods
"calculateArea()" and "calculatePerimeter()". Create two subclasses
"Circle" and "Rectangle" that inherit from Shape and implement the
abstract methods. Add a static method "getTotalShapes()" to the Shape
class. Create a program that instantiates various shapes, calculates their
areas and perimeters, and displays the total count of shapes created.

Sample Output:
Circle (Red): Area = 78.54, Perimeter = 31.42
Rectangle (Blue): Area = 20.0, Perimeter = 18.0

Total shapes created: 2
*/
package task3;
abstract class Shape {
    private final String color;  
    private static int shapeCount = 0;  

    public Shape(String color) {
        this.color = color;
        shapeCount++;  
    }

    public String getColor() {
        return color;
    }
    public static int getTotalShapes() {
        return shapeCount;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
     double radius;

    public Circle(String color, double radius) {
        super(color);  
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.printf("Circle (%s): Area = %.2f, Perimeter = %.2f\n", getColor(), calculateArea(), calculatePerimeter());
    }
}

class Rectangle extends Shape {
     double length;
     double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails() {
        System.out.printf("Rectangle (%s): Area = %.2f, Perimeter = %.2f\n", getColor(), calculateArea(), calculatePerimeter());
    }
}

public class Task3 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 5.0);

        circle.displayDetails();
        rectangle.displayDetails();

        System.out.println("\nTotal shapes created: " + Shape.getTotalShapes());
    }
}
