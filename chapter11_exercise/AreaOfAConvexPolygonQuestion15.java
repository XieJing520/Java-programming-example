package chapter11_exercise;

import java.util.*;

public class AreaOfAConvexPolygonQuestion15 {
	public static void main(String[] args) {
		int numberOfPoints;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of points:");
		numberOfPoints = input.nextInt();

		double[][] coordiantesPoints = new double[numberOfPoints + 1][2];

		System.out.println("Enter the coordinates of the points:");
		for (int i = 0; i < numberOfPoints; i++) {
			for (int j = 0; j < 2; j++) {
				coordiantesPoints[i][j] = input.nextDouble();
			}
		}
		coordiantesPoints[numberOfPoints][0] = coordiantesPoints[0][0];
		coordiantesPoints[numberOfPoints][1] = coordiantesPoints[0][1];

		double part1, part2, area;
		part1 = part2 = area = 0;

		for (int i = 0; i < numberOfPoints; i++) {
			part1 += coordiantesPoints[i][0] * coordiantesPoints[i + 1][1];
		}

		for (int i = 0; i < numberOfPoints; i++) {
			part2 += coordiantesPoints[i][1] * coordiantesPoints[i + 1][0];
		}

		area = 0.5 * (part1 - part2);

		System.out.println(area);

		input.close();
	}
}
