package com.company.payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, double sales, double commissionRate, double baseSalary) {
        super(name, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePay() {
        // Reward by adding 10% to base salary
        double updatedBase = baseSalary + (baseSalary * 0.10);
        return updatedBase + super.calculatePay();
    }
}

