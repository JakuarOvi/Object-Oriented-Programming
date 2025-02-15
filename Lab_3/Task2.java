package com.mycompany.task2;
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public int factorial() {
        int result = 1;
        for (int i = 1; i <= age; i++) {
            result *= i;
        }
        return result;
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Iron", 7);
        Cat cat = new Cat("Tusk", 5);

        System.out.println("Dog Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        dog.makeSound();
        System.out.println("The factorial of " + dog.age + " is " + dog.factorial());

        System.out.println("\nCat Name: " + cat.name);
        System.out.println("Age: " + cat.age);
        cat.makeSound();
        System.out.println("The factorial of " + cat.age + " is " + cat.factorial());
    }
}
