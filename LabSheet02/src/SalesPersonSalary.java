import java.util.*;


public class SalesPersonSalary {

	public static void main(String[] args) {
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		final double BASE_SALARY = 1000.0;
		
		int sales;
		double salary;
		
		Scanner input = new Scanner(System.in);
		
		// Loop for input and computation
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = input.nextInt();
		
			// Check for sentinel value
			if(sales == SENTINEL) {
				break;
			}
			
			// Compute salary
			salary = BASE_SALARY + (sales * COMMISSION_RATE);
			
			// Display the salary
			System.out.printf("The salesperson's salary is $%,.2f", salary);
			System.out.println();
		}
		System.out.println("bye");
		System.out.println("All salesperson's salaries have been computed.");
	}
}
