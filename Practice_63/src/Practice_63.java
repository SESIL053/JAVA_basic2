import java.util.Scanner;

public class Practice_63 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<String> m1 = new MyBox<String>(sc.next());
		System.out.println("MyBox에 저장된 내용: " + m1.get());
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		m1.set(sc.next());
		System.out.println("MyBox에 저장된 내용: " + m1.get());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<Integer> m2 = new MyBox<Integer>(sc.nextInt());
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<Integer> m3 = new MyBox<Integer>(sc.nextInt());
		System.out.println(m2.get() + " + " + m3.get() + " = " + (m2.get() + m3.get()));
		
		sc.close();

	}

}
