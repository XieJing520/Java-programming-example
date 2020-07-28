package chapter3_exercise;

import java.util.*;


public class  PointInRectangleQuestion23 {
	public static void main(String[] args) {
		double pointX,pointY;
		
		System.out.print("Enter a point with two coordinates:");
		Scanner input = new Scanner(System.in);
		pointX = input.nextDouble();
		pointY = input.nextDouble();
		
		// Check if the point is in the rectangle
		if((pointX >= -5 && pointX <= 5) && (pointY >= -2.5 && pointY <= 2.5))
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is in the rectangle");
		else
			System.out.println("Point " + "(" + pointX + "," + pointY + ")"
								+ " is not in the rectangle");

		input.close();
	}
}
