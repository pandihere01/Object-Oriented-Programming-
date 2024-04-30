
import java.util.*;

public class User {

    private String username;
    private ArrayList<Book> borrowedBooks;

    public User(String username) {
        this.username = username;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return username;
    }

    public ArrayList<Book> getBorrowedBook() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
