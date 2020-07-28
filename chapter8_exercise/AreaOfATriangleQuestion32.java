package chapter8_exercise;

import java.util.Scanner;

public class AreaOfATriangleQuestion32 {
	public static void main(String[] args) {
		double[][] points = new double[3][2];
		double areaOfTriangle;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 2; col++)
				points[row][col] = inputScanner.nextDouble();

		areaOfTriangle = getTriangleArea(points);
		if (Math.abs(areaOfTriangle - 0) <= 1E-10)
			System.out.println("The three points are on the same line");
		else
			System.out.println("The area of the triangle is " + areaOfTriangle);

		inputScanner.close();
	}

	public static double getTriangleArea(double[][] points) {
		// distance between two points
		double LengthSide1, LengthSide2, LengthSide3;
		// HalfSumLengthSide represent that half of summation of all of sides
		double HalfSumLengthSide, AreaTriangle;

		LengthSide1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2),
				0.5);
		LengthSide2 = Math.pow(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2),
				0.5);
		LengthSide3 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2),
				0.5);

		if (isTriangle(LengthSide1, LengthSide2, LengthSide3))
			return 0;

		HalfSumLengthSide = (LengthSide1 + LengthSide2 + LengthSide3) / 2;
		AreaTriangle = Math.pow(HalfSumLengthSide * (HalfSumLengthSide - LengthSide1)
				* (HalfSumLengthSide - LengthSide2) * (HalfSumLengthSide - LengthSide3), 0.5);

		return AreaTriangle;
	}

	public static boolean isTriangle(double a, double b, double c) {
		if (a + b <= c)
			return false;
		if (a + c <= b)
			return false;
		if (c + b <= a)
			return false;
		return true;
	}
}
