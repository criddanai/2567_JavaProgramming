package Lab02;

import java.util.Scanner;

public class StockProduct {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

//		for (int i = 0; i <= 4; i++) {
//			System.out.print("Input product Id    : ");
//			String productId = input.nextLine();
//			System.out.print("Input product Unit  : ");
//			int productUnit = input.nextInt();
//			System.out.print("Input product Price : ");
//			double productPrice = input.nextDouble();
//			
//			Product[] productList = new Product[4];
//			System.out.println();
//			input.nextLine();
//		}
		
		Product[] productList = new Product[4];

        // Initializing product objects and setting their attributes
        productList[0] = new Product();
        productList[0].setId("P-001");
        productList[0].setUnit(10);
        productList[0].setPrice(100.5);

        productList[1] = new Product();
        productList[1].setId("P-002");
        productList[1].setUnit(20);
        productList[1].setPrice(50.75);

        productList[2] = new Product();
        productList[2].setId("P-003");
        productList[2].setUnit(15);
        productList[2].setPrice(200.0);

        productList[3] = new Product();
        productList[3].setId("P-004");
        productList[3].setUnit(30);
        productList[3].setPrice(75.25);

        double totalStockValue = 0;
        for (int i = 0; i < productList.length; i++) {
            double productValue = productList[i].calculate();
            System.out.println("Product ID : " + productList[i].getId() +
                                productList[i].getUnit() +
                               ", Total Price: " + productList[i].getPrice() + "bath.");
            totalStockValue += productValue;
        }

        System.out.println("\nTotal price of all products is " + totalStockValue + "bath.");
    }
}
