package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates of 1st point
        System.out.print("Enter x and y for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Accept coordinates of 2nd point
        System.out.print("Enter x and y for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create points
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // e) Display details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // f) Check if they are equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are different.");
            System.out.printf("Distance between the points: %.2f\n", p1.calculateDistance(p2));
        }

        sc.close();
    }
}

