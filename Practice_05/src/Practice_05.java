import java.util.Scanner;

public class Practice_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();

		if (n >= 0)
			System.out.println("입력한 정수 " + n + "의 절댓값은 " + n + "입니다.");
		else
			System.out.println("입력한 정수 " + n + "의 절댓값은 " + -n + "입니다.");

		sc.close();

	}

}
