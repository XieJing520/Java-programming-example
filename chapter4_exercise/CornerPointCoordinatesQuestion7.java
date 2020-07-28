package chapter4_exercise;

import java.util.*;


public class CornerPointCoordinatesQuestion7 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, radius;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle: ");
		radius = inputScanner.nextDouble();
		
		x1 = radius * Math.cos(Math.PI / 2 - (2 * Math.PI / 5));
		y1 = radius * Math.sin(Math.PI / 2 - (2 * Math.PI / 5));
		
		x2 = radius * Math.cos(Math.PI / 2);
		y2 = radius * Math.sin(Math.PI / 2);
		
		x3 = radius * Math.cos(Math.PI / 2 + (2 * Math.PI / 5));
		y3 = radius * Math.sin(Math.PI / 2 + (2 * Math.PI / 5));
		
		x4 = radius * Math.cos(Math.PI / 2 + 2 * (2 * Math.PI / 5));
		y4 = radius * Math.sin(Math.PI / 2 + 2 * (2 * Math.PI / 5));
		
		x5 = radius * Math.cos(Math.PI / 2 - 2 * (2 * Math.PI / 5));
		y5 = radius * Math.sin(Math.PI / 2 - 2 * (2 * Math.PI / 5));
		
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.printf("(%.2f, %.2f)\n", x1, y1);
		System.out.printf("(%.2f, %.2f)\n", x2, y2);
		System.out.printf("(%.2f, %.2f)\n", x3, y3);
		System.out.printf("(%.2f, %.2f)\n", x4, y4);
		System.out.printf("(%.2f, %.2f)\n", x5, y5);
		
		inputScanner.close();
	}
}
