import java.text.NumberFormat;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        int taxableIncome;
        double taxPayable;

        System.out.print("Enter the taxable income : $");
        taxableIncome = input.nextInt();

        if(taxableIncome <= 20000) { // 0 - 20,000
            taxPayable = 0;
        }
        else if(taxableIncome <= 40000) { // 20,001 - 40,000
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        }
        else if(taxableIncome <= 60000) { // 40,001 - 60,000
            taxPayable = 20000 * TAX_RATE_ABOVE_20K + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
        }
        else { // 60,001+
            taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K - (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
        }

        // String frm = String.format("%.2f", taxPayable);
        System.out.println("The income tax payable is: " + dollar.format(taxPayable));
    }
}
