
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
