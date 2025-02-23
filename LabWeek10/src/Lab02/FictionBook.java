package Lab02;

public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String firstName;
	private String lastName;
	
	FictionBook (String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		firstName = author_name.substring(0, space);
		lastName = author_name.substring(space + 1);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String getLastName() {
		return lastName.toUpperCase();
	}
	
	@Override
	public String getFirstName() {
		return firstName.toUpperCase();
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	public boolean checkEmail() {
		if (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return  this.getTitle() + " write by " + getLastName().substring(0, 1) + "." + this.getFirstName() + "(" + this.getEmail() + ")"
					+ "\nPublished for " + this.totalPublicYear() + " years(s)";
	}
}
