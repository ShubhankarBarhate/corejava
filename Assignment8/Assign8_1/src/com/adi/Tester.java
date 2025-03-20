package com.adi;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack selectedStack = null; // To store the selected stack (Fixed or Growable)
        boolean isStackChosen = false;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Choose Fixed Stack");
            System.out.println("2 - Choose Growable Stack");
            System.out.println("3 - Push Data (Emp Details)");
            System.out.println("4 - Pop Data (Emp Details)");
            System.out.println("5 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    if (isStackChosen) {
                        System.out.println("You have already chosen a stack!");
                    } else {
                        selectedStack = new FixedStack();
                        isStackChosen = true;
                        System.out.println("Fixed Stack selected.");
                    }
                    break;

                case 2:
                    if (isStackChosen) {
                        System.out.println("You have already chosen a stack!");
                    } else {
                        selectedStack = new GrowableStack();
                        isStackChosen = true;
                        System.out.println("Growable Stack selected.");
                    }
                    break;

                case 3:
                    if (selectedStack == null) {
                        System.out.println("NO stack chosen!!!");
                    } else {
                        System.out.println("Enter Employee Details:");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Salary: ");
                        double salary = scanner.nextDouble();

                        Employee emp = new Employee(id, name, salary);
                        selectedStack.push(emp);
                    }
                    break;

                case 4:
                    if (selectedStack == null) {
                        System.out.println("NO stack chosen!!!");
                    } else {
                        Employee emp = selectedStack.pop();
                        if (emp != null) {
                            System.out.println("Popped Employee: " + emp);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}