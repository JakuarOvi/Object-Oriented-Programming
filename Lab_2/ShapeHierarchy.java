public class ShapeHierarchy {

    // Shape class (parent class)
    static class Shape {
        // Method to display the type of shape
        public void displayType() {
            // Default display for Shape (could be overridden in child classes)
        }
    }

    // Circle class (child class of Shape)
    static class Circle extends Shape {
        double radius;

        // Constructor to initialize the radius of the circle
        public Circle(double radius) {
            this.radius = radius;
        }

        // Overriding displayType() method to print Circle type
        @Override
        public void displayType() {
            System.out.println("Type of shape: Circle");
        }
    }

    // Rectangle class (child class of Shape)
    static class Rectangle extends Shape {
        double length;
        double width;

        // Constructor to initialize the dimensions of the rectangle
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Overriding displayType() method to print Rectangle type
        @Override
        public void displayType() {
            System.out.println("Type of shape: Rectangle");
        }
    }

    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Call the displayType() method for both shapes
        circle.displayType();
        rectangle.displayType();
    }
}
