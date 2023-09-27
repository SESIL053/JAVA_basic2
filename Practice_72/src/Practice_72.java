import java.util.HashSet;
import java.util.Iterator;

public class Practice_72 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");

		// (1)번 출력: HashSet 클래스의 toString() 메소드 이용
		System.out.println(set.toString());
		
		// (2)번 출력: for-each문 사용
		System.out.print("[");
		for(String x: set)
			System.out.print(x + ", ");
		System.out.println("]");
		
		// (3)번 출력: Iterator 사용
		Iterator e = set.iterator();
		System.out.print("[");
		while(e.hasNext()) // 아직 방문하지 않은 원소가 있으면 true 반환
			System.out.print((String)e.next() + ", ");
		System.out.println("]");
		
		// (4)번 출력: for-each문 사용. 마지막 콤마를 어떻게 없앨 것인지 생각해 보세요.
		int count = 0;
		System.out.print("[");
		for(String x: set) {
			if(set.size() - 1 == count) {			
				System.out.println(x + "]");
				break;
			}
			System.out.print(x + ", ");
			count++;
		}
		
	}

}
