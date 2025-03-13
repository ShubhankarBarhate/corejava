
import java.util.Scanner;

public class CheckStringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            checkLength(input);
            System.out.println("String length is valid. Length = " + input.length());
        } catch (ExceptionLineTooLong e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    public static void checkLength(String str) throws ExceptionLineTooLong {
        if (str.length() > 80) {
            throw new ExceptionLineTooLong();
        }
    }
}

