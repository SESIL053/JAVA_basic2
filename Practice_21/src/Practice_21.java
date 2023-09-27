
import java.util.Scanner;

public class Practice_21 {
	
	public static int searchArray(int[] array, int key) {
	    int index = 0;
	    for (int x : array) {
	        if (x == key)
	            return index;
	        index++;
	    }
	    return -1;
	}
	
	public static void printArray(int[] array) {
		for(int x : array)
			System.out.print(x + "\t");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		System.out.println("숫자를 입력하세요: ");
		for (int i = 0; i < length; i++)
			arr[i] = sc.nextInt();

		System.out.println("배열에 저장된 숫자: ");
		printArray(arr);
		
		System.out.print("찾고 싶은 숫자를 입력하세요: ");
		int key = sc.nextInt();
		
		if(searchArray(arr, key) == -1)
			System.out.println("입력한 숫자 " + key + "는 배열에 없습니다.");
		else
			System.out.println("입력한 숫자 " + key + "는 배열의 " + searchArray(arr, key) + "번 자리에 있습니다.");
		
		sc.close();

	}

}
