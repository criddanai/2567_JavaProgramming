import javax.swing.JOptionPane;

public class Lab302_1 {

	public static void main(String[] args) {

		while (true) {
			String inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();

			while (inputEmail.startsWith("@") || inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your-email:");
			} // end while

			if (!(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com"))) {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			} 
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
				break;
			}
		} // end while
	}
}
