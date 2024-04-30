/*
Task: Create a Library Management System

Description:
Design and implement a simple library management system that allows users
to borrow and return books. The system should support the following functionalities:

1)Add a book to the library.
2)Remove a book from the library.
3)Display all available books.
4)Borrow a book.
5)Return a book.
6)Display borrowed books by a specific user.
Requirements:

Each book should have attributes such as title, author and availability status.
Users should be able to borrow and return books.
The system should keep track of which books are borrowed by which users.
Implement appropriate error handling for cases such as attempting to borrow a book 
that is not available.
Use object-oriented principles such as encapsulation, inheritance, and polymorphism
to design the system.

*/

import java.util.*;

public class Library {

    ArrayList<Book> books;
    private HashMap<String, User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new HashMap<>();
    }

    public void addBooks(String TitleBook, String Author, String uni_id) {
        Book book = new Book(TitleBook, Author, uni_id);
        books.add(book);
    }

    public void removeBooks(String uni_id) {
        for (Book book : books) {
            if (book.getId().equals(uni_id)) {
                books.remove(book);
                return;
            }
        }
        System.out.println("Books is borrowed so not found " + uni_id);
    }

    public void displayBooks() {
        System.out.println("Available books");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void addUser(String username) {
        User user = new User(username);
        users.put(username, user);
    }
    
    public void removeUser(String username) {
        if (users.containsKey(username)) {
            users.remove(username);
            System.out.println("User " + username + " removed successfully.");
        } else {
            System.out.println("User " + username + " not found.");
        }
    }

    public void borrowBook(String username, String uni_id) {
        User user = users.get(username);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        for (Book book : books) {
            if (book.getId().equals(uni_id) && book.isAvailable()) {
                book.setAvailable(false);
                user.borrowBook(book);
                System.out.println(username + " borrowed " + book.getBooks());
                return;
            }
        }
        System.out.println("Book with ISBN " + uni_id + " not available.");
    }

    public void returnBook(String username, String uni_id) {
        User user = users.get(username);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        for (Book book : books) {
            if (book.getId().equals(uni_id)) {
                book.setAvailable(true);
                user.returnBook(book);
                System.out.println("The book was returned by " + username + ": " + book.getBooks());
                return;
            }
        }
        System.out.println("Book with ISBN " + uni_id + " not borrowed by " + username);
    }

    public void DisplayBorrowedBooksDetails(String username) {
        User user = users.get(username);
        if (user == null) {
            System.out.println("User not found");
            return;
        }
        System.out.println(username + "'s borrowed books:");
        for (Book book : user.getBorrowedBook()) {
            System.out.println(book);
        }
    }
}