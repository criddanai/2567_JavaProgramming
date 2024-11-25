import javax.swing.*;


public class JavaExample2 {

	public static void main(String[] args) {
		
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		
		String productUnitStr = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(productUnitStr);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit: "));
		
		double totalPrice = productPrice * productUnit;
		double totalVat = totalPrice + (totalPrice * 7 / 100);
		
		// Format output
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		String frmTotalVat = String.format("%,.2f", totalVat);
		
		// Display result by dialog box
		JOptionPane.showMessageDialog(null, "Total Price is " + frmTotalPrice + " bath.\n"
										+ "Add VAT 7% is " + frmTotalVat + " bath.");

	}

}
