import javax.swing.*;

public class Lab104 {
    public static void main(String[] args) {

        final double HOURLY_WAGE = 7.5;
        final double TAX_RATE = 0.15;

        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
        String employeeName = JOptionPane.showInputDialog("Enter employee name");
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter total hours for this employee."));

        double grossEarning = hoursWorked * HOURLY_WAGE;
        double effectiveTax = TAX_RATE * HOURLY_WAGE * hoursWorked;
        double netEarning = grossEarning - effectiveTax;

        JOptionPane.showMessageDialog(null, "Employee name: " + employeeName + "\nHours worked: " + hoursWorked
                    + "\nHourly wage: $ " + HOURLY_WAGE + "\nGross earnings: $ " + grossEarning + "\nTax rate: " + TAX_RATE
                    + "\nTax: $ " + effectiveTax + "\nNet earnings: $ " + netEarning);
    }
}