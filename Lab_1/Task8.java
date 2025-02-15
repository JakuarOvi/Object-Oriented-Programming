
package ovi.task8;

class Book {
    String title;
    int year;
    String author;

    // Parameterized constructor to initialize the properties
    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

public class Task8 {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald");
        Book book2 = new Book("1984", 1949, "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", 1960, "Harper Lee");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
