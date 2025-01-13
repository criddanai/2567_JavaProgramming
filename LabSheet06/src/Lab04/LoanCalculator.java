package Lab04;

public class LoanCalculator {

	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String _productName, double _price, double _interestRate, int _years) {
		productName = _productName;
		price = _price;
		interestRate = _interestRate;
		years = _years;
	}
	
	public double calculateMonthlyPayment() {
		double totalPayment = price + interestRate;
		double monthlyPayment = price * interestRate + (1 + interestRate)^totalPayment ;
	}
	
}
