/*

Task 6:

Create an abstract class called "Book" with final attributes "title"
and "author" that remain constant throughout the object's lifecycle, a static
attribute "totalBooks" that maintains a count of all book instances, a static
method "getTotalPages()" that calculates and returns the sum of pages
across all books, and abstract methods "calculateReadingTime()" and
"generateSummary()"; then create two subclasses, "FictionBook" and
"NonFictionBook," that inherit from the Book class, implementing the
abstract methods for each subclass, where FictionBook includes a final
attribute "genre" and a static method "getMostPopularGenre()", while
NonFictionBook includes a final attribute "subject" and a static collection of
"academicReferences", with the reading time calculation differing based on
the book type, with fiction generally requiring less time per page than non-
fiction.

Sample Output:
Fiction Book: "The Hobbit" by J.R.R. Tolkien.
Genre: Fantasy
Estimated reading time: 5 hours
Summary: A hobbit embarks on an unexpected journey.



Non-Fiction Book: "Sapiens" by Yuval Noah Harari.
Subject: Human History
Estimated reading time: 8 hours
Academic References: [Evolution, Anthropology, Sociology]
Summary: A deep dive into the history of humankind.



Total books: 2
Total pages across all books: 850
Most popular genre: Fantasy

*/
package task6;

import java.util.ArrayList;
import java.util.List;

abstract class Book {
    
    final String title;
    final String author;

    
    static int totalBooks = 0;

    
    static int totalPages = 0;

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    
    
    public static int getTotalPages() {
        return totalPages;
    }

    
    
    public abstract int calculateReadingTime();
    public abstract String generateSummary();
}

class FictionBook extends Book {
    final String genre;

    
    static String mostPopularGenre = "Fantasy";

    
    
    public FictionBook(String title, String author, String genre, int pages) {
        super(title, author);
        this.genre = genre;
        totalPages += pages; 
    }

    @Override
    public int calculateReadingTime() {
        return 5; 
    }

    @Override
    public String generateSummary() {
        return "A hobbit embarks on an unexpected journey.";
    }

    public static String getMostPopularGenre() {
        return mostPopularGenre;
    }
}

class NonFictionBook extends Book {
    final String subject;

    static List<String> academicReferences = new ArrayList<>();

    public NonFictionBook(String title, String author, String subject, int pages) {
        super(title, author);
        this.subject = subject;
        totalPages += pages; 
        academicReferences.add("Evolution");
        academicReferences.add("Anthropology");
        academicReferences.add("Sociology");
    }

    @Override
    public int calculateReadingTime() {
        return 8; 
    }

    @Override
    public String generateSummary() {
        return "A deep dive into the history of humankind.";
    }
}

public class Task6 {
    public static void main(String[] args) {
        
        
        
        FictionBook fictionBook = new FictionBook("The Hobbit", "J.R.R. Tolkien", "Fantasy", 310);
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "Human History", 540);

        
        
        
        System.out.println("Fiction Book: \"" + fictionBook.title + "\" by " + fictionBook.author + ".");
        System.out.println("Genre: " + fictionBook.genre);
        System.out.println("Estimated reading time: " + fictionBook.calculateReadingTime() + " hours");
        System.out.println("Summary: " + fictionBook.generateSummary());

        
        
        System.out.println("\nNon-Fiction Book: \"" + nonFictionBook.title + "\" by " + nonFictionBook.author + ".");
        System.out.println("Subject: " + nonFictionBook.subject);
        System.out.println("Estimated reading time: " + nonFictionBook.calculateReadingTime() + " hours");
        System.out.println("Academic References: " + NonFictionBook.academicReferences);
        System.out.println("Summary: " + nonFictionBook.generateSummary());

        
        
        
        
        System.out.println("\nTotal books: " + Book.totalBooks);
        System.out.println("Total pages across all books: " + Book.getTotalPages());

        
        
        
        System.out.println("Most popular genre: " + FictionBook.getMostPopularGenre());
    }
}
