import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // You can use a loop for multiple customers if needed
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Balance at the beginning of the month: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Enter Total Charges this month: ");
        int charges = sc.nextInt();

        System.out.print("Enter Total Credits this month: ");
        int credits = sc.nextInt();

        System.out.print("Enter Allowed Credit Limit: ");
        int creditLimit = sc.nextInt();

        // Calculate new balance
        int newBalance = beginningBalance + charges - credits;

        // Display result
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        // Check if credit limit is exceeded
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Credit limit not exceeded.");
        }

        sc.close();
    }
}
