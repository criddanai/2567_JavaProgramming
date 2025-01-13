
public class TestEmployee {

	public static void main(String[] args) {

		// Create objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		// set detail
		emp1.setEmployeeDetails("John", 45, 20.0);
		emp2.setEmployeeDetails("Jane", 25, 20.9);
		
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		System.out.println("Employee 2 Details:");
		emp2.displayEmployeeDetails();

	}

}
