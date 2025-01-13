import java.util.Scanner;

public class Lab505 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] num = { 78, 36, 58, 41, 25, 92, 75 };

        System.out.print("Input index of array : ");
        int indexOfArray = scan.nextInt();

        while (indexOfArray < 0 || indexOfArray > (num.length - 1)) {
            System.out.print("Input index of array, again : ");
            indexOfArray = scan.nextInt();
        }
        System.out.println();
        System.out.println("Value in current index is " + (num[indexOfArray]));

        if (indexOfArray == 6) {
            System.out.println("Sorry, " + indexOfArray + " is the last index in array.");
        } else {
            System.out.println("Value in next    index is " + num[(indexOfArray + 1)]);
        }
    }
}
