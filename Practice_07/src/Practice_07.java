public class Practice_07 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		while (i < 10) {
			while (j < i) {
				System.out.print(j);
				j++;
			}

			System.out.println(i);
			i++;
			j = 0;
		}

	}

}
