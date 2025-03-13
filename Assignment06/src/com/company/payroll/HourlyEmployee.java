package com.company.payroll;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double overtime = hoursWorked - 40;
            return (40 * hourlyRate) + (overtime * hourlyRate * 1.5);
        }
    }
}

