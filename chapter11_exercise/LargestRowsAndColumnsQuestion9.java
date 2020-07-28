package chapter11_exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class LargestRowsAndColumnsQuestion9 {
	public static void main(String[] args) {
		int arraySize;
		ArrayList<Integer> mostOnesRow = new ArrayList<Integer>();
		ArrayList<Integer> mostOnesColumn = new ArrayList<Integer>();

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the array size n: ");
		arraySize = inputScanner.nextInt();
		int[][] randomMatrix = new int[arraySize][arraySize];

		System.out.println("The random array is");
		generate1sAnd0s(randomMatrix);
		displayMatrix(randomMatrix);

		findMostOnesInRow(mostOnesRow, randomMatrix, numberOfOnesInRow(randomMatrix));
		System.out.print("The largest row index: ");
		displayList(mostOnesRow);

		findMostOnesInColumn(mostOnesColumn, randomMatrix, numberOfOnesInColumn(randomMatrix));
		System.out.print("The largest column index: ");
		displayList(mostOnesColumn);

		inputScanner.close();
	}

	public static int numberOfOnesInRow(int[][] matrix) {
		int numberOfOnes = 0;
		for (int row = 0; row < matrix.length; row++) {
			int onesCount = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 1)
					onesCount++;
			}
			if (onesCount > numberOfOnes)
				numberOfOnes = onesCount;
		}
		return numberOfOnes;
	}

	public static int numberOfOnesInColumn(int[][] matrix) {
		int numberOfOnes = 0;
		for (int col = 0; col < matrix.length; col++) {
			int onesCount = 0;
			for (int row = 0; row < matrix[col].length; row++) {
				if (matrix[row][col] == 1)
					onesCount++;
			}
			if (onesCount > numberOfOnes)
				numberOfOnes = onesCount;
		}
		return numberOfOnes;
	}

	public static void findMostOnesInRow(ArrayList<Integer> list, int[][] matrix, int numberOfOnes) {
		for (int row = 0; row < matrix.length; row++) {
			int onesCount = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 1)
					onesCount++;
			}
			if (onesCount == numberOfOnes)
				list.add(row);
		}
	}

	public static void findMostOnesInColumn(ArrayList<Integer> list, int[][] matrix, int numberOfOnes) {
		for (int col = 0; col < matrix.length; col++) {
			int onesCount = 0;
			for (int row = 0; row < matrix[col].length; row++) {
				if (matrix[row][col] == 1)
					onesCount++;
			}
			if (onesCount == numberOfOnes)
				list.add(col);
		}
	}

	public static void displayList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s", i == 0 ? "" + list.get(i) : ", " + list.get(i));
		}
		System.out.println();
	}

	public static void generate1sAnd0s(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix[row].length; col++)
				matrix[row][col] = (int) (Math.random() * 2);
	}

	public static void displayMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++)
				System.out.printf("%d ", matrix[row][col]);
			System.out.println();
		}

	}
}
