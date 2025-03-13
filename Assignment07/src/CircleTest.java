import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter X coordinate of center: ");
            double x = sc.nextDouble();

            System.out.print("Enter Y coordinate of center: ");
            double y = sc.nextDouble();

            System.out.print("Enter diameter: ");
            double diameter = sc.nextDouble();

            Circle circle = new Circle(x, y, diameter);
            System.out.println("Circle created successfully!");
            System.out.println(circle);
        } catch (InvalidDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

