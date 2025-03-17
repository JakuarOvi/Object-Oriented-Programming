/*
Task 5 - Library Catalog:
Create a library catalog system with different types of materials like books
and DVDs that inherit from a common catalog Item class.
Encapsulate attributes in the base class: title, author and year.
Implement polymorphism with the following methods:
displayDetails(): Display the title, author, and year of publication.
*/

package ovi.task5;
import java.util.*;

// Base class
abstract class CatalogItem {
    protected String title;
    protected String author;
    protected int year;
    
    public CatalogItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    public abstract void displayDetails();
}

// Derived class - Book
class Book extends CatalogItem {
    private int pages;
    
    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Book - Title: " + title + ", Author: " + author + ", Year: " + year + ", Pages: " + pages);
    }
}

// Derived class - DVD
class DVD extends CatalogItem {
    private int duration;
    
    public DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("DVD - Title: " + title + ", Author: " + author + ", Year: " + year + ", Duration: " + duration + " mins");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Book book = new Book("The Great Wall", "china", 1925, 180);
        DVD dvd = new DVD("Inception", "Nolan", 2010, 148);
        
        book.displayDetails();
        dvd.displayDetails();
    }
}
