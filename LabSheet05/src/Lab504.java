import java.util.*;

public class Lab504 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] score = new double[5];
		double avg = 0;
		double sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			score[i] = input.nextDouble();
			avg += score[i];
		}
		avg = avg/ (score.length);
		System.out.printf();
		
		input.close();
	}
}
