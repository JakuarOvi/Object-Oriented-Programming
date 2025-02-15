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
