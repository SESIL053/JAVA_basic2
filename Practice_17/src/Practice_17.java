import java.util.Scanner;

public class Practice_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int sum = 0;
		float avg = 0;
		
		// 1번 for
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		// 2번 for
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
		
		// 3번 for
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[arr.length - i - 1] + "\t");
		System.out.println();
		
		// 4번 for
		for (int i = 0; i < 10; i++)
			sum += arr[i];
		
		avg = (float)sum / arr.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + String.format("%.2f", avg));
		
		sc.close();

	}

}
