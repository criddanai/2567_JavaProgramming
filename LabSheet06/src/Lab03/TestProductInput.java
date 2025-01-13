package Lab03;
import java.util.Scanner;

public class TestProductInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Product product = new Product();
		
		// Input
		System.out.print("Enter product name: ");
		String productName = input.nextLine();
		System.out.print("Enter product price: ");
		double productPrice = input.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double vatRate = input.nextDouble();
		
		product.setProductDetails(productName, productPrice, vatRate);
		
		// Output
		System.out.println("Product Details: ");
		product.displayProductDetails();
		
		
		input.close();
	}

}
