import javax.swing.*;

public class Icecream {
    public static void main(String[] args) {

        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        int icecreamFlavor = Integer.parseInt(JOptionPane.showInputDialog(null
                        , "[1] Vanilla Flavor 10 B."
                        + "\n[2] Chocolate Flavor 15 B."
                        + "\nPress number to choose flavor:", "Input", JOptionPane.QUESTION_MESSAGE));

        while(icecreamFlavor != 1 && icecreamFlavor != 2) {
            JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! \nTry again..."
                                            , "ERROR", JOptionPane.ERROR_MESSAGE);
            icecreamFlavor = Integer.parseInt(JOptionPane.showInputDialog(null
                    , "[1] Vanilla Flavor 10 B."
                            + "\n[2] Chocolate Flavor 15 B."
                            + "\nPress number to choose flavor:", "Input", JOptionPane.QUESTION_MESSAGE));
        }

        int price = (icecreamFlavor == 1) ? VANILLA : CHOCOLATE;
        String flavor = (icecreamFlavor == 1) ? "Vanilla" : "Chocolate";
        int addTopping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?"
                            , "Topping", JOptionPane.YES_NO_OPTION);

        if(addTopping == JOptionPane.YES_OPTION) {
            price += TOPPING;
            JOptionPane.showMessageDialog(null, "You choose " + flavor + " Flavor"
                        + "\nAnd with topping" + "\nTotal price = " + price + " bath.");
        }
        else {
            JOptionPane.showMessageDialog(null, "You choose " + flavor + " Flavor"
                    + "\nAnd no topping" + "\nTotal price = " + price + " bath.");
        }
    }
}
