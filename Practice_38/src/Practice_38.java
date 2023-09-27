import java.util.Scanner;

public class Practice_38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date[] dateList = new Date[6];
		int earlist = 0;
		dateList[0] = new Date(9999, 9999, 9999);
		
		for(int i = 1; i < 6; i++) {
			System.out.print(i + "번째 날짜를 입력하세요: ");
			dateList[i] = new Date();
			dateList[i].setYear(sc.nextInt());
			dateList[i].setMonth(sc.nextInt());
			dateList[i].setDay(sc.nextInt());
		
			if(Date.compareDate(dateList[0], dateList[i]) == 1) {
				dateList[0] = dateList[i];
				earlist = i;
			}
		}
		
		System.out.println("가장 빠른 날짜는 " + earlist + "번째 입력된 " + dateList[0].toString() + "입니다.");
		
		sc.close();
		
	}

}
