package com.company.payroll;

public class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public CommissionEmployee(String name, double sales, double commissionRate) {
        super(name);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return sales * commissionRate;
    }
}

