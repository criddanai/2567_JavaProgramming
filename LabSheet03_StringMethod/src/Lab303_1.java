import javax.swing.*;

public class Lab303_1 {
	public static void main(String[] args) {
		
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		
		while(true) {
		sentence = JOptionPane.showInputDialog("Input a sentence, again:");
		
			if(sentence.endsWith(".")) {
				break;
			}
		}
		int whiteSpace = sentence.trim().length();
		int subSentence = sentence.substring(0).length();
		
		JOptionPane.showMessageDialog(null, "This sentence has " + ((whiteSpace - 1) - 10) + " spacebar."
					+ "\nThis sentence has " + (subSentence - 10) + " word.");
	}

}
