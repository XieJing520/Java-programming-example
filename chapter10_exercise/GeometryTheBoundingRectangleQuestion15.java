package chapter10_exercise;

import java.util.*;

public class GeometryTheBoundingRectangleQuestion15 {
	public static void main(String[] args) {
		double[][] points = new double[5][2];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r = getRectangle(points);
		System.out.printf("The bounding rectangle's center (%.2f,%.2f), width %.2f, height %.2f", r.getX(), r.getY(),
				r.getWidth(), r.getHeight());

		input.close();
	}

	public static MyRectangle2D getRectangle(double[][] points) {

		MyRectangle2D r = new MyRectangle2D();

		double minX, minY, maxX, maxY;

		minX = maxX = points[0][0];
		minY = maxY = points[0][1];

		for (int i = 0; i < 5; i++) {
			if (points[i][0] < minX) {
				minX = points[i][0];
			}

			if (points[i][1] < minY) {
				minY = points[i][1];
			}

			if (points[i][0] > maxX) {
				maxX = points[i][0];
			}

			if (points[i][1] > maxY) {
				maxY = points[i][1];
			}
		}

		r.setX((maxX + minX) / 2);
		r.setY((maxY + minY) / 2);

		r.setWidth(maxX - minX);
		r.setHeight(maxY - minY);

		return r;
	}
}
