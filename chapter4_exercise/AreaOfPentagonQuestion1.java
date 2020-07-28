package chapter4_exercise;

import java.util.*;


public class  AreaOfPentagonQuestion1 {
	public static void main(String[] args) {
		double side, radius, area;
		
		System.out.print("Enter the length from center to a vertex: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		
		side = 2 * radius * Math.sin(Math.PI / 5);
		area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %.2f", area);
		
		input.close();
	}
}
