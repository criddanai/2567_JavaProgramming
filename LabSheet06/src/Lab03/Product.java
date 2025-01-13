package Lab03;

public class Product {

	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String productName, double productPrice, double vatRateProduct) {
		name = productName;
		price = productPrice;
		vatRate = vatRateProduct;
	}
	
	public double calculateTotalPrice() {
		double total = 0;
		total = price + (price * vatRate/100);
		return total;
		// price  + (price * vatRate/100)
	}
	
	public void displayProductDetails() {
		
		System.out.println("Product Name: " + name);
		System.out.println("Price (before VAT): " + price);
		System.out.println("Price (after VAT): " + calculateTotalPrice());
		
	}
	
}
