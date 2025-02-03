package Lab02;

public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setId(String pid) {
		productId = pid;
	}
	
	public String getId() {
		return this.productId;
	}
	
	public void setUnit(int proUnit) {
		if (proUnit > 0) {
		productUnit = proUnit;
		}
	}
	
	public int getUnit() {
		return this.productUnit;
	}
	
	public void setPrice(double proPrice) {
		if (proPrice > 0) {
		productPrice = proPrice;
	}
	}
	
	public double getPrice() {
		return this.productPrice;
	}
	
	public double calculate() {
		return getUnit() * getPrice();
	}

}
