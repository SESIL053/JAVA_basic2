import java.util.Scanner;

public class Practice_35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1번째 순서쌍 x좌표: ");
		int x1 = sc.nextInt();
		System.out.print("1번째 순서쌍 y좌표: ");
		int y1 = sc.nextInt();
		System.out.print("2번째 순서쌍 x좌표: ");
		int x2 = sc.nextInt();
		System.out.print("2번째 순서쌍 y좌표: ");
		int y2 = sc.nextInt();
		
		Pair p1 = new Pair(x1, y1);
		Pair p2 = new Pair(x2, y2);
		
		System.out.println("입력된 1번 순서쌍: " + p1.toString());
		System.out.println("입력된 2번 순서쌍: " + p2.toString());
		
		System.out.println("덧셈 결과: " + Pair.add(p1, p2));
		System.out.println("뺄셈 결과: " + Pair.sub(p1, p2));
		System.out.println("곱셈 결과: " + Pair.mult(p1, p2));
		System.out.println("나눗셈 결과: " + Pair.div(p1, p2));
		
		sc.close();
		
	}

}
