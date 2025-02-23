package Lab03;

import javax.swing.*;

public class CoffeeShopDemo {
    public static void main(String[] args) {

        Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog(("Drink type:")));
        int typeCoffee = Integer.parseInt(JOptionPane.showInputDialog("Coffee type:"));
        String sizeCoffeeS = JOptionPane.showInputDialog("Coffee size:");
        char sizeCoffee = sizeCoffeeS.charAt(0);
        int barista = Integer.parseInt(JOptionPane.showInputDialog("Barista number:"));

        Barista selectedBarista = (barista == 2) ? staff2 : staff1;

        if (selectedBarista != staff1 || selectedBarista != staff2) {
            Coffee order = new Coffee(drinkType, typeCoffee, sizeCoffee, selectedBarista);
            selectedBarista = staff1;
            JOptionPane.showMessageDialog(null, order.toString());
        }
    }
}
