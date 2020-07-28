package chapter8_exercise;

import java.util.*;

public class AddTwoMatricesQuestion5 {
	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] sum;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter matrix1: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix1[row][col] = inputScanner.nextDouble();

		System.out.print("Enter matrix2: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix2[row][col] = inputScanner.nextDouble();

		sum = addMatrix(matrix1, matrix2);
		System.out.println("The matrices are added as follows");
		displaySumOfMatrices(matrix1, matrix2, sum);

		inputScanner.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] sum = new double[3][3];

		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				sum[row][col] = a[row][col] + b[row][col];

		return sum;
	}

	public static void displaySumOfMatrices(double[][] a, double[][] b, double[][] c) {
		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {
				System.out.printf("%.1f ", a[row][col]);
			}

			if (row == 1)
				System.out.print(" +  ");
			else
				System.out.print("\t");

			for (int col = 0; col < 3; col++) {
				System.out.printf("%.1f ", b[row][col]);
			}

			if (row == 1)
				System.out.print(" =  ");
			else
				System.out.print("\t");

			for (int col = 0; col < 3; col++) {
				System.out.printf("%.1f ", c[row][col]);
			}
			System.out.println();
		}
	}
}
