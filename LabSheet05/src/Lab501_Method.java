import javax.swing.*;

public class Lab501_Method {

	static int[] productId = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
	static double[] productPrice = {0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00};
	static double itemPrice = 0;
	static boolean validItem = false;
	
	public static void main(String[] args) {
		
		inputItem();
	} // end of main() method
	
	public static void inputItem() {
		
		int inputOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		if (checkItem(inputOrder)) {
			JOptionPane.showMessageDialog(null, "Item " + inputOrder + " is " + itemPrice);
		} else {
			JOptionPane.showMessageDialog(null, "Invalid item");
		}
	} // end of inputItem() method
	
	public static boolean checkItem(int item) {
		
		for (int i = 0; i < productId.length; i++) {
			if (item == productId[i]) {
				itemPrice = productPrice[i];
				validItem = true;
			}
		} // end of for
		return validItem;
	} // end of checkItem() method
}
