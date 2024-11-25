import java.util.*; // Use class Scanner
import java.text.*; // Use Decimal Format


public class JavaExample1 {

	public static void main(String[] args) {
		
		// define object for scanner class(input data from keyboard)
		Scanner scan = new Scanner(System.in);
		// Define object for  manage format number by DecimalFormat
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		// สั่งแสดงข้อวความชื่อสินค้า
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		// สั่งแสดงและรับจำนวนสินค้า
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		// สั่งแสดงและรับราคาสินค้า
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("Product name is " + productName);
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPriceProduct) + " bath.");
		
		// คิด vat 7% 
		float totalVat = totalPriceProduct + (totalPriceProduct * 7 / 100);
		System.out.println("Add VAT 7% is " + frm.format(totalVat) + " bath.");
				
		// Output using String.format and printf
		System.out.println("*********** using printf and String.format ***********");
		System.out.printf("Product name is : %s", productName);
		System.out.printf("\nTotal price is %,.2f bath.", totalPriceProduct);
		// String formatted = String.format("%,.2f", totalVat);
		System.out.printf("\nAdd VAt 7%% is %s bath.", String.format("%,.2f", totalVat));
		
		
		
		
		scan.close();
		
	}

}
