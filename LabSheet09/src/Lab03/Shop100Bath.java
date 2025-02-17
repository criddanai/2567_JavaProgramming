package Lab03;
import javax.swing.JOptionPane;

public class Shop100Bath {
    public static void main(String[] args) {

        Product sold = new Product();

        int button = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?", "Run Program", JOptionPane.YES_NO_OPTION);

        if (button == 0) {
            sold = new PattanakarnBranch();
        }

        // receive the value
        sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: ")));
        JOptionPane.showMessageDialog(null, sold);

    }
}
