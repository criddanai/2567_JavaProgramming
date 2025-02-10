package Lab02;

public class Sales extends Employee {
	private double sales;
	
	Sales (String id, String name, double salary, double sales) {
		super(id, name, salary);
		this.sales = sales;
	}
	
	Sales (String id, String name, double sales) {
		super(id, name);
		this.sales = sales;
	}
	
	public double getCommission() {
		if (this.sales <= 10000) {
			return 0;
		} else if (this.sales <= 50000) {
			return (this.sales - 10000) * 10/100;
		} else {
			return (this.sales - 50000) * 15/100;
		}
	}
	
	public String toString() {
		String frm = String.format("%,.2f", getCommission());
		return super.getName() + " (" + super.getId() + ")" + " get commission " + frm.formatted(getCommission()) + " B.";
	}
	
}
