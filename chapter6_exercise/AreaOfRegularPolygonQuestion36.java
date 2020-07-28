package chapter6_exercise;

import java.util.*;

public class AreaOfRegularPolygonQuestion36 {
	public static void main(String[] args) {
		double area, side;
		int numberOfSide;

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		numberOfSide = inputScanner.nextInt();
		
		System.out.print("Enter the side: ");
		side = inputScanner.nextDouble();
		
		area = area(numberOfSide, side);
		System.out.printf("The area of the polygon is %f", area);
		
		inputScanner.close();
	}
	public static double area(int n, double side) {
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		return area;
	}
}
