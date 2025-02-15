package com.mycompany.task3;
abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }

    public void isSquare() {
        if (length == width) {
            System.out.println("This Rectangle is a Square.");
        } else {
            System.out.println("This Rectangle is not a Square.");
        }
    }
}

class Triangle extends Shape {
    double base;
    double height;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void isRightAngled() {
        double hypotenuse = Math.max(sideA, Math.max(sideB, sideC));
        double otherSide1 = sideA + sideB + sideC - hypotenuse - Math.max(sideA, sideB + sideC - hypotenuse);
        double otherSide2 = sideA + sideB + sideC - hypotenuse - otherSide1;
        
        if (Math.pow(hypotenuse, 2) == Math.pow(otherSide1, 2) + Math.pow(otherSide2, 2)) {
            System.out.println("This Triangle is a right-angled Triangle.");
        } else {
            System.out.println("This Triangle is not a right-angled Triangle.");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.isSquare();

        Triangle triangle = new Triangle(10, 9.1, 6, 8, 10);
        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        triangle.isRightAngled();
    }
}
