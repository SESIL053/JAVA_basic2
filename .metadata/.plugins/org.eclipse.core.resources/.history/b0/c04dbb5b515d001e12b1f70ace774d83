import java.util.Scanner;

public class Practice_78 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력을 원하는 영화 편수를 입력하세요: ");
		int n = sc.nextInt();
		Movie[] mList = new Movie[(n+1)];
		
		for(int i = 0; i < n; i++) {
			mList[i] = new Movie();
			System.out.println((i + 1) + "번 영화 정보를 입력하세요.");
			System.out.print("영화 제목은? ");
			mList[i].setTitle(sc.next());
			System.out.print("감독은? ");
			mList[i].setDirector(sc.next());
			System.out.print("관람 년도는? ");
			int year = sc.nextInt();
			System.out.print("관람 월은? ");
			int month = sc.nextInt();
			System.out.print("관람 일은? ");
			int day = sc.nextInt();
			Date date = new Date(year, month, day);
			mList[i].setViewDay(date);
			System.out.println();
		}
		
		System.out.println("입력된 영화 정보입니다.");
		for(int i = 0; i < n; i++) 
			System.out.println(mList[i].printOneLine());
		
		mList[n] = new Movie();
		Date earlistDate = new Date(9999, 9999, 9999);
		mList[n].setViewDay(earlistDate);
		
		for(int i = 0; i < n; i++) {
			if(Date.compareDate(mList[n].getViewDay(), mList[i].getViewDay()) == 1) 
				mList[n] = mList[i];
		}
		System.out.println("\n관람일이 가장 빠른 영화는 \"" + mList[n].getTitle() + "\"입니다.");
		
		sc.close();
	}

}
