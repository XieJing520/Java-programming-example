package chapter8_exercise;

import java.util.*;

public class LocateTheLargestElementQuestion13 {
	public static void main(String[] args) {
		int matrixRow, matrixColumn;
		int[] locationLargest;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array:");
		matrixRow = inputScanner.nextInt();
		matrixColumn = inputScanner.nextInt();

		System.out.println("Enter the array:");
		double[][] matrix = new double[matrixRow][matrixColumn];
		for (int i = 0; i < matrixRow; i++)
			for (int j = 0; j < matrixColumn; j++)
				matrix[i][j] = inputScanner.nextDouble();

		locationLargest = locateLargest(matrix);
		System.out.printf("The location of the largest element is at (%d, %d)",
				locationLargest[0], locationLargest[1]);

		inputScanner.close();
	}

	public static int[] locateLargest(double[][] a) {
		int[] locationLargest = new int[2];
		locationLargest[0] = 0;
		locationLargest[1] = 0;
		double largest = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] > largest) {
					largest = a[row][col];
					locationLargest[0] = row;
					locationLargest[1] = col;
				}
			}
		}
		return locationLargest;
	}
}
