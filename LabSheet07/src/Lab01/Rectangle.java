package Lab01;

public class Rectangle {
	
	// create two private attribute
	private float length;
	private float width;
	
	// Default Constructor
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
	}	
	/*
		private float length;
		private float width;
	 	Rectangle() {}
	 */
	
	
	// Parameterized Constructor
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;		
		// this keyword จะบ่งบอกว่า เรียกใช้ attribute in class นี้
	}
	
	
	// Getters and Setters method
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	// Method to calculate area
	public double getArea() {
		return this.length * this.width;
	}
	
	// Method to calculate perimeter
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}
	
	// Method toString() --> return String (Special method for dev)
	public String toString() {
		return "Rectangle[length = " + this.length + ", width = " + this.width +"]";
	}
	
	
}
