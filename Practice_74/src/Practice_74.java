import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_74 {
	
	private static Config getInput() throws ImproperKeyValueException {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int s = sc.nextInt();
		System.out.print("난수값의 범위를 설정하세요: ");
		int r = sc.nextInt();
		System.out.print("찾고 싶은 난수값을 입력하세요: ");
		int f = sc.nextInt();
		
		if(f > r)
			throw (new ImproperKeyValueException());
		
		Config c = new Config(s, r, f);
		return c;
	}
	
	private static void printArray(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + "\t");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
	}
	
	private static ArrayList<Integer> getRandomNumbers(Config c) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		for(int i = 0; i <= c.getRange(); i++) 
			a.add(i);
		Collections.shuffle(a);
		for(int i = 0; i < c.getSize(); i++) 
			b.add(a.get(i));
		
		return b;
	}
	
	private static boolean searchArray(ArrayList<Integer> a, Integer key) {
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) == key)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int count = 1;
		Config c = new Config(-1, -1, -1);
		
		try {
			c = getInput();	
		}
		catch(ImproperKeyValueException e) {
			System.out.println("난수값의 범위가 잘못되었습니다.");
			return;
		}
		
		while(true) {
			System.out.print("(" + count + "차) ");
			ArrayList<Integer> list = getRandomNumbers(c);
			printArray(list);
			count++;
			
			if(searchArray(list, c.getKey()) == true) {
				System.out.println(count + "차 실행에서 난수 " + c.getKey() + "이 발생했으므로 프로그램을 종료합니다.");
				break;
			}
			else
				continue;
		}
		
	}

}
