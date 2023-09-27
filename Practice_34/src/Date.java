
public class Date {
	private Integer year;
	private Integer month;
	private Integer day;
	
	public Date() {
		this(1990, 1, 1);
	}
	
	public Date(Integer year) {
		this.year = year;
	}
	
	public Date(Integer year, Integer month) {
		this.year = year;
		this.month = month;
	}
	
	public Date(Integer year, Integer month, Integer day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일";
	}
	
}
