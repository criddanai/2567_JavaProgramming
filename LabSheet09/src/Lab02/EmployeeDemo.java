package Lab02;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input employee id: ");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input employee name: ");
		String empName = scan.nextLine();
		System.out.print("Input employee salary: ");
		double empSalary = scan.nextDouble();
		System.out.print("Input employee sales: ");
		double empSales = scan.nextDouble();
		
		Sales emp9 = new Sales(empId, empName, empSalary, empSales);
		String frm = String.format("%,.2f", emp9.getSalary(), emp9.getCommission());
		System.out.println(emp9);
		System.out.println("Total salary " + frm.formatted(emp9.getSalary() + emp9.getCommission()) + " bath.");
		
	}

}
