package com.company.payroll;

public class PayrollTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("Alice", 1000),
            new HourlyEmployee("Bob", 45, 20),
            new CommissionEmployee("Charlie", 5000, 0.10),
            new BasePlusCommissionEmployee("Diana", 6000, 0.08, 500)
        };

        System.out.println("Employee Payroll Details:");
        for (Employee emp : employees) {
            System.out.printf("%s is paid: ₹%.2f%n", emp.getName(), emp.calculatePay());
        }
    }
}
