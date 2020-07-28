package chapter9_exercise;

import java.util.Scanner;

public class TheLocationClassQuestion13 {
	public static void main(String[] args) {
		int row, column;
		Location maxLocation;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");
		row = inputScanner.nextInt();
		column = inputScanner.nextInt();

		double[][] matrix = new double[row][column];

		System.out.println("Enter the array:");
		for (int currRow = 0; currRow < row; currRow++)
			for (int currCol = 0; currCol < column; currCol++)
				matrix[currRow][currCol] = inputScanner.nextDouble();

		maxLocation = locateLargest(matrix);

		System.out.printf("The location of the largest element is %f at (%d, %d)", maxLocation.maxValue,
				maxLocation.row, maxLocation.column);

		inputScanner.close();
	}

	public static Location locateLargest(double[][] a) {
		Location maxLocation = new Location();
		maxLocation.row = 0;
		maxLocation.column = 0;
		maxLocation.maxValue = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] > maxLocation.maxValue) {
					maxLocation.maxValue = a[row][col];
					maxLocation.row = row;
					maxLocation.column = col;
				}
			}
		}

		return maxLocation;
	}

}

class Location {

	public int row;
	public int column;
	public double maxValue;

}
