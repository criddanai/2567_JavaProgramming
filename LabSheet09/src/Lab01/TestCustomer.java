package Lab01;

public class TestCustomer {

	public static void main(String[] args) {
		
		System.out.println("###Test Customer class###");      
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);       
		// Customer's toString()    
		System.out.println(c1);
		// set customer's discount is 5
		c1.setDiscount(5);
		// Customer's toString()
		System.out.println(c1);
		Line();
		
		// show customer's id
		System.out.println("\nid is: " + c1.getCustId());
		// show customer's name
		System.out.println("name is: " + c1.getCustName());
		// show customer's discount
		System.out.println("discount is: " + c1.getDiscount());
		Line();
		
		System.out.println("\n###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		// Invoice's toString()
		System.out.println(inv1);
		// set invoice's amount is 10000
		inv1.setAmount(10000);
		// Invoice's toString()
		System.out.println(inv1);
		Line();
		
		// show invoice's id
		System.out.println("\nInvoice id is: " + inv1.getInvId());
		// Customer's toString() by instance inv1
		System.out.println("customer is: " + inv1.getCustomer());
		// show invoice's amount
		System.out.println("Amount is: " + inv1.getAmount());
		
		Line();
		// show customer's id by instance inv1
		System.out.println("\ncustomer's id is: " + inv1.getCustomerId());
		// show customer's name by instance inv1
		System.out.println("customer's name is: " + inv1.getCustomerName());
		// show customer's discount by instance inv1
		System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
		// show invoice's amount after discount(format as output)
		System.out.printf("amount after discount is: %.2f", inv1.getAmountAfterDiscount());

		
	}
	
	public static void Line() {
		for (int i = 1; i < 40; i++) {
			System.out.print("=");
		}
	}
	
}
