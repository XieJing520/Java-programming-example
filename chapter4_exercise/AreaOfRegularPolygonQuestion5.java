package chapter4_exercise;

import java.util.*;


public class  AreaOfRegularPolygonQuestion5 {
	public static void main(String[] args) {
		int numberOfSide;
		double area, side;
		
		System.out.print("Enter the number of sides: ");
		Scanner input = new Scanner(System.in);
		numberOfSide = input.nextInt();
		System.out.print("Enter the side: ");
		side = input.nextDouble();
		area = (numberOfSide * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSide));
		
		System.out.println("The area of the hexagon is " + area);
		input.close();
	}
}
