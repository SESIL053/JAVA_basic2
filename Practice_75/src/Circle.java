
public class Circle {
	private Point center;
	private int radius;
	
	public Circle() {
		center = new Point(); // 중심값을 (0, 0)으로 초기화
		radius = 0; 
	}
	
	public Circle(int x, int y, int radius) {
		center = new Point();
		center.setX(x);
		center.setY(y);
		this.radius = radius;
	}
	
	public Circle (Point p, int radius) {
		center = new Point();
		center = p;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return center.toString() + "\n" + "반지름: " + radius;
	}
	
}
