import java.util.Scanner;

public class Lab503 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[7];
        int countOdd = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = input.nextInt();
            if (num[i]%2 == 1) {
                countOdd += 1;
            }
        }
        System.out.println();
        System.out.println("There are " + countOdd + " of odd number.");
        System.out.print("List of odd number :");

        for (int number : num) {
            if (number%2 == 1) {
                System.out.print(" " + number);
            }
        }
        input.close();
    }
}
