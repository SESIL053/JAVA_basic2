
public class Date {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String toString() {
		return year + "년 " + month + "월 " + day + "일";
	}
	
	public static int compareDate(Date x, Date y) {
		if(x.year != y.year) { // 년도 다른 경우
			if(x.year < y.year)
				return -1;
			else if(x.year > y.year)
				return 1;
		}
		else { // 년도 같은 경우
			if(x.month != y.month) { // 월 다른 경우
				if(x.month < y.month)
					return -1;
				else if(x.month > y.month)
					return 1;
			}
			else { // 월 같은 경우
				if(x.day < y.day)
					return -1;
				else if(x.day == y.day)
					return 0;
				else
					return 1;
			}
		}
		return -1;
	}
	
}
