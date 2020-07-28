package chapter6_exercise;

import java.util.*;


public class TrianglesQuestion19 {
	public static void main(String[] args) {
		double side1, side2, side3;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter side1: ");
		side1 = inputScanner.nextDouble();
		
		System.out.print("Enter side2: ");
		side2 = inputScanner.nextDouble();
		
		System.out.print("Enter side3: ");
		side3 = inputScanner.nextDouble();
		
		if(isValid(side1, side2, side3))
			System.out.printf("The area of the triangle is %f\n",area(side1, side2, side3));
		else
			System.out.println("The input is invalid");
		
		inputScanner.close();
	}
	public static boolean isValid(double side1, double side2, double side3)
	{
		if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1)
			return true;
		else
			return false;
	}
	public static double area(double side1, double side2, double side3)
	{
		double HalfSumLengthSide = (side1 + side2 + side3) / 2;
		double AreaTriangle = Math.pow(HalfSumLengthSide
								*(HalfSumLengthSide - side1)
								*(HalfSumLengthSide - side2)
								*(HalfSumLengthSide - side3), 0.5);
		return AreaTriangle;
	}
}
