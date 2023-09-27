import java.util.Scanner;

public class Practice_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isPrime = true;
		int n = 0;

		while (n <= 0) {
			System.out.print("숫자를 입력하세요: ");
			n = sc.nextInt();

			if (n <= 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}

			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime == false || n == 1)
			System.out.println("입력된 숫자 " + n + "은 소수가 아닙니다.");
		else
			System.out.println("입력된 숫자 " + n + "은 소수입니다.");

		sc.close();
		
	}

}
