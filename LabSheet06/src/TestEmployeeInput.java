import java.util.Scanner;

public class TestEmployeeInput {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Create objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter detail for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		// double ไม่เก็บ \n --> วิธีแก้ หรือการเก็บ \n
		scan.nextLine();
		
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		System.out.println("\nEmployee 1 Details: ");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEnter detail  for Employee 1:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		System.out.println("Employee 2 Details: ");
		emp2.displayEmployeeDetails();
		
		scan.close();

	}
	
}
