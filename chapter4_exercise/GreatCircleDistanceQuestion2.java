package chapter4_exercise;

import java.util.*;


public class GreatCircleDistanceQuestion2 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, greatDistance;
		double x1Radian, y1Radian, x2Radian, y2Radian;
		final double EARTH_AVERAGE_RADIUS = 6371.01;
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		Scanner input = new Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		x1Radian = Math.toRadians(x1);
		y1Radian = Math.toRadians(y1);
		x2Radian = Math.toRadians(x2);
		y2Radian = Math.toRadians(y2);
		
		greatDistance = EARTH_AVERAGE_RADIUS * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian)
						+ Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian - y2Radian));
		System.out.println("The distance between the two points is " + greatDistance + "km");;

		input.close();
	}
}
//test data(latitude and longitude):39.55 -116.25 41.5 87.37

