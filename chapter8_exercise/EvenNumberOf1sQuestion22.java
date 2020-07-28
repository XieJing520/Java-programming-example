package chapter8_exercise;

public class EvenNumberOf1sQuestion22 {
	public static void main(String[] args) {
		int[][] matrix;

		matrix = generate1sAnd0sMatrix();
		display(matrix);

		if (isHasEvenNumberOf1s(matrix))
			System.out.println("every row and every column have an even number of 1s.");
		else
			System.out.println("every row and every column don't have an even number of 1s.");

	}

	public static boolean isHasEvenNumberOf1s(int[][] m) {
		for (int row = 0; row < 6; row++) {
			int evenCount = 0;
			for (int col = 0; col < 6; col++)
				if (m[row][col] == 1)
					evenCount++;
			if (evenCount % 2 != 0)
				return false;
		}
		for (int col = 0; col < 6; col++) {
			int evenCount = 0;
			for (int row = 0; row < 6; row++)
				if (m[row][col] == 1)
					evenCount++;
			if (evenCount % 2 != 0)
				return false;
		}
		return true;
	}

	public static void display(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int e : m[row])
				System.out.printf("%d ", e);
			System.out.println();
		}

	}

	public static int[][] generate1sAnd0sMatrix() {
		int[][] matrix = new int[6][6];

		for (int row = 0; row < 6; row++)
			for (int col = 0; col < 6; col++)
				matrix[row][col] = (int) (Math.random() * 2);
		return matrix;
	}
}
