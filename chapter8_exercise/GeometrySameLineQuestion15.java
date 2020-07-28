package chapter8_exercise;

import java.util.Scanner;

public class GeometrySameLineQuestion15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];
		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		boolean isSameLine = true;
		double slopeK = (points[0][1] - points[1][1]) / (points[0][0] - points[1][0]);
		for (int i = 2; i < points.length; i++) {
			if (slopeK * (points[i][0] - points[0][0]) != (points[i][1] - points[0][1])) {

				isSameLine = false;
			}
		}

		if (isSameLine) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}

		input.close();
	}
}
