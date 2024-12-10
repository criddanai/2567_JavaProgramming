import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {

        int x, y, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Input value of X : ");
        x = input.nextInt();
        System.out.print("Input value of Y : ");
        y = input.nextInt();

        while(y <= x) {
            System.out.print("Input value of Y, again : ");
            y = input.nextInt();
        }

        sum = x;

        while(x < y) {
            x++;
            System.out.println(sum + " + " + x + " = " + (sum + x));
            sum += x;
        }

        input.close();
    }
}
