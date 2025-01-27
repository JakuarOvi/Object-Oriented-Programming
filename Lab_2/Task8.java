/*
 Task 8: Complete the Shape, Circle, Rectangle classes. So that it
matches the output.

public class ShapeHierarchy {
public static void main(String[] args) {
Circle circle = new Circle(5.0);
Rectangle rectangle = new Rectangle(4.0, 6.0);

circle.displayType();
rectangle.displayType();
}
}

Output:
Type of shape: Circle
Type of shape: Rectangle
 */

package com.mycompany.task8;


class Shape{
    void displayType(){
        System.out.println("Type of shape: "+this.getClass().getSimpleName());
    }
}

class Circle extends Shape{
    
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
   
    void displayType(){
        System.out.println("Type of shape: Circle");
    }
}

class Ractangle extends Shape{
    double width;
    double hight;
    Ractangle(double width,double hight){
    this.width=width;
    this.hight=hight;
    }
     void displayType(){
        System.out.println("Type of shape:Ractangle");
    }
}


public class Task8{
    public static void main(String[] args) {
        Circle circle=new Circle(5.0);
        Ractangle ractangle= new Ractangle(4.0,6.0);
        circle.displayType();
        ractangle.displayType();
    }
}