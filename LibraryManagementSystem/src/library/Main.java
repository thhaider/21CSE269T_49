import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create a book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Create a member
        Member member1 = new Member("John Doe", "M001");

        // Create a transaction
        Transaction transaction = new Transaction();

        // Borrow a book
        transaction.borrowBook(book1, member1);
        System.out.println(member1);

        // Return the book
        transaction.returnBook(book1, member1);
        System.out.println(member1);
    }
}