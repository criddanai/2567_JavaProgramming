import javax.swing.*;
import java.text.*;


public class Lab203 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.0");
		
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog(null,"Input Weight:"
								, "Input", JOptionPane.QUESTION_MESSAGE));
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Height:"
								, "Input", JOptionPane.QUESTION_MESSAGE));

		double height = inputHeight / 100;
		double bmi = inputWeight / (height * height);

		String bmiCollect;
		if(bmi < 18.5) {
			bmiCollect = "Underweight";
		}
		else if(bmi < 25) {
			bmiCollect = "Normal-weight";
		}
		else if(bmi < 30) {
			bmiCollect = "Overweight";
		}
		else {
			bmiCollect = "Obesity";
		}

		JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmi)
					+ "\nYou're " + bmiCollect, "BMI", JOptionPane.INFORMATION_MESSAGE);
	}
}
