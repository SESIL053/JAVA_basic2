import java.util.Scanner;

public class Practice_49 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		System.out.print("도형의 정보를 입력하세요(X좌표, Y좌표): ");
		s.setX(sc.nextInt());
		s.setY(sc.nextInt());

		System.out.print("사각형의 정보를 입력하세요(X좌표, Y좌표, 가로, 세로): ");
		r.setX(sc.nextInt());
		r.setY(sc.nextInt());
		r.setLength(sc.nextDouble());
		r.setWidth(sc.nextDouble());
		
		System.out.print("삼각형의 정보를 입력하세요(X좌표, Y좌표, 가로, 세로): ");
		t.setX(sc.nextInt());
		t.setY(sc.nextInt());
		t.setBase(sc.nextDouble());
		t.setHeight(sc.nextDouble());
		
		System.out.println("입력된 정보입니다.");
		System.out.println(s.toString());
		r.draw();
		t.draw();
		
		System.out.print("중심좌표 이동 거리를 입력하세요(dx, dy): ");
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		s.move(dx, dy);
		r.move(dx, dy);
		t.move(dx, dy);
		
		System.out.println("이동된 도형의 정보입니다.");
		System.out.println(s.toString());
		r.draw();
		t.draw();
		
		sc.close();
	}

}
