package com.sunbeam;

import java.util.Scanner;
public class Accept_Two_Double_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first double value: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second double value: ");
            double num2 = scanner.nextDouble();
            double average = (num1 + num2) / 2;
            System.out.println("The average is: " + average);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid double values.");
        } finally {
            scanner.close();
        }
    }
}
