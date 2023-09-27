import java.util.Scanner;

public class Practice_75 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle c1 = new Circle();		
		System.out.println("첫 번째 원 c1의 정보입니다.");
		System.out.println(c1.toString() + "\n");
		
		System.out.println("두 번째 원 c2의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		int x2 = sc.nextInt();
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		int y2 = sc.nextInt();
		System.out.print("반지름 값을 입력하세요: ");
		int r2 = sc.nextInt();
		
		Circle c2 = new Circle(x2, y2, r2);
		System.out.println("두 번째 원 c2의 정보입니다.");
		System.out.println(c2.toString() + "\n");
		
		Point p3 = new Point();
		p3.setX(60);
		p3.setY(70);
		
		Circle c3 = new Circle(p3, 80);
		System.out.println("세 번째 원 c3의 정보입니다.");
		System.out.println(c3.toString() + "\n");
		
		Point p4 = new Point();
		System.out.println("네 번째 원 c4의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		p4.setX(sc.nextInt());
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		p4.setY(sc.nextInt());
		System.out.print("반지름 값을 입력하세요: ");
		
		Circle c4 = new Circle(p4, sc.nextInt());
		System.out.println("네 번째 원 c4의 정보입니다.");
		System.out.println(c4.toString() + "\n");
		
		sc.close();
	}

}
