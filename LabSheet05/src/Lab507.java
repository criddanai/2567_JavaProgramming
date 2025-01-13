import javax.swing.JOptionPane;

public class Lab507 {
    public static void main(String[] args) {

        int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " :"));
        }
        showEven(number);
        showOdd(number);
    }

    public static void showEven(int[] nums) {
        String text = "List of even number:\n";

        for (int num : nums) {
            if (num%2 == 0) {
                text += num + " ";
            }
        }
        JOptionPane.showMessageDialog(null, text);
    }

    public static void showOdd(int[] nums) {
        String text = "List of odd number:\n";

        for (int num : nums) {
            if (num%2 == 1) {
                text += num + " ";
            }
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
