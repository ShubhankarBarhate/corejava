package com.sunbeam;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Aakash", "Abhishek", 1000);
        Employee emp2 = new Employee("Gurumann", "Jeetselal", 2000);

        
        System.out.println("Employee 1 Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: " + emp2.getYearlySalary());

        
        emp1.giveRaise();
        emp2.giveRaise();

        
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1 Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: " + emp2.getYearlySalary());
    }
}