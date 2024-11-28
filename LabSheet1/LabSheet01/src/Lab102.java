import java.util.*;

public class Lab102 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int inputMinutes = input.nextInt();

        int minutesPerYears = inputMinutes / 525600;
        int remainingMinutes = inputMinutes % 525600;
        int minutesPerDays = remainingMinutes / 1440;
        System.out.println(inputMinutes + " minutes is approximately " + minutesPerYears + " years and " + minutesPerDays + " days");

        input.close();
    }
}