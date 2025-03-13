package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b) Accept number of points
        System.out.print("How many points to plot? ");
        int n = sc.nextInt();

        // c) Create Point2D array
        Point2D[] points = new Point2D[n];

        // d) Input points
        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;

        // e) Menu loop
        while (!exit) {
            System.out.println("\n********* MENU *********");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between 2 points");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index of point to display: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Point at index " + index + ": " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!!!!");
                    }
                    break;

                case 2:
                    System.out.println("All point coordinates:");
                    for (int i = 0; i < points.length; i++) {
                        System.out.println("Point[" + i + "] = " + points[i].getDetails());
                    }
                    break;

                case 3:
                    System.out.print("Enter index of start point: ");
                    int start = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int end = sc.nextInt();

                    if (start >= 0 && start < points.length && end >= 0 && end < points.length) {
                        if (!points[start].isEqual(points[end])) {
                            double dist = points[start].calculateDistance(points[end]);
                            System.out.printf("Distance between point %d and point %d is: %.2f\n", start, end, dist);
                        } else {
                            System.out.println("Both points are at the same location.");
                        }
                    } else {
                        System.out.println("Invalid indices, please retry!!!!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}

