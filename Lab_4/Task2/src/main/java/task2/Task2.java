
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
