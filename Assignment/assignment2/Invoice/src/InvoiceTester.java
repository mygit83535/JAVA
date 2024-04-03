
public class InvoiceTester {
	
	public static void main(String[]args) {}
	
			
	 Invoice invoice = new Invoice("001", "Hammer", 5, 10.99); 
	 System.out.println("Part Number: " + invoice.getPartNumber());
     System.out.println("Part Description: " + invoice.getPartDescription());
     System.out.println("Quantity: " + invoice.getQuantity());
     System.out.println("Price Per Item: " + invoice.getPricePerItem());
     System.out.printf("Invoice Amount: "+ invoice.getInvoiceAmount());
     
     
     

}
