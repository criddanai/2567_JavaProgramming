import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Input some sentence : ");
        String sentence = kb.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("The sentence must end with full stop point : ");
            sentence = kb.nextLine();
        }
        System.out.println();

        int j = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                System.out.println(sentence.substring(j, i));
                j = i + 1;
            }
        }

        System.out.println(sentence.substring(j));

        kb.close();
    }
}
