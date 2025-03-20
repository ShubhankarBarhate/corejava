

import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public void addBook(Book book) {
        if (books.add(book)) {
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Book with ISBN " + book.getIsbn() + " already exists in the library.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
