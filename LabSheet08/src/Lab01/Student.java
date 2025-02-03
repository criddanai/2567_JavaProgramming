package Lab01;

public class Student {

	private String studentName;
	private int studentScore;

	// Getters and Setters method

	public void setName(String stdName) {
		studentName = stdName;
	}

	public String getName() {
		return this.studentName;
	}

	public void setScore(int stdScore) {
		studentScore = stdScore;
	}

	public int getScore() {
		return studentScore;
	}

	// Check the score is within the valid range(0 - 100)

	public boolean checkScore() {
//		if (getScore() >= 0 && getScore() <= 100) {
//			return true;
//		} else {
//			return false;
//		}

//		if (getScore() >=0 && getScore() <= 100) 
//			return true;
//		return false;	
//	}

		return getScore() >= 0 && getScore() <= 100; // return true/false
	}
	
	public boolean isPass() {
		return getScore() >= 50;
	}
}
