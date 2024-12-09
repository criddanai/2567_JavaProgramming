import java.util.*;

public class Lab303 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();

		while (true) {
			System.out.print("Input a sentence, again : ");
			sentence = input.nextLine();
			for (int i = 0; i < sentence.length(); i++) {
				char ch = sentence.charAt(i);
			}
			if (sentence.endsWith(".")) {
				break;
			}

		}
		int whiteSpace = sentence.trim().length();
		int subSentence = sentence.substring(0).length();

		System.out.println();
		System.out.println("This sentence has " + ((whiteSpace - 1) - 10) + " spacebar.");
		System.out.println("This sentence has " + (subSentence - 10) + " word.");

		input.close();
	}

}
