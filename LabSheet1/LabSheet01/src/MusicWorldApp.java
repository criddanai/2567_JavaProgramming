import javax.swing.*;

public class MusicWorldApp {
    public static void main(String[] args) {

        final double TAX_RATE = 6.25;
        String cdId, cdTitle;
        int cdQuantity;
        double cdPrice, cdSubtotal, cdTotal;

        cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order\n"
                                    + "Please enter the ID of the CD");
        cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
        cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));

        cdSubtotal = cdPrice * cdQuantity;
        cdTotal = cdSubtotal + ((cdSubtotal * TAX_RATE) / 100);

        JOptionPane.showMessageDialog(null, "Summary of the transaction:\n\n" + "CD ID: " + cdId
                    + "\nCD Title: " + cdTitle + "\nCD Unit Price: $" + cdPrice + "\nCD Quantity: " + cdQuantity
                    + "\n\nSubtotal: $" + cdSubtotal + "\nTax rate: " + TAX_RATE + "%" + "\nTotal: $" + cdTotal
                    + "\n\nEnd of Program");
    }
}