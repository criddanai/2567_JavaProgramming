
public class TestStudent {

	public static void main(String[] args) {
		
		// Create Object
		Student student1 = new Student();
		Student student2 = new Student();
		
		//  Set Student details & sent args array
		student1.setStudentDetails("Intouch", new double[] {85.0});
		student2.setStudentDetails("Kriddanai", new double[] {60.0, 80.5, 40.0});
		
		line('=');
		System.out.println("Student#1 Details:");
		student1.displayStudentDetails();
		
		line('*');
		
		System.out.println("Student#2 Details:");
		student2.displayStudentDetails();
		
		line('-');

	}
	
	public static void line(char ch) {
		// System.out.println("****************************");
		for (int i = 1; i < 30; i++) {
			// System.out.print("*");
			System.out.print(ch);
		}
		System.out.println();
	}
}
