package Lab01;

public class ResizableCircle extends Circle implements Resizable {
	
	ResizableCircle (double radius) {
		super(radius);
	}
	
	@Override
	public void resize(int percent) {
		radius *= percent/100.0; // resize circle area
	}
	
	public String toString() {
		return "ResizableCircle[radius=" + super.toString() + "]";
	}
}
