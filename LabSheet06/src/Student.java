
public class Student {
	
	private String name;
	private double[] scores;

	// Array Method  |  Method to set student details
	public void setStudentDetails(String stdName, double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	public double calculateAverageScores() {
		// variable
		double total = 0;
		
		/* for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		} */
		
		for (double _scores : scores) {
			total += _scores;
		}
		
		return total / scores.length;
	}
	
	public String getGrade() {
		double average = calculateAverageScores();
		if (average >= 80) {
			return "A";
		} else if (average >= 70) {
			return "B";
		} else if (average >= 60) {
			return "C";
		} else if (average >= 50) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name: " + name);
		/* for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} */
		
		for (double _scores : scores) {
			System.out.println(_scores + " ");
		}
		
		System.out.println("\nAverage Score: " + calculateAverageScores());
		System.out.println("Grade: " + getGrade());
	}
	
}
