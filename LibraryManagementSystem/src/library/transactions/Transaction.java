package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void borrowBook(Book book, Member member) {
        member.borrowBook(book);
        System.out.println("Book borrowed: " + book.getTitle() + " by " + member.getName());
    }

    public void returnBook(Book book, Member member) {
        member.returnBook(book);
        System.out.println("Book returned: " + book.getTitle() + " by " + member.getName());
    }
}