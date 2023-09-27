import java.util.Scanner;

public class Practice_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();

		if (n % 2 == 0 && n >= 0)
			System.out.println("입력한 정수 " + n + "은 짝수입니다.");
		else if (n % 2 == 1 && n >= 0)
			System.out.println("입력한 정수 " + n + "은 홀수입니다.");
		else if (n < 0)
			System.out.println("입력한 정수 " + n + "은 음수입니다.");

		sc.close();

	}

}
