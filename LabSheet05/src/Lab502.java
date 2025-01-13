import java.util.Scanner;

public class Lab502 {

    public static void main(String[] args) {

        int[] num = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            num[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Summation of positive number is " + sumOfPos(num));
    }

    public static int sumOfPos(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}
