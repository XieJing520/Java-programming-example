package chapter7_exercise;

import java.util.Scanner;

public class SolveQuadraticEquationsQuestion25 {
	public static void main(String[] args) {
		double[] eqn, roots;
		int numberOfRealRoots;
		eqn = new double[3];
		roots = new double[2];

		System.out.print("Enter a, b, c:");
		Scanner inputScanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
			eqn[i] = inputScanner.nextDouble();
		numberOfRealRoots = solveQuadratic(eqn, roots);

		if (numberOfRealRoots == 2)
			System.out.println("The equation has two roots " + roots[0] + " and " + roots[1]);
		else if (numberOfRealRoots == 1)
			System.out.println("The equation has one root " + roots[0]);
		else
			System.out.println("The equation has no real roots");

		inputScanner.close();
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		int numberOfRealRoots;
		double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

		if (discriminant > 0) {
			roots[0] = (-1 * eqn[1] + Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
			roots[1] = (-1 * eqn[1] - Math.pow(discriminant, 0.5)) / (2 * eqn[0]);
			numberOfRealRoots = 2;
		} else if (Math.abs(discriminant - 0) < 1E-16) {
			roots[0] = (-1 * eqn[1]) / (2 * eqn[0]);
			numberOfRealRoots = 1;
		} else {
			numberOfRealRoots = 0;
		}
		return numberOfRealRoots;
	}
}
