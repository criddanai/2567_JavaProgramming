import java.util.*;

public class Lab307 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "", b = "";

        System.out.print("Text: ");
        String text = scan.nextLine();

        for (int i = 0; i < text.length(); i++) {
            String txt = text.substring(i, i + 1);
            if (!txt.equals(" ")) {
                a = a + txt;
                b = txt + b;
            }
        }

        if (a.equalsIgnoreCase(b)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

        scan.close();
    }
}
