
public class Employee {

	// Define attribute
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	// Method to set employee details
	public void setEmployeeDetails(String empName, int hours, double rate) {
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;
	}
	
	// Method to calculate salary
	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if (hourlyRate > 40) {
			double bonus = salary * 0.10;
			salary += bonus;
		}
		return salary;
	}
	
	// Method to display employee details
	public void displayEmployeeDetails() {
		System.out.printf("Name: %s", name);
		System.out.printf("Hours Worked: %d", hourWorked);
		System.out.printf("Hour Rate: %f", hourlyRate);
		System.out.printf("Total Salary: %f", calculateSalary());
	}

}
