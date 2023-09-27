
public class Practice_23 {

	public static void main(String[] args) {
		int[][] intArray = new int[3][4];
		int[] colSum = new int[4];
		int[] rowSum = new int[3];
		int total = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 3; i++) {
				intArray[i][j] = (int) (Math.pow(10, i) * (j + 1));
				colSum[j] += intArray[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				rowSum[i] += intArray[i][j];
			}
			total += rowSum[i];
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println(rowSum[i]);
		}

		for (int i = 0; i < 4; i++)
			System.out.print(colSum[i] + "\t");
		System.out.println(total);

	}

}
