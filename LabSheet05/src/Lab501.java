import javax.swing.*;

public class Lab501 {

	public static void main(String[] args) {
		
		// no method override
		int[] productId = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
		double[] productPrice = {0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00};
		
		double itemPrice = 0; // get price
		boolean validItem = false; // check compare (เปรียบเทียบ)
		
		
		int inputOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		for (int i = 0; i < productId.length; i++) {
			if (inputOrder == productId[i]) {
				itemPrice = productPrice[i];
				validItem = true;
			}
		}
		
		if (validItem) {
			System.out.print("Item " + inputOrder + " is " + itemPrice);
			JOptionPane.showMessageDialog(null, "Item " + inputOrder + " is " + itemPrice);
		} else {
			System.out.print("Invalid item");
			JOptionPane.showMessageDialog(null, "Invalid item");
		}
	}

}
