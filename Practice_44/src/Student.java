
public class Student {
	private int id;
	private int tuition;
	private double gpa;
	
	public Student(int id, int tuition, double gpa) {
		super();
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public int getId() {
		return id;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return "학번: " + id + ", 등록금: " + tuition + ", 평균 등급: " + gpa + ", 장학금: " + scholarship();
	}
	
	public int scholarship() { 
		return (int)(tuition * 0.5);
	}

}