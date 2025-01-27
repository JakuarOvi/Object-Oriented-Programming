/*
Task 7: Complete the Animal, Dog, Cat classes. So that it matches the

output.

public class AnimalInheritance {
public static void main(String[] args) {
Animal animal = new Animal("Generic Animal");
Dog dog = new Dog("Buddy");
Cat cat = new Cat("Whiskers");

animal.speak();
dog.speak();
cat.speak();
}
}

Output:
An animal makes a sound.
Buddy barks.
Whiskers meows.
*/

package com.mycompany.task7;

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
  void speak() {
        System.out.println("An animal makes a sound.");
    }
}

class Dog extends Animal {


     Dog(String name) {
        super(name); 
    }
    public void speak() {
        System.out.println(this.name + " barks.");
    }
}

class Cat extends Animal {


    public Cat(String name) {
        super(name);  
    }

    
    public void speak() {
        System.out.println(this.name + " meows.");
    }
}


public class Task7 {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        animal.speak();
        dog.speak();
        cat.speak();
    }
}

