import java.util.*;


public final class Lab102 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		int minutes = input.nextInt();
		int minutesPerYears = minutes / 535600;
		int minutesRemain =  minutes % (535600);
		int minutesPerDays = minutesRemain / 1440;
		
		System.out.println(minutes + " minutes is  approximately " + minutesPerYears + " years and " 
							+ minutesPerDays + " days");
		
		
		
		input.close();
	}

}
