package chapter6_exercise;

import java.util.*;


public class PointPositionQuestion39 {
	public static void main(String[] args) {
		double x0, y0, x1, y1, x2, y2;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		x0 = inputScanner.nextDouble();
		y0 = inputScanner.nextDouble();
		x1 = inputScanner.nextDouble();
		y1 = inputScanner.nextDouble();
		x2 = inputScanner.nextDouble();
		y2 = inputScanner.nextDouble();
		
		if(onTheSameLine(x0, y0, x1, y1, x2, y2))
		{
			if(onTheLineSegment(x0, y0, x1, y1, x2, y2))
			{
				System.out.printf("(%f, %f) is on the line segment from "
						+ "(%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
			}
			else
			{
				System.out.printf("(%f, %f) is on the same line from "
						+ "(%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
			}
		}
		else
		{
			if(leftOfTheLine(x0, y0, x1, y1, x2, y2))
			{
				System.out.printf("(%f, %f) is on the left side of the line from "
						+ "(%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
			}
			else
			{
				System.out.printf("(%f, %f) is on the right side of the line from "
						+ "(%f, %f) to (%f, %f)", x2, y2, x0, y0, x1, y1);
			}
		}
		
		inputScanner.close();
	}
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1,
			double x2, double y2)
	{
		double discriminant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if(discriminant > 0)
			return true;
		else
			return false;
	}
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1,
			double x2, double y2)
	{
		double discriminant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if(discriminant == 0)
			return true;
		else
			return false;
		
	}
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1,
			double x2, double y2)
	{
		double discriminant = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if(0 == discriminant && x2 <= (x0 > x1?x0:x1) && x2 >= (x0 > x1?x1:x0))
			return true;
		else
			return false;
	}
}
