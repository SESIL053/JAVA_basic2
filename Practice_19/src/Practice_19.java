import java.util.Scanner;

public class Practice_19 {
	
	public static int searchArray(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int c1 = 0;
		int c2 = 0;
		
		System.out.print("첫 번째 배열 입력: ");
		for (int i = 0; i < 3; i++)
			arr1[i] = sc.nextInt();
		
		System.out.print("두 번째 배열 입력: ");
		for (int i = 0; i < 3; i++)
			arr2[i] = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if(searchArray(arr1, arr2[i]) != -1) {
				if(i == searchArray(arr1, arr2[i]))
					c1++;
				else
					c2++;
			}
		}
		
		System.out.println("자리와 값이 모두 같은 숫자: " + c1 + "개");
		System.out.println("자리는 다르고 값만 같은 숫자: " + c2 + "개");
		
		sc.close();

	}

}
