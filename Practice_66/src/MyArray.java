
public class MyArray {

	public static <T>T pick(T arr[], int index) {
		System.out.print(index + "번 인덱스 저장 내용: ");
		if(index >= arr.length || index < 0) {
			System.out.print("인덱스가 범위를 벗어났습니다 >> ");
			return null;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(arr[index]))
				return arr[index];
		}
		return null;
	}
	
	public static <T> void displayArray(T arr[]) {
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + "\t");
		System.out.println();
	}
	
	public static <T> void swap(T arr[], int i, int j) {
		T temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}	
	
}
