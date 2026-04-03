import java.util.Scanner;
class Book {
    int bookId;
    String title;
    boolean isIssued;
    static int totalBooks = 0;

    Book(int id, String name) {
        bookId = id;
        title = name;
        isIssued = false;
        totalBooks++;
    }
    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Issued: " + isIssued);
        System.out.println();
    }
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book is already issued.");
        }  }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book was not issued");
        } }

    static void showTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    } }

public class Library {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book title: ");
        String title = sc.nextLine();

        Book b1 = new Book(id, title);

        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display Book Details");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Total Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b1.displayBook();
                    break;

                case 2:
                    b1.issueBook();
                    break;

                case 3:
                    b1.returnBook();
                    break;

                case 4:
                    Book.showTotalBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }  }
 while (choice != 5)    
    sc.close();    }}
