import java.util.Scanner;

public class Lab306 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = "";
        int countWord = 0;

        System.out.print("Message : ");
        String message = input.nextLine();

        String msg = message.toLowerCase();
        if (msg.indexOf("nichi") >= 0) {
            countWord++;
        }

        if (countWord == 0) {
            System.out.println(message);
        } else {
            System.out.println("Nichi is a sentence");
        }

        input.close();
    }
}
