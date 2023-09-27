import java.util.Scanner;

public class Practice_52 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape[] sList = new Shape[3];
		sList[0] = new Shape();
		sList[1] = new Rectangle();
		sList[2] = new Triangle();
		
		System.out.print("도형의 정보를 입력하세요(X좌표, Y좌표): ");
		sList[0].setX(sc.nextInt());
		sList[0].setY(sc.nextInt());

		System.out.print("사각형의 정보를 입력하세요(X좌표, Y좌표, 가로, 세로): ");
		sList[1].setX(sc.nextInt());
		sList[1].setY(sc.nextInt());
		((Rectangle)sList[1]).setLength(sc.nextDouble());
		((Rectangle)sList[1]).setWidth(sc.nextDouble());
		
		System.out.print("삼각형의 정보를 입력하세요(X좌표, Y좌표, 가로, 세로): ");
		sList[2].setX(sc.nextInt());
		sList[2].setY(sc.nextInt());
		((Triangle)sList[2]).setBase(sc.nextDouble());
		((Triangle)sList[2]).setHeight(sc.nextDouble());
		
		System.out.println("입력된 정보입니다.");
		for(int i = 0; i < 3; i++) 
			System.out.println((i + 1) + ": " + sList[i].toString());
		
		System.out.print("중심좌표 이동 거리를 입력하세요(dx, dy): ");
		int dx = sc.nextInt();
		int dy = sc.nextInt();
		for(int i = 0; i < 3; i++) 
			sList[i].move(dx, dy);
		
		System.out.println("이동 후의 정보입니다.");
		for(int i = 0; i < 3; i++) 
			System.out.println((i + 1) + ": " + sList[i].toString());
		
		sc.close();
	}

}
