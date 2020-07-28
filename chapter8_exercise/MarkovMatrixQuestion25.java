package chapter8_exercise;

import java.util.Scanner;

public class MarkovMatrixQuestion25 {
	public static void main(String[] args) {
		double[][] matrix = new double[3][3];

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 3-by-3 matrix row by row:");

		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix[row][col] = inputScanner.nextDouble();

		if (isMarkovMatrix(matrix))
			System.out.println("It is a Markov matrix");
		else
			System.out.println("It is not a Markov matrix");

		inputScanner.close();
	}

	public static boolean isMarkovMatrix(double[][] m) {
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (m[row][col] <= 0)
					return false;

		for (int col = 0; col < 3; col++) {
			double colSum = 0;
			for (int row = 0; row < 3; row++) {
				colSum += m[row][col];
			}
			if (Math.abs(colSum - 1) > 1E-10)
				return false;
		}
		return true;
	}
}
