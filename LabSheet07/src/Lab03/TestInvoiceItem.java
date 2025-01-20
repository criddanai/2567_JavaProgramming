package Lab03;

public class TestInvoiceItem {

	public static void main(String[] args) {
		
		// Test constructor and toString()
		InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
		System.out.println(inv1); // toString() method
		
		// Test Setters and Getters
		inv1.setQty(999);
		inv1.setUnitPrice(0.99);
		System.out.println(inv1); // toString(); 
		System.out.println();
		
		System.out.println("Id is: " + inv1.getId());
		System.out.println("Description is: " + inv1.getDesc());
		System.out.println("Quantity is: " + inv1.getQty());
		System.out.println("Price of product is: " + inv1.getUnitPrice());
		System.out.println("The total is: " + inv1.getTotal());

	}
}
