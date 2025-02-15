/*
Task 6: 
Create a class hierarchy to model different types of beverages.
• Start with a base class called "Beverage" with attributes "name" and "price",
along with a method to display beverage information.
• Add a method in the Beverage class to find the duplicate char in the name
attribute.
• Then, create two subclasses "Coffee" and "Soda" that inherit from the Beverage
class.
• Add specific attributes and methods for each subclass.
• Finally, create instances of both Coffee and Soda classes and demonstrate the
inheritance and method overriding.

Output:
Coffee Information:
Name: Espresso
Price: $3.5
Caffeine Level: 80 mg
Duplicate Character: [e, s]

Soda Information:
Name: Coca-Cola
Price: $1.99
Diet: No
Duplicate Character: [c, o, a]
*/

package com.mycompany.task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


class Beverage {
    String name;
    double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void displayBeverageInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
    public List<Character> findDuplicateChars() {
        List<Character> duplicates = new ArrayList<>();
        HashSet<Character> seen = new HashSet<>();
        
        for (char ch : name.toLowerCase().toCharArray()) {
            if (seen.contains(ch) && !duplicates.contains(ch)) {
                duplicates.add(ch);
            } else {
                seen.add(ch);
            }
        }
        return duplicates;
    }
}

class Coffee extends Beverage {
    int caffeineLevel; 

    public Coffee(String name, double price, int caffeineLevel) {
        super(name, price);
        this.caffeineLevel = caffeineLevel;
    }

    public void displayCoffeeInfo() {
        System.out.println("\nCoffee Information:");
        displayBeverageInfo();
        System.out.println("Caffeine Level: " + caffeineLevel + " mg");
        System.out.println("Duplicate Character: " + findDuplicateChars());
    }
}

class Soda extends Beverage {
    String diet; 
    public Soda(String name, double price, String diet) {
        super(name, price);
        this.diet = diet;
    }

    public void displaySodaInfo() {
        System.out.println("\nSoda Information:");
        displayBeverageInfo();
        System.out.println("Diet: " + diet);
        System.out.println("Duplicate Character: " + findDuplicateChars());
    }
}

public class Task6 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", 3.5, 80);
        Soda soda = new Soda("Coca-Cola", 1.99, "No");

        coffee.displayCoffeeInfo();
        soda.displaySodaInfo();
    }
}
