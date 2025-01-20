package Lab01;

public class TestRectangle {

	public static void main(String[] args) {
		
		// Test constructor and toString()
		Rectangle r1 = new Rectangle(); // call default constructor
		// System.out.println(r1.toString()); // call toString method
		System.out.println(r1); // call toString() method
		
		// Call Parameterize Constructor method
		Rectangle r2 = new Rectangle(1.2f, 3.4f);
		System.out.println(r2);
		
		// Test method setters and getters
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		
		System.out.println("length is: " + r1.getLength());
		System.out.println("width is: " + r1.getWidth());
		System.out.println();
		
		// Test getArea() and getPerimeter() method
		System.out.printf("area is: %.2f%n", r1.getArea());
		System.out.printf("perimeter is: %.2f", r1.getPerimeter());
 		
	}
}
