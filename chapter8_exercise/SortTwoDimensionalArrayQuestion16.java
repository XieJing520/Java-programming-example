package chapter8_exercise;

import java.util.*;

public class SortTwoDimensionalArrayQuestion16 {
	public static void main(String[] args) {
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		displayMatrix(matrix);
		System.out.println("-------------");
		sort(matrix);
		displayMatrix(matrix);
	}

	public static void sort(int m[][]) {
		for (int row = 0; row < m.length; row++)
			Arrays.parallelSort(m[row]);

		int[][] transposedMatrix = transposedMatrix(m);

		for (int row = 0; row < transposedMatrix.length; row++)
			Arrays.parallelSort(transposedMatrix[row]);

		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[0].length; col++)
				m[row][col] = transposedMatrix[col][row];

	}

	public static int[][] transposedMatrix(int[][] m) {
		int[][] transposedMatrix = new int[m[0].length][m.length];

		for (int row = 0; row < m.length; row++)
			for (int col = 0; col < m[0].length; col++)
				transposedMatrix[col][row] = m[row][col];

		return transposedMatrix;
	}

	public static void displayMatrix(int m[][]) {
		for (int row = 0; row < m.length; row++) {
			for (int e : m[row])
				System.out.print(e + " ");
			System.out.println();
		}
	}
}
