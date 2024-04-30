import java.util.*;

public class Book {

    String TitleBook;
    String Author;
    String uni_id;
    private boolean AvailStatus;

    public Book(String TitleBook, String Author, String uni_id) {
        this.TitleBook = TitleBook;
        this.Author = Author;
        this.uni_id = uni_id;
        this.AvailStatus = true;
    }

    public String getBooks() {
        return TitleBook;
    }

    public String getAuthor() {
        return Author;
    }

    public String getId() {
        return uni_id;
    }

    public boolean isAvailable() {
        return AvailStatus;
    }

    public void setAvailable(boolean AvailStatus) {
        this.AvailStatus = AvailStatus;
    }

    @Override
    public String toString() {
        return "Title: " + TitleBook + ", Author: " + Author + ", Unique id: " + uni_id + ", Availability: "
                + (isAvailable() ? "Available" : "Not Available");
    }
}