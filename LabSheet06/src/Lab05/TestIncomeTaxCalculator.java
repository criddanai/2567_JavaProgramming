package Lab05;

public class TestIncomeTaxCalculator {
    public static void main(String[] args) {
        IncomeTaxCalculator incomeTax = new IncomeTaxCalculator();

        incomeTax.setIncome(450000);
        incomeTax.displayTaxDetails();
    }
}
