package com.sunbeam;

public class DateTest {
    public static void main(String[] args) {
        
        Date date = new Date(3, 2, 2025);
        System.out.print("Initial Date: ");
        date.displayDate();
        date.setMonth(1);
        date.setDay(22);
        date.setYear(2026);

        System.out.print("Updated Date: ");
        date.displayDate();
    }
}

