
public class Triangle extends Shape implements Drawable {
	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Triangle() {
		this(0, 0);
	}
	
	public Triangle(int x, int y) {
		super(x, y);
	}
	
	public Triangle(int x, int y, double base, double height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}

	public double calcArea() {
		return (base * height) / 2;
	}	
	
	public String toString() {
		return super.toString() + ", 밑변: " + String.format("%.2f", base) + ", 높이: " + String.format("%.2f", height) + ", 면적: " + String.format("%.2f", calcArea());
	}
	
	@Override
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
	
}
