import java.util.Scanner;

public class Practice_45B {
	
	public static void printAll(Student[] s) {
		for(int i = 0; i < 3; i++) 
			System.out.println(s[i].toString());
	}

	public static void main(String[] args) {
		Student[] sList = new Student[3];
		sList[0] = new Student();
		sList[1] = new UndergraduateStudent();
		sList[2] = new GraduateStudent();
		
		sList[0].setId(1111);
		sList[0].setTuition(100);
		sList[0].setGpa(3.2);
		
		sList[1].setId(2222);
		sList[1].setTuition(100);
		sList[1].setGpa(4.1);
		((UndergraduateStudent)(sList[1])).setYear(3);
		
		sList[2].setId(3333);
		sList[2].setTuition(100);
		sList[2].setGpa(3.4);
		((GraduateStudent)(sList[2])).setLab("SE");
		
		printAll(sList);

	}

}
