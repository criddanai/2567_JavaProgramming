import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Full name: ");
        String fullName = scan.nextLine();

        int cutFromSpace = fullName.trim().indexOf(" ");
        if (cutFromSpace <= 0) {
            System.out.println("Incorrect Name");
        } else {
            String firstName = fullName.substring(0, cutFromSpace).toUpperCase();
            String lastName = fullName.substring(cutFromSpace + 1).toLowerCase();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }

        scan.close();
    }
}
