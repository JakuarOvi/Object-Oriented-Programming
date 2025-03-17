/*
 Task 7 - Animal Kingdom:
Implement an animal classification system with different types of animals
like Mammals and Birds that inherit from a common Animal class.
Encapsulate attributes in the base class: habitat and diet.
Implement polymorphism with the following methods:
displayCharacteristics(): Display the habitat and diet of the animal.
*/

package ovi.task7;
import java.util.*;

// Base class
abstract class Animal {
    protected String habitat;
    protected String diet;
    
    public Animal(String habitat, String diet) {
        this.habitat = habitat;
        this.diet = diet;
    }
    
    public abstract void displayCharacteristics();
}

// Derived class - Mammal
class Mammal extends Animal {
    private boolean hasFur;
    
    public Mammal(String habitat, String diet, boolean hasFur) {
        super(habitat, diet);
        this.hasFur = hasFur;
    }
    
    @Override
    public void displayCharacteristics() {
        System.out.println("Mammal - Habitat: " + habitat + ", Diet: " + diet + ", Has Fur: " + hasFur);
    }
}

// Derived class - Bird
class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String habitat, String diet, boolean canFly) {
        super(habitat, diet);
        this.canFly = canFly;
    }
    
    @Override
    public void displayCharacteristics() {
        System.out.println("Bird - Habitat: " + habitat + ", Diet: " + diet + ", Can Fly: " + canFly);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Savannah", "Carnivore", true);
        Bird eagle = new Bird("Mountains", "Carnivore", true);
        
        lion.displayCharacteristics();
        eagle.displayCharacteristics();
    }
}