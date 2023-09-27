
public class Movie {
	private String title;
	private String director;
	private Date viewDay;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Date getViewDay() {
		return viewDay;
	}
	
	public void setViewDay(Date viewDay) {
		this.viewDay = viewDay;
	}
	
	public Movie() {
		title = "모름";
		director = "모름";
		viewDay = new Date(1999, 9, 9);
	}
	
	public Movie(String title, String director, Date viewDay) {
		this.title = title;
		this.director = director;
		this.viewDay = viewDay;
	}
	
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
		viewDay = new Date(1999, 9, 9);
	}
	
	public String toString() {
		return "제목: " + title + "\n감독: " + director + "\n관람일: " + viewDay + "\n";
	}
	
	public String printOneLine() {
		return title + " / " + director + " / " + viewDay;
	}
	
}
