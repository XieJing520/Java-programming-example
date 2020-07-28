package chapter8_exercise;

import java.util.*;

public class SumTheMajorDiagonalInAMatrixQuestion2 {
	public static void main(String[] args) {
		double[][] matrix = new double[4][4];

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 4-by-4 matrix row by row:");

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				matrix[i][j] = inputScanner.nextDouble();

		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

		inputScanner.close();
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			sum += m[i][i];
		return sum;
	}
}
