import java.util.Scanner;

public class Practice_40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 숫자를 입력하세요: ");
		int num = sc.nextInt();
		Student[] sList = new Student[num];
		
		for(int i = 0; i < num; i++) {
			sList[i] = new Student();
			System.out.println(i + 1 + "번 학생의 정보");
			System.out.print("이름: ");
			sList[i].setName(sc.next());
			System.out.print("학번: ");
			sList[i].setSid(sc.nextInt());
			System.out.print("전공: ");
			sList[i].setMajor(sc.next());
		}
		
		System.out.println("입력된 학생의 정보입니다.");
		for(int i = 0; i < num; i++) 
			System.out.println("[" + (i + 1) + "] " + sList[i].toString());
		
		for(int i = 1; i < num; i++) {
			System.out.print("\"홍길동\" 학생은 \"" + sList[i].getName() + "\" 학생과 ");
			if(sList[0].equalsMajor(sList[i]) == true) {
				if(sList[0].isSenior(sList[i]) == -1)
					System.out.println("전공은 같고, 학번은 빠릅니다.");
				else if(sList[0].isSenior(sList[i]) == 1)
					System.out.println("전공은 같고, 학번은 느립니다.");
				else
					System.out.println("전공은 같고, 학번도 같습니다.");
			}
			else {
				if(sList[0].isSenior(sList[i]) == -1)
					System.out.println("전공은 다르고, 학번은 빠릅니다.");
				else if(sList[0].isSenior(sList[i]) == 1)
					System.out.println("전공은 다르고, 학번은 느립니다.");
				else
					System.out.println("전공은 다르고, 학번도 같습니다.");
			}
		}
		
	}

}
