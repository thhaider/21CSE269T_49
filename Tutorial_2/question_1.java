class Book {
    // Attributes charcateristics of the class
    private int bookID;
    private String title;
    private String author;
    private boolean availabilityStatus;

    // Constructor (defined for rest of the books )
    public Book(int bookID, String title, String author, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    // Method (to display book details)
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availabilityStatus ? "Available" : "Not Available"));
    }

    // Method to check availability
    public boolean isAvailable() {
        return availabilityStatus;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", true);
        Book book2 = new Book(102, "1984", "George Orwell", false);

        book1.displayBookDetails();
        System.out.println("Is available? " + book1.isAvailable());

        System.out.println(); // Just for spacing

        book2.displayBookDetails();
        System.out.println("Is available? " + book2.isAvailable());
    }
}
