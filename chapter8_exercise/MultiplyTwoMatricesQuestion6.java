package chapter8_exercise;

import java.util.Scanner;

public class MultiplyTwoMatricesQuestion6 {
	public static void main(String[] args) {
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] product;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter matrix1: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix1[row][col] = inputScanner.nextDouble();

		System.out.print("Enter matrix2: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				matrix2[row][col] = inputScanner.nextDouble();

		product = multiplyMatrix(matrix1, matrix2);
		System.out.println("The multiplication of the matrices is");
		displayProductOfMatrices(matrix1, matrix2, product);

		inputScanner.close();
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] product = new double[3][3];

		for (int row = 0; row < 3; row++) {
			double temp = 0;
			for (int col = 0; col < 3; col++) {
				temp = a[row][0] * b[0][col] + a[row][1] * b[1][col] + a[row][2] * b[2][col];
				product[row][col] = temp;
			}
		}

		return product;
	}

	public static void displayProductOfMatrices(double[][] a, double[][] b, double[][] c) {
		for (int row = 0; row < 3; row++) {

			for (int col = 0; col < 3; col++) {
				System.out.printf("%.1f ", a[row][col]);
			}

			if (row == 1)
				System.out.print(" *  ");
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
