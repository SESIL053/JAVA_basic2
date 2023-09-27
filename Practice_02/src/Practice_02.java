import java.util.Scanner;

public class Practice_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("화씨 온도를 입력하세요: ");
		int f = sc.nextInt();
		float c = (float)(5.0 / 9) * (f - 32);

		System.out.println("해당하는 섭씨 온도는 " + String.format("%.2f", c) + "입니다.");

		sc.close();
		
	}

}
