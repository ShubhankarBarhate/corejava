package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates of first point
        System.out.print("Enter x and y coordinates for point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Accept coordinates of second point
        System.out.print("Enter x and y coordinates for point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Create Point2D objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are different.");
            double distance = p1.calculateDistance(p2);
            System.out.printf("Distance between the two points: %.2f\n", distance);
        }

        sc.close();
    }
}
