
public class Rectangle extends Shape implements Drawable {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle() {
		this(0, 0);
	}
	
	public Rectangle(int x, int y) {
		super(x, y);
	}
	
	public Rectangle(int x, int y, double length, double width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	
	public double calcArea() {
		return length * width;
	}	
	
	public String toString() {
		return super.toString() + ", 가로: " + String.format("%.2f", length) + ", 세로: " + String.format("%.2f", width) + ", 면적: " + String.format("%.2f", calcArea());
	}

	@Override
	public void draw() {
		System.out.println("사각형, " + toString());
	}
	
}
