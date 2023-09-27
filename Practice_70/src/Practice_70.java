import java.util.ArrayList;
import java.util.Random;

public class Practice_70 {
	
	public static Double findMax(ArrayList<Double> scores) {
		double max = -1;
		for(int i = 0; i < scores.size(); i++) {
			if(scores.get(i) > max)
				max = scores.get(i);
		}
		scores.remove(max);
		return max;
	}

	public static Double findMin(ArrayList<Double> scores) {
		double min = 11;
		for(int i = 0; i < scores.size(); i++) {
			if(scores.get(i) < min)
				min = scores.get(i);
		}
		scores.remove(min);
		return min;
	}

	public static Double getAve(ArrayList<Double> scores) {
		double sum = 0;
		for(int i = 0; i < scores.size(); i++) 
			sum += scores.get(i);
		return sum / scores.size();
	}
	
	public static void main(String[] args) {
		ArrayList<Double> score = new ArrayList<>();
		Random rg = new Random();

		for(int i = 0; i < 10; i++) 
			score.add(rg.nextDouble() * 10);
		
		System.out.println("심사위원 채점 결과");
		for(int i = 0; i < score.size(); i++) {
			System.out.print(score.get(i) + "\t");
			if(i % 2 == 1)
				System.out.println();
		}
		
		System.out.println("평균값: " + getAve(score));
		System.out.println("가장 높은 점수: " + findMax(score));
		System.out.println("가장 낮은 점수: " + findMin(score));
		
		System.out.println("최고점과 최저점을 제외한 결과");
		for(int i = 0; i < score.size(); i++) {
			System.out.print(score.get(i) + "\t");
			if(i % 2 == 1)
				System.out.println();
		}
		
		System.out.println("최종 점수: " + getAve(score));
		
	}

}
