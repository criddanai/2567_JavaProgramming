package Lab04;

public class Theater extends Movie {
	private int theaterNo;
	
	Theater (String id, String name, Director director, int theatorNo) {
		super(id, name, director);
		this.theaterNo = theatorNo;
	}
	
	Theater () {
		this.theaterNo = 0;
	}
	
	public String getTheaterName() {

		if (this.theaterNo >= 1 && this.theaterNo <= 11) {
			return "Basic Theater";
		} else if (this.theaterNo >= 12 && this.theaterNo <= 14) {
			return "Sweet Theater";
		} else if (this.theaterNo == 15) {
			return "Premium Theater";
		} else {
			return null;
		}

	}
	
	public String toString() {
		return this.getTheaterName() + ": " + super.toString();
	}
}
