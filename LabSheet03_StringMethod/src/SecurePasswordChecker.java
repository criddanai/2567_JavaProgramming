import java.util.Scanner;

public class SecurePasswordChecker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("Enter your password(type 'exit' to quit) :");
			String password = input.nextLine();
			
			// check if user wants to exit
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate.");
				break;
			} // end exit
			
			// Validate password
			String errors = "";
			
			// Check for minimum length
			if(password.length() < 8) {
				errors += "- Password must be at least 8 characters long.\n";
			}
			
			// Check for Upper case, Lower case, Digit
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for(int i = 0; i < password.length(); i++) {
				// วน check ทีละ 1 index
				char ch = password.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true; // check upper case
				}
				else if(ch >= 'a' && ch <= 'z') {
					hasLowerCase = true; // check lower case
				}
				else if(ch >= '0' && ch <= '9') {
					hasDigit = true; // check digit
				}
			} // end of for loop
			
			// Concatenate errors based on missing criteria
			if(!hasUpperCase) {
				errors += "- Password must contain at least one uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				errors += "- Password must contain at least one uppercase letter(a-z).\n";
			}
			if(!hasDigit) {
				errors += "- Password must contain at least one digit (0-9).\n";
			}
			
			// Display errors or success message
			if(errors.isEmpty()) {
				System.out.println("Your password is secure.");
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(errors);
			}
			
		} // end while(true)
		
		input.close();
	}
}
