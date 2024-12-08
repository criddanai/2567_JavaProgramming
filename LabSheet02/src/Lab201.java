import javax.swing.*;
import java.text.DecimalFormat;

public class Lab201 {

	public static void main(String[] args) {
		
		final int BUFFET = 299;
		double discount;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberOfCustomer = Integer.parseInt(
						JOptionPane.showInputDialog("How many customer per bill?"));
		
		double totalPrice = numberOfCustomer * BUFFET;
		
		do {
		isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(totalPrice) + " Baht."
						+ "\nDo you have a member card?");
		}while(isMember == 2);
		
			if(isMember == 0) {  // or isMember == JOptionPane.YES_OPTION
				discount = totalPrice * 0.90; // discount = totalPrice - (totalPrice * 10 / 100);
				JOptionPane.showMessageDialog(null, "Amount to be paid " + frm.format(discount) + " baht.");
			}
			else if(isMember == 1) {
				JOptionPane.showMessageDialog(null, "Amount to be paid " + frm.format(totalPrice) + " baht.");
			}	
	}

}
