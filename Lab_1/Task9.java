
package ovi.task9;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println();
    }
}

public class Task9 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 799.99, "Electronics");
        Product product2 = new Product("Shampoo", 5.99, "Personal Care");
        Product product3 = new Product("Coffee Maker", 49.99, "Home Appliances");

        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
    }
}