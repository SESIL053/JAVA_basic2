
public class Practice_67 {
	
	public static void main(String[] args) {
		NumPair<Integer> i1 = new NumPair<Integer>(10, 20);
		NumPair<Double> d1 = new NumPair<Double>(1.25, 4.32);
		
		System.out.println("Integer 순서쌍 i1: " + i1.toString());
		System.out.println("기존의 순서쌍 i1: " + i1.toString());
		NumPair<Integer> i2 = i1.flip();
		System.out.println("Flip 실행 결과 순서쌍 i2: " + i2.toString());
		System.out.println("i1의 평균값: " + i1.calcAverage());
		System.out.println("i2의 평균값: " + i2.calcAverage());

		System.out.println("Double 순서쌍 d1: " + d1.toString());
		System.out.println("기존의 순서쌍 d1: " + d1.toString());
		NumPair<Double> d2 = d1.flip();
		System.out.println("Flip 실행 결과 순서쌍 d2: " + d2.toString());
		System.out.println("d1의 평균값: " + d1.calcAverage());
		System.out.println("d2의 평균값: " + d2.calcAverage());
	}

}
