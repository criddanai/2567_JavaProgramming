package Lab04;

public class Theater extends Movie {
	private int theaterNo;
	
	Theater (String id, String name, Director director, int theatorNo) {
		super(id, name, director);
		this.theaterNo = theatorNo;
	}
	
	Theater (String id, String name, Director director) {
		super(id, name, director);
		this.theaterNo = 0;
	}
	
	public String getTheaterName() {
		return null;
	}
	
	public String toString() {
		return null;
	}
}
