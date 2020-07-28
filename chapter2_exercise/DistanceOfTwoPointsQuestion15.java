package chapter2_exercise;

import java.util.Scanner;

public class DistanceOfTwoPointsQuestion15 {
	public static void main(String[] args) {
		
		double x1,y1,x2,y2,PointDistance;
		Scanner PointInput;
		
		System.out.print("Enter x1 and y1 : ");
		PointInput = new Scanner(System.in);
		x1 = PointInput.nextDouble();
		y1 = PointInput.nextDouble();

		System.out.print("Enter x2 and y2 : ");
		x2 = PointInput.nextDouble();
		y2 = PointInput.nextDouble();
		
		PointDistance = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		
		System.out.println("The distance between the two points is "
							+ PointDistance);
		PointInput.close();
	}
}
