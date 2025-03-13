package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nOptions:\n1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Display Fruit Names\n5. Display Fresh Fruits\n6. Display Stale Fruits\n7. Mark Fruit Stale\n8. Mark All Sour Fruits Stale\n9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
                        System.out.println("Mango added.");
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;
                case 2:
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
                        System.out.println("Orange added.");
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;
                case 3:
                    if (counter < basket.length) {
                        System.out.print("Enter name, weight, color: ");
                        basket[counter++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
                        System.out.println("Apple added.");
                    } else {
                        System.out.println("Basket full!");
                    }
                    break;
                case 4:
                    System.out.println("Fruit Names:");
                    for (Fruit f : basket) {
                        if (f != null) System.out.println(f.getName());
                    }
                    break;
                case 5:
                    System.out.println("Fresh Fruits Info:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Tastes of Stale Fruits:");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " - Taste: " + f.taste());
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter index to mark fruit as stale: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < basket.length && basket[idx] != null) {
                        basket[idx].setFresh(false);
                        System.out.println("Marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 8:
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equals("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked as stale.");
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}

