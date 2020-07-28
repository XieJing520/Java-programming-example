package chapter8_exercise;

public class ShuffleRowsQuestion18 {
	public static void main(String[] args) {
		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		display(m);
		shuffle(m);
		for (int i = 0; i < 10; i++)
			System.out.print("-");
		System.out.println();
		display(m);

	}

	public static void shuffle(int[][] m) {
		int[] tempRow;
		for (int i = 0; i < m.length; i++) {
			int randomRow;
			while ((randomRow = (int) (Math.random() * m.length)) == i);

			tempRow = m[randomRow];
			m[randomRow] = m[i];
			m[i] = tempRow;
		}
	}

	public static void display(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int e : m[row])
				System.out.printf("%d ", e);
			System.out.println();
		}

	}
}
