
public class Practice_33 {
	
	public static void printInfo(Student sa, Student sb) {
		if(sa == sb)
			System.out.println("같은 객체");
		else if(sa.isTheSame(sb) == true)
			System.out.println("다른 객체/같은 학번");
		else
			System.out.println("다른 객체/다른 학번");
	}

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20111234, "컴퓨터학");
		Student s2 = new Student("성춘향", 20121357, "국문학");
		Student s3 = new Student("성춘향", 20121357, "국문학");
		Student s4 = s1;
		
		System.out.println("객체 p1의 정보");
		System.out.println(s1.toString());
		System.out.println("객체 p2의 정보");
		System.out.println(s2.toString());
		System.out.println("객체 p3의 정보");
		System.out.println(s3.toString());
		System.out.println("객체 p4의 정보");
		System.out.println(s4.toString());
		
		printInfo(s1, s2);
		printInfo(s2, s2);
		printInfo(s2, s3);
		printInfo(s1, s4);
		
	}

}
