import javax.swing.*;

public class Lab302 {
	public static void main(String[] args) {
		// first logic
//		String inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();
//		
//		// .contains() == มีข้อความนั้นอยู่
//		while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
//			inputEmail = JOptionPane.showInputDialog("Input your-email:");
//		}
//		
//		if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
//			JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
//		}

		// second logic
//		String inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();
//
//		// .contains() == มีข้อความนั้นอยู่
//		while (inputEmail.startsWith("@") || inputEmail.contains(" ")) {
//			inputEmail = JOptionPane.showInputDialog("Input your-email:");
//		}
//
//		while (true) {
//			if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
//				continue;
//			} else {
//				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
//				inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();
//				break;
//			}
//		}
//		JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);


	
	// third logic
	String inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();

	while(inputEmail.startsWith("@")||inputEmail.contains(" "))
	{
		inputEmail = JOptionPane.showInputDialog("Input your-email:");
	}

	do{
		if (inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			continue;
		} else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			inputEmail = JOptionPane.showInputDialog("Input your-email:").toLowerCase();
			break;
		}
	}while(false);
		JOptionPane.showMessageDialog(null,"Your e-mail is " + inputEmail);
	}
}
