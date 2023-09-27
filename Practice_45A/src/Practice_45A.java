import java.util.Scanner;

public class Practice_45A {
	
	public static void printAll(Student[] s) {
		for(int i = 0; i < 3; i++) 
			System.out.println(s[i].toString());
	}

	public static void main(String[] args) {
		Student s1 = new Student(1111, 100, 3.2);
		UndergraduateStudent s2 = new UndergraduateStudent(2222, 100, 4.1, 3);
		GraduateStudent s3 = new GraduateStudent(3333, 100, 3.4, "SE");
		
		Student[] sList = new Student[3];
		sList[0] = s1;
		sList[1] = s2;
		sList[2] = s3;
		printAll(sList);

	}

}
