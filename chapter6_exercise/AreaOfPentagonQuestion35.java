package chapter6_exercise;

import java.util.*;

public class AreaOfPentagonQuestion35 {
	public static void main(String[] args) {
		double area, side;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the side: ");
		side = inputScanner.nextDouble();
		area = area(side);
		System.out.printf("The area of the pentagon is %f", area);
		
		inputScanner.close();
	}
	public static double area(double side) {
		double area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 5));
		return area;
	}
}
