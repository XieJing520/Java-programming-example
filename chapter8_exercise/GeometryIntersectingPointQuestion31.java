package chapter8_exercise;

import java.util.Scanner;

public class GeometryIntersectingPointQuestion31 {
	public static void main(String[] args) {
		double[] intersectingPoint = null;
		double[][] points = new double[4][2];

		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 2; col++) {
				points[row][col] = input.nextDouble();
			}
		}

		intersectingPoint = getIntersectingPoint(points);

		if (intersectingPoint != null)
			System.out.printf("The intersecting point is at (%.5f, %.5f)", intersectingPoint[0], intersectingPoint[1]);
		else
			System.out.println("The two lines are parallel");

		input.close();

	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] intersectingPoint = new double[2];
		double a, b, c, d, e, f, discriminant;

		a = points[0][1] - points[1][1];
		b = points[1][0] - points[0][0];
		c = points[2][1] - points[3][1];
		d = points[3][0] - points[2][0];
		e = a * points[0][0] + b * points[0][1];
		f = c * points[2][0] + d * points[2][1];

		discriminant = a * d - b * c;

		if (discriminant != 0) {
			intersectingPoint[0] = (e * d - b * f) / discriminant;
			intersectingPoint[1] = (a * f - e * c) / discriminant;
			return intersectingPoint;
		} else
			return null;

	}
}
