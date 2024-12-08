import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number  : ");
		int number = input.nextInt();
		
		int tempNum = Integer.MIN_VALUE;
		
		// using break statement
		
		while(true) {
		
			if (tempNum > number) {
				System.out.println();
				System.out.println("BYE BYE");
				break;
			}
			
			tempNum = number;
			System.out.print("Input number  : ");
			number = input.nextInt();
		}
	}
}
