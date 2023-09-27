
public class Practice_65 {
	
	public static void main(String[] args) {
		HealthData<Integer, Integer> h1 = new HealthData<Integer, Integer>("김동덕", 160, 50);
		HealthData<Double, Integer> h2 = new HealthData<Double, Integer>("홍길동", 180, 100.35);
		HealthData<Integer, Double> h3 = new HealthData<Integer, Double>("성춘향", 156.7, 65);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		System.out.println("세 사람 체중의 합: " + (double)(h1.getWeight() + h2.getWeight() + h3.getWeight()));
	}

}
