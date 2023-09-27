import java.util.HashSet;
import java.util.Random;

public class Practice_71 {
	
	public static void main(String[] args) {
		Random rg = new Random();

		for(int i = 1 ; i <= 10; i++) {
			HashSet<Integer> set = new HashSet<>();
			while (set.size() < 5) {
                int randomNumber = rg.nextInt(90) + 10; // 10 <= 난수 <= 99
                set.add(randomNumber);
            }
			System.out.println("(" + i + "회) " + set);	
		}
		
	}

}
