
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces (optional)
        String str = input.toLowerCase().replaceAll("\\s+", "");

        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if original equals reversed
        if (str.equals(reversed)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is not a palindrome.");
        }

        sc.close();
    }
}

