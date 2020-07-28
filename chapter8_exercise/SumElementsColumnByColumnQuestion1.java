package chapter8_exercise;

import java.util.*;

public class SumElementsColumnByColumnQuestion1 {
	public static void main(String[] args) {
		double[][] matrix = new double[3][4];

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Enter a 3-by-4 matrix row by row:");

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 4; j++)
				matrix[i][j] = inputScanner.nextDouble();
		
		for (int i = 0; i < 4; i++)
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));

		inputScanner.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++)
			sum += m[i][columnIndex];
		return sum;
	}
}
