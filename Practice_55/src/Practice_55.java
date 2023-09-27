import java.util.Scanner;

public class Practice_55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isDone = false;
		String s1 = null, s2 = null;
		int n1 = 0, n2 = 0;
		
		while(isDone != true) {
			try {
				System.out.print("1번 피연산자를 입력하세요: ");
				s1 = sc.next();
				n1 = Integer.parseInt(s1);
			}
			catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
			isDone = true;
		}
		
		isDone = false;
		
		while(isDone != true) {
			try {
				System.out.print("2번 피연산자를 입력하세요: ");
				s2 = sc.next();
				n2 = Integer.parseInt(s2);
			}
			catch(NumberFormatException e) {
				System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				continue;
			}
			isDone = true;
		}
	
		System.out.println(n1 + " + " +  n2 + " = " + (n1 + n2));
		sc.close();
	}

}
