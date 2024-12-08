import javax.swing.*;
import java.text.*;


public class Lab203 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.0");
		
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		
		inputHeight /= 100;
		double bmiCal = inputWeight / (inputHeight * inputHeight);
		
		if(bmiCal <= 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmiCal) + "\nYou're Underweight", "BMI", JOptionPane.WARNING_MESSAGE);
		}
		else if(bmiCal >= 18.5 || bmiCal <= 24.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmiCal) + "\nYou're Normal-weight", "BMI", JOptionPane.WARNING_MESSAGE);
		}
		else if(bmiCal >= 25.0 || bmiCal <= 29.9) {
			JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmiCal) + "\nYou're Over-weight", "BMI", JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "BMI = " + frm.format(bmiCal) + "\nYou're Obesity", "BMI", JOptionPane.WARNING_MESSAGE);
		}

	}

}
