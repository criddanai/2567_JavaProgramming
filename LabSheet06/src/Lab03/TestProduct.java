package Lab03;

public class TestProduct {

	public static void main(String[] args) {
		
		Product productTest = new Product();
		
		productTest.setProductDetails("Smart Phone", 30000.0, 7.0);
		
		System.out.println("Product Details: ");
		productTest.displayProductDetails();

	}

}
