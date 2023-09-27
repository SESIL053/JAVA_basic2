import java.util.Scanner;

public class Practice_58 {
	
	public static int searchArray(int[] array, int key) throws NotFoundException {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		throw (new NotFoundException());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.println("10개의 숫자를 입력하세요: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("배열에 저장된 숫자입니다.");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		
		System.out.print("\n숫자를 하나 입력하세요: ");
		int key = sc.nextInt();
		
		try {
			if(searchArray(arr, key) != -1)
				System.out.println("입력된 숫자 " + key + "는 인덱스 " + searchArray(arr, key) + "번에 존재합니다.");		
		}
		catch(NotFoundException e) {
			System.out.println("입력된 숫자 " + key + "는 배열에 존재하지 않습니다.");	
		}
	
		sc.close();
	}

}
