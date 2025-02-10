package Lab01;

public class Invoice {
	private int invid;
	private Customer customer; // Composition concept
	private double amount;

	Invoice (int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}

	public int getInvId() {
		return this.invid;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;  // call toString() method from Customer class
 	}
	
	public int getCustomerId() {
		return getCustomer().getCustId();
	}
	
	public String getCustomerName() {
		return getCustomer().getCustName();
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount() - (getAmount() * getCustomerDiscount() / 100);
	}
	
	public String toString() {
		return "Invoice[id=" + getInvId() + ",customer" + customer + ",amount=" + getAmountAfterDiscount() + ")"; // call object --> customer = customer.toString()
	}
}


