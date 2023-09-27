import java.util.Scanner;

public class Practice_66 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] sArray = {"하나", "둘", "셋"};
		Integer[] iArray = {10, 20, 30, 40};
		
		System.out.println("문자열 배열의 내용입니다.");
		MyArray.displayArray(sArray);
		
		for(int i = 0; i < 2; i++) {
			System.out.print("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
			System.out.println(MyArray.pick(sArray, sc.nextInt()));
		}
		
		System.out.print("0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요: ");
		MyArray.swap(sArray, 0, sc.nextInt());
		MyArray.displayArray(sArray);
		
		System.out.println("정수형 배열의 내용입니다.");
		MyArray.displayArray(iArray);
		
		for(int i = 0; i < 2; i++) {
			System.out.print("정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
			System.out.println(MyArray.pick(iArray, sc.nextInt()));
		}
		
		System.out.print("0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요: ");
		MyArray.swap(iArray, 0, sc.nextInt());
		MyArray.displayArray(iArray);
		
		sc.close();

	}

}
