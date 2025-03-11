package com.sunbeam;

import java.util.Scanner;

public class Food_Menu{
    public static void displayMenu() {
        System.out.println("\nFood Menu");
        System.out.println("1. Dosa : 5 Rupees");
        System.out.println("2. Samosa : 2 Rupees");
        System.out.println("3. Idli : 3 Rupees");
        System.out.println("4. Vada : 4 Rupees");
        System.out.println("5. Poha : 3 Rupees");
        System.out.println("6. Uttapam : 6 Rupees");
        System.out.println("7. Pav Bhaji : 7 Rupees");
        System.out.println("8. Pani Puri : 2 Rupees");
        System.out.println("9. Biryani : 8 Rupees");
        System.out.println("10. Generate Bill");
    }
    public static int calculateTotal(int[] items, int[] quantities) {
        int total = 0;
        int[] prices = {0, 5, 2, 3, 4, 3, 6, 7, 2, 8};
        for (int i = 0; i < items.length; i++) {
            total += prices[items[i]] * quantities[i];
        }
        return total;
    }

    public static void generateBill(int[] items, int[] quantities) {
        int[] prices = {0, 5, 2, 3, 4, 3, 6, 7, 2, 8};
        System.out.println("\n--- Bill ---");
        int total = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + items[i] + ": " + quantities[i] + " x Rupees" + prices[items[i]] + " = Rupees" + (prices[items[i]] * quantities[i]));
            total += prices[items[i]] * quantities[i];
        }
        System.out.println("\nTotal Bill: Rupees" + total);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] items = new int[10]; 
        int[] quantities = new int[10]; 
        int index = 0;

        while (true) {
            displayMenu();

            System.out.print("\nEnter the food item number (or 10 to generate bill): ");
            int item = scanner.nextInt();

            if (item == 10) { 
                if (index > 0) {
                    generateBill(items, quantities);
                } else {
                    System.out.println("No items selected.");
                }
                break;
            }

            if (item < 1 || item > 9) {
                System.out.println("Invalid choice, please select a valid item.");
                continue;
            }

            System.out.print("Enter quantity for item " + item + ": ");
            int quantity = scanner.nextInt();

            items[index] = item;
            quantities[index] = quantity;
            index++;
        }

        scanner.close(); 
    }
}

