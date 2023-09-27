import java.util.ArrayList;

public class RandomList<T> {
	private ArrayList<T> list;

	public RandomList(ArrayList<T> list) { // ArrayList 객체 생성
		this.list = new ArrayList<>();
	}

	public void add(T item) {
		list.add(item);
	}
	
	public T selectLast() {
		return list.get(list.size() - 1);
	}
	
	public void print() {
		System.out.println("리스트의 내용을 출력합니다.");
		for(int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i) + "\t");
		System.out.println();
	}
	
}
