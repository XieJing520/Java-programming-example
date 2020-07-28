package chapter8_exercise;

import java.util.Scanner;

public class ExploreMatrixQuestion14 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size for matrix:");
		int length = input.nextInt();

		int[][] matrix = new int[length][length];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}

		displayMatrix(matrix);
		checkAllRows(matrix);
		checkAllColumns(matrix);
		checkMajorDiagonal(matrix);
		checkSubDiagonal(matrix);

		input.close();
	}

	public static void checkAllRows(int[][] matrix) {
		boolean hasSameNum = false;

		for (int i = 0; i < matrix.length; i++) {
			boolean sameNum = true;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] != matrix[i][0]) {
					sameNum = false;
					break;
				}
			}
			if (sameNum) {
				System.out.println("All " + matrix[i][0] + "s on row " + (i + 1));
				hasSameNum = true;
			}
		}

		if (!hasSameNum) {
			System.out.println("No same numbers on a row");
		}

	}

	public static void checkAllColumns(int[][] matrix) {
		boolean hasSameNum = false;

		for (int i = 0; i < matrix.length; i++) {
			boolean sameNum = true;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] != matrix[0][i]) {
					sameNum = false;
					break;
				}
			}
			if (sameNum) {
				System.out.println("All " + matrix[0][i] + "s on column " + (i + 1));
				hasSameNum = true;
			}
		}

		if (!hasSameNum) {
			System.out.println("No same numbers on a column");
		}

	}

	public static void checkMajorDiagonal(int[][] matrix) {
		boolean hasSameNum = true;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] != matrix[0][0]) {
				hasSameNum = false;
				break;
			}
		}
		if (hasSameNum) {
			System.out.println("All " + matrix[0][0] + "s on the major diagonal");
		} else {
			System.out.println("No same numbers on the major diagonal");
		}
	}

	public static void checkSubDiagonal(int[][] matrix) {
		boolean hasSameNum = true;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][matrix.length - 1 - i] != matrix[0][matrix.length - 1]) {
				hasSameNum = false;
				break;
			}
		}
		if (hasSameNum) {
			System.out.println("All " + matrix[0][matrix.length - 1] + "s on the sub-diagonal");
		} else {
			System.out.println("No same numbers on the sub-diagonal");
		}
	}

	public static void displayMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

}
