/*
Task 2:
Create a class hierarchy for a library system. Start with a parent
class "LibraryItem" containing a final attribute "itemId" and static attribute
"totalItems" that keeps track of all items in the library. Create a child class
"Book" that inherits from LibraryItem and adds attributes for "title" and
"author". Implement a static method "getTotalItemCount()" in the
LibraryItem class that returns the current count. Create a program that
creates several books and displays the total item count.

Sample Output:
Added book: "1984" by George Orwell.
Added book: "The Catcher in the Rye" by J.D. Salinger.

Course Code: CSE222 Credits: 1.5
Course Name: Object Oriented Programming Lab Faculty: FRS

Added book: "To Kill a Mockingbird" by Harper Lee.
Total library items: 3
*/
package task2;
class LibraryItem {
    final String itemId;  
     static int totalItems = 0;  
    public LibraryItem(String itemId) {
        this.itemId = itemId;
        totalItems++; 
    }

    public String getItemId() {
        return itemId;
    }

    public static int getTotalItemCount() {
        return totalItems;
    }
}
class Book extends LibraryItem {
     String title;
     String author;
    public Book(String itemId, String title, String author) {
        super(itemId);  
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void Bookdetails() {
        System.out.println("Added book: \"" + getTitle() + "\" by " + getAuthor() + ".");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "1984", "George Orwell");
        Book book2 = new Book("B002", "The Catcher in the Rye", "J.D. Salinger");
        Book book3 = new Book("B003", "To Kill a Mockingbird", "Harper Lee");

        book1.Bookdetails();
        book2.Bookdetails();
        book3.Bookdetails();

        System.out.println("\nTotal library items: " + LibraryItem.getTotalItemCount());
    }
}
