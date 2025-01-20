package Lab04;

public class LoanCalculator {

    private String productName;
    private double price;
    private double interestRate;
    private int years;

    public void setLoanDetails(String productName, double price, double interestRate, int years) {
        this.productName = productName;
        this.price = price;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateMonthlyPayment() {
        double monthlyRate = (interestRate / 100) / 12;
        int totalMonths = years * 12;
        double totalMonthlyPayment = (price * monthlyRate) / (1 - Math.pow(1 + monthlyRate, - totalMonths));
        return totalMonthlyPayment;
    }

    public void displayLoanDetails() {
        double monthlyPayment = calculateMonthlyPayment();
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Loan Period: " + years + " years");
        System.out.println("Monthly Payment: " + String.format("%.2f", monthlyPayment));
    }

}
