
public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date() {
		this(1990, 1, 1);
	}
	
	public Date(int year) {
		this.year = year;
	}
	
	public Date(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
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
	
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일";
	}
	
	protected boolean isLeap() {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
			return true;
		else 
			return false;
	}
	
	public String testLeapYears() {
		if(isLeap() == true)
			return (year + "년은 윤년입니다.");
		else
			return (year + "년은 윤년이 아닙니다.");
	}

	public String printWestern() {
		switch(month) {
		case 1:
			return "January " + getDay() + ", " + getYear();
		case 2:
			return "February " + getDay() + ", " + getYear();
		case 3:
			return "March " + getDay() + ", " + getYear();
		case 4:
			return "April " + getDay() + ", " + getYear();
		case 5:
			return "May " + getDay() + ", " + getYear();
		case 6:
			return "June " + getDay() + ", " + getYear();
		case 7:
			return "July " + getDay() + ", " + getYear();
		case 8:
			return "August " + getDay() + ", " + getYear();
		case 9:
			return "September " + getDay() + ", " + getYear();
		case 10:
			return "October " + getDay() + ", " + getYear();
		case 11:
			return "November " + getDay() + ", " + getYear();
		case 12:
			return "December " + getDay() + ", " + getYear();
		}
		
		return null;
	}
}
