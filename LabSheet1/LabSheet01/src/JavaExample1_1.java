import java.util.*;


public class JavaExample1_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// รับข้อมูลด้วย next()
		System.out.print("Enter your Firstname (using next): ");
		String firstName = input.next();
		input.nextLine(); // clear buffering
		
		System.out.print("Enter your Lastname(using nextLine): ");
		String lastName = input.nextLine();
		
		System.out.println();
		// แสดงผลข้อมูลที่รับมาทาง console
		System.out.println("\n------------- OUTPUT ----------------");
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		
		input.close();

	}

}
