package chapter2_exercise;

import java.util.*;


public class AreaTriangleQuestion19 {
	public static void main(String[] args) {
		double x1, y1;
		double x2, y2;
		double x3, y3;
		//distance between two points
		double LengthSide1, LengthSide2, LengthSide3;
		//HalfSumLengthSide represent that half of summation of all of sides
		double HalfSumLengthSide, AreaTriangle;

		System.out.print("Enter the coordinates of three points separated"
						+ " by spaces\nlike x1 y1 x2 y2 x3 y3 : ");
		Scanner PointsInput = new Scanner(System.in);
		x1 = PointsInput.nextDouble(); y1 = PointsInput.nextDouble();
		x2 = PointsInput.nextDouble(); y2 = PointsInput.nextDouble();
		x3 = PointsInput.nextDouble(); y3 = PointsInput.nextDouble();
		
		LengthSide1 = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		LengthSide2 = Math.pow(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2), 0.5);
		LengthSide3 = Math.pow(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);
		
		HalfSumLengthSide = (LengthSide1 + LengthSide2 + LengthSide3) / 2;
		AreaTriangle = Math.pow(HalfSumLengthSide
								*(HalfSumLengthSide - LengthSide1)
								*(HalfSumLengthSide - LengthSide2)
								*(HalfSumLengthSide - LengthSide3), 0.5);
		System.out.println("The area of the triangle is " + AreaTriangle);
		
		PointsInput.close();
	}
}
