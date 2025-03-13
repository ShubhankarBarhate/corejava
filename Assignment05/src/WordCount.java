
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = input.trim().split("\\s+");

        // Check if input is not just spaces
        if (input.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            System.out.println("Number of words: " + words.length);
        }

        sc.close();
    }
}

