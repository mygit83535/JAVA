package com.sunbeam.tester;
import com.sunbeam.invoice.Invoice;
public class invoiceTester {

	
	public static void main(String[]args) {
	Invoice invoice = new Invoice("01", "tester", 2, 20.99); 
	 System.out.println("Part Number: " + invoice.getPartNumber());
    System.out.println("Part Description: " + invoice.getPartDescription());
    System.out.println("Quantity: " + invoice.getQuantity());
    System.out.println("Price Per Item: " + invoice.getPricePerItem());
    System.out.printf("Invoice Amount: %.2f%n",+ invoice.calculateInvoice());
    
	}

}
