import java.util.Scanner;

public class Practice_64 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫 번째 원소를 입력하세요: ");
		String s1 = sc.next();
		System.out.print("두 번째 원소를 입력하세요: ");
		String s2 = sc.next();
		MyPair<String> p1 = new MyPair<String>(s1, s2);
		System.out.println(p1.toString());
		
		System.out.println("숫자로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫 번째 원소를 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 원소를 입력하세요: ");
		int n2 = sc.nextInt();
		MyPair<Integer> p2 = new MyPair<Integer>(n1, n2);
		System.out.println(p2.toString());
		
		sc.close();

	}

}
