
public class Practice_76 {
	
	public static void main(String[] args) {
	
		Movie m1 = new Movie();
		System.out.println("첫 번째 영화의 정보입니다.");
		System.out.println(m1.toString());
		
		Date d2 = new Date(2010, 7, 25);
		Movie m2 = new Movie("인셉션", "놀란", d2);
		System.out.println("두 번째 영화의 정보입니다.");
		System.out.println(m2.toString());
		
		Movie m3 = new Movie("러브 액츄얼리", "리처드 커티스");
		Date d3 = new Date(2015, 12, 24);
		m3.setViewDay(d3);
		System.out.println("세 번째 영화의 정보입니다.");
		System.out.println(m3.toString());
		
	}

}
