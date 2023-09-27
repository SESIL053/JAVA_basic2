
public class Practice_28 {

	public static void main(String[] args) {
		Person p1 = new Person("김동덕");
		Person p2 = new Person("홍길동", 30);
		Person p3 = new Person("성춘향", 16, "남원시");
		
		p1.setAge(22);
		p1.setAddress("서울시");
		p2.setAddress("제주시");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
