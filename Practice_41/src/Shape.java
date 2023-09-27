
public class Shape {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Shape() {
		this(0, 0);
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double calcArea() {
		return -1;
	}
	
	public String toString() {
		return "중심좌표: (" + x + ", " + y + ")";
	}
	
}
