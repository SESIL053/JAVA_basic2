import java.util.Random;

public class Practice_08 {

	public static void main(String[] args) {
		Random rd = new Random();
		int count = 1;

		while (count <= 10) {
			System.out.println("[" + count + "차 실행]");
			
			for (int i = 0; i < 10; i++) {
				int n = rd.nextInt(100);
				System.out.print(n + "\t");
			}
			
			System.out.println();
			count++;
		}

	}

}
