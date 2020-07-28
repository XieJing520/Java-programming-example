package chapter8_exercise;

import java.util.Scanner;

public class AlgebraSolveLinearEquationsQuestion30 {
	public static void main(String[] args) {
		double[][] a = new double[2][2];
		double[] b = new double[2];
		double[] solution = null;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a:");
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col < 2; col++) {
				a[row][col] = input.nextDouble();
			}
		}

		System.out.print("Enter b:");
		for (int i = 0; i < 2; i++) {
			b[i] = input.nextDouble();
		}

		solution = linerEquation(a, b);

		if (solution != null)
			System.out.printf("x is %.1f and y is %.1f\n", solution[0], solution[1]);
		else
			System.out.println("The equation has no solution");

		input.close();
	}

	public static double[] linerEquation(double[][] a, double[] b) {
		double discriminant = a[0][0] * a[1][1] - a[0][1] * a[1][0];

		if (Math.abs(discriminant - 0) < 1E-10) {
			return null;
		}

		double[] solution = new double[2];
		solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / discriminant;
		solution[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / discriminant;

		return solution;
	}
}
