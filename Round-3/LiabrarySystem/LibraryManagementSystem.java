import java.util.Scanner;

public class LibraryManagementSystem {

    private static Library library;
    private static Scanner scanner;

    public static void main(String[] args) {
        library = new Library();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show User Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    removeUser();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    showUserDetails();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        library.addUser(username);
        System.out.println("User " + username + " added successfully.");
    }

    private static void removeUser() {
        System.out.print("Enter username to remove: ");
        String username = scanner.nextLine();
        library.removeUser(username);
        System.out.println("User " + username + " removed successfully.");
    }

    private static void borrowBook() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter book unique id: ");
        String uni_id = scanner.nextLine();
        library.borrowBook(username, uni_id);
    }

    private static void returnBook() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter book unique id: ");
        String uni_id = scanner.nextLine();
        library.returnBook(username, uni_id);
    }

    private static void showUserDetails() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        library.DisplayBorrowedBooksDetails(username);
    }
}
