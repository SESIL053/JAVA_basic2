import java.util.Scanner;

public class Practice_47 {
	
	private static void speak3Times(Dog d) {
		d.speak();
		d.speak();
		d.speak();
	}
	
	private static void speak3Times(Person p) {
		p.speak();
		p.speak();
		p.speak();
	}
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("김동덕", 1);
		Person p2 = new Person("홍길동", 20);
		
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}

}
