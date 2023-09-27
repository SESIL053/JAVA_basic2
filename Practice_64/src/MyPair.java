
public class MyPair<T> {
	private T first;
	private T second;
	
	public MyPair(T first, T second) {
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
		return "만들어진 순서쌍: (" + first + ", " + second + ")";
	}
	
}
