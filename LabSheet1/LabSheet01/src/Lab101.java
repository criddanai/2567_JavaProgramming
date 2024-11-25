import java.util.*;


public class Lab101 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name    : ");
		String productName = scan.nextLine();
		
		System.out.print("Input Product Unit    : ");
		int productUnit = scan.nextInt();
		
		System.out.print("Input Price per unit  : ");
		double pricePerUnit = scan.nextDouble();
		System.out.println("---------------------------------------------");
		
		double totalPrice = productUnit * pricePerUnit;
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		
		System.out.println("Total Price is " + frmTotalPrice + " bath.");
		System.out.println("---------------------------------------------");
		System.out.print("How many discount (%) : ");
		double discount = scan.nextDouble();
		System.out.println("---------------------------------------------");
		
		double totalDiscount = totalPrice * (discount / 100);
		String frmTotalDiscount = String.format("%,.2f", totalDiscount);
		double totalAmount = totalPrice - totalDiscount;
		String frmTotalAmount = String.format("%,.2f", totalAmount);
		
		System.out.println("Discount from 15%\t" + frmTotalDiscount + " bath.");
		System.out.println("Amount to be paid\t" + frmTotalAmount + " bath.");
		
		
		scan.close();

	}

}
