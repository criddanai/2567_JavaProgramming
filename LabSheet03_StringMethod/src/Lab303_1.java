import javax.swing.*;

public class Lab303_1 {
	public static void main(String[] args) {
		
		String sentence = JOptionPane.showInputDialog("Input a sentence:");

		while (!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again:");
		}

		int whiteSpace = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				whiteSpace += 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, "This sentence has " + whiteSpace + " spacebar."
					+ "\nThis sentence has " + (whiteSpace + 1) + " word.");
	}
}
