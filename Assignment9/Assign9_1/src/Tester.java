import java.util.Locale.Category;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1));

            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.println("Category (1 - FICTION, 2 - NON_FICTION, 3 - SCIENCE, 4 - HISTORY, 5 - COMICS, 6 - ART): ");
            int categoryChoice = scanner.nextInt();
            Category category = Category.values()[categoryChoice - 1];
            scanner.nextLine(); 

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Publish Date (YYYY-MM-DD): ");
            String publishDate = scanner.nextLine();

            System.out.print("Author Name: ");
            String authorName = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); 

           
            Book book = new Book(isbn, category, price, publishDate, authorName, quantity);
            library.addBook(book);
        }

        
        library.displayBooks();
        scanner.close();
    }
}
