import java.util.Scanner;

public class Practice_41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(sc.nextInt());

		System.out.print("사각형의 X좌표를 입력하세요: ");
		r.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		r.setLength(sc.nextDouble());
		System.out.print("사각형의 세로를 입력하세요: ");
		r.setWidth(sc.nextDouble());
		
		System.out.print("삼각형의 X좌표를 입력하세요: ");
		t.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(sc.nextInt());
		System.out.print("삼각형의 밑변을 입력하세요: ");
		t.setBase(sc.nextDouble());
		System.out.print("삼각형의 높이를 입력하세요: ");
		t.setHeight(sc.nextDouble());
		
		System.out.println("입력된 도형의 정보입니다.");
		System.out.println(s.toString());
		System.out.println("입력된 사각형의 정보입니다.");
		System.out.println(r.toString());
		System.out.println("입력된 삼각형의 정보입니다.");
		System.out.println(t.toString());
		
		sc.close();
	}

}
