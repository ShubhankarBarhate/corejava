package com.sunbeam;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice invoice = new Invoice("1234", "Hammer", 5, 9.99);

        
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());


        invoice.setQuantity(-3);
        invoice.setPricePerItem(-5.50);

        System.out.println("\nAfter setting negative values:");
        System.out.println("Quantity: " + invoice.getQuantity()); 
        System.out.println("Price per Item: " + invoice.getPricePerItem()); 
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount()); 
    }
}