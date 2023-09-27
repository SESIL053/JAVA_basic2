
public class Practice_39 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20111234, "컴퓨터학");
		Student s2 = new Student("성춘향", 20121357, "국문학");
		Student s3 = new Student("이몽룡", 20101357, "컴퓨터학");

		System.out.println("1번 학생의 정보");
		System.out.println(s1.toString());
		System.out.println("2번 학생의 정보");
		System.out.println(s2.toString());
		System.out.println("3번 학생의 정보");
		System.out.println(s3.toString());
		
		System.out.print("\"홍길동\" 학생은 \"성춘향\" 학생과 ");
		if(s1.equalsMajor(s2) == true) {
			if(s1.isSenior(s2) == -1)
				System.out.println("전공은 같고, 학번은 빠릅니다.");
			else if(s1.isSenior(s2) == 1)
				System.out.println("전공은 같고, 학번은 느립니다.");
			else
				System.out.println("전공은 같고, 학번도 같습니다.");
		}
		else {
			if(s1.isSenior(s2) == -1)
				System.out.println("전공은 다르고, 학번은 빠릅니다.");
			else if(s1.isSenior(s2) == 1)
				System.out.println("전공은 다르고, 학번은 느립니다.");
			else
				System.out.println("전공은 다르고, 학번도 같습니다.");
		}

		System.out.print("\"홍길동\" 학생은 \"이몽룡\" 학생과 ");
		if(s1.equalsMajor(s3) == true) {
			if(s1.isSenior(s3) == -1)
				System.out.println("전공은 같고, 학번은 빠릅니다.");
			else if(s1.isSenior(s3) == 1)
				System.out.println("전공은 같고, 학번은 느립니다.");
			else
				System.out.println("전공은 같고, 학번도 같습니다.");
		}
		else {
			if(s1.isSenior(s3) == -1)
				System.out.println("전공은 다르고, 학번은 빠릅니다.");
			else if(s1.isSenior(s3) == 1)
				System.out.println("전공은 다르고, 학번은 느립니다.");
			else
				System.out.println("전공은 다르고, 학번도 같습니다.");
		}
		
	}

}
