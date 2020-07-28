package chapter8_exercise;

import java.util.*;

public class ColumnSortingQuestion27 {
	public static void main(String[] args) {
		double[][] matrix = new double[3][3], matrixColumnsSorted;

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix[row][col] = inputScanner.nextDouble();

		matrixColumnsSorted = sortColumns(matrix);

		System.out.println("\nThe column-sorted array is ");
		displayMatrix(matrixColumnsSorted);

		inputScanner.close();
	}

	public static double[][] transposedMatrix(double[][] m) {
		double[][] transposedMatrix = new double[3][3];
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				transposedMatrix[col][row] = m[row][col];
		return transposedMatrix;
	}

	public static double[][] sortColumns(double[][] m) {
		double[][] copiedMatrix = copyMatrix(m);

		copiedMatrix = transposedMatrix(copiedMatrix);
		for (int row = 0; row < 3; row++)
			Arrays.parallelSort(copiedMatrix[row]);

		copiedMatrix = transposedMatrix(copiedMatrix);

		return copiedMatrix;
	}

	public static double[][] copyMatrix(double[][] m) {
		double[][] copiedMatrix = new double[3][3];
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				copiedMatrix[row][col] = m[row][col];

		return copiedMatrix;
	}

	public static void displayMatrix(double[][] m) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++)
				System.out.print(m[row][col] + " ");
			System.out.println();
		}
	}
}
