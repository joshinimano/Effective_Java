package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    // Client class
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList bookStore = new ArrayList();
            bookStore.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
            bookStore.add(new Book("To Kill a Mockingbird", "Harper Lee", 12.50));
            bookStore.add(new Book("1984", "George Orwell", 8.99));

            while (true) {
                System.out.println("\nWelcome to the Book Store!");
                System.out.println("1. View Books");
                System.out.println("2. View Book Prices");
                System.out.println("3. Purchase Book");
                System.out.println("4. Add a Book");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        bookStore.displayBooks();
                        break;
                    case 2:
                        bookStore.viewBookPrices();
                        break;
                    case 3:
                        System.out.print("Enter the title of the book you want to purchase: ");
                        String title = scanner.nextLine();
                        bookStore.purchaseBook(title);
                        break;
                    case 4:
                        System.out.print("Enter the title of the book: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter the author of the book: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter the price of the book: ");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        bookStore.add(new Book(newTitle, newAuthor, newPrice));
                        System.out.println("Book added successfully!");
                        break;
                    case 5:
                        System.out.println("Thank you for visiting!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }}}
