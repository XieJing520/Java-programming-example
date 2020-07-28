package chapter8_exercise;

import java.util.*;

public class RowSortingQuestion26 {
	public static void main(String[] args) {
		double[][] matrix = new double[3][3], matrixRowsSorted;

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix[row][col] = inputScanner.nextDouble();

		matrixRowsSorted = sortRows(matrix);

		System.out.println("\nThe row-sorted array is ");
		displayMatrix(matrixRowsSorted);

		inputScanner.close();
	}

	public static void displayMatrix(double[][] m) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++)
				System.out.print(m[row][col] + " ");
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] m) {
		double[][] copiedMatrix = copyMatrix(m);

		for (int row = 0; row < 3; row++)
			Arrays.parallelSort(copiedMatrix[row]);

		return copiedMatrix;
	}

	public static double[][] copyMatrix(double[][] m) {
		double[][] copiedMatrix = new double[3][3];
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				copiedMatrix[row][col] = m[row][col];

		return copiedMatrix;
	}
}
