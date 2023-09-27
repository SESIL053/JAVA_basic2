
public class NumPair<T extends Number> {
	private T first;
	private T second;
	
	public NumPair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	public NumPair<T> flip(){
		T temp = first;
		first = second;
		second = temp;
		NumPair<T> n = new NumPair<T>(first, second);
		return n;
	}
	
	public double calcAverage() {
		double d1 = first.doubleValue();
		double d2 = second.doubleValue();
		return (d1 + d2) / 2;
	}
	
}
