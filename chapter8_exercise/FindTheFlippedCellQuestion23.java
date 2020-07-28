package chapter8_exercise;

import java.util.*;

public class FindTheFlippedCellQuestion23 {
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		boolean isExit = false;

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 6-by-6 matrix row by row:");
		for (int row = 0; row < 6; row++)
			for (int col = 0; col < 6; col++)
				matrix[row][col] = inputScanner.nextInt();

		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 6; col++) {
				if (!isFlippedCell(matrix, row, col)) {
					System.out.printf("The flipped cell is at (%d, %d)\n", row, col);
					isExit = true;
					break;
				}
			}
			if (isExit)
				break;
		}

		inputScanner.close();
	}

	public static boolean isFlippedCell(int[][] m, int currentRow, int currentCol) {
		int rowCount, colCount;
		rowCount = colCount = 0;
		for (int i = 0; i < 6; i++) {
			if (m[currentRow][i] == 1)
				rowCount++;
			if (m[i][currentCol] == 1)
				colCount++;
		}
		if (rowCount % 2 == 0 || colCount % 2 == 0)
			return true;
		else
			return false;
	}
}
