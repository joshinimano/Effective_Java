package Book;


import java.util.ArrayList;
import java.util.List;

public class bookstore {

    private List<Book> book;

    bookstore() {
        book = new ArrayList<>();
    }

    public void add(Book book) {
        book.addBook(book);
    }
    public void displayBooks () {
        System.out.println("Available Books:");
        for (Book book : book) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrices());
        }
    }

    public void viewBookPrices () {
        System.out.println("Book Prices:");
        for (Book book : book) {
            System.out.println("Title: " + book.getTitle() + ", Price: $" + book.getPrices());
        }
    }

    public boolean purchaseBook (String title){
        for (Book book : book) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("You purchased: " + book.getTitle());
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }
}