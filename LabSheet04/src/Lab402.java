import javax.swing.*;

public class Lab402 {

    static int year;

    public static void main(String[] args) {

        year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
        while (!(checkYear(year))) {
            year = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000" + "\nInput year, again:"));
        }
        JOptionPane.showMessageDialog(null, isLeapYear(year)? year + " is Leap year." : year + " is NOT Leap year.");
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1000 && year <= 3000) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
