package chapter4_exercise;

import java.util.*;


public class AreaOfHexagonQuestion4 {
	public static void main(String[] args) {
		double side,area;
		
		System.out.print("Enter the side: ");
		Scanner input = new Scanner(System.in);
		side = input.nextDouble();
		area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		
		System.out.printf("The area of the hexagon is %.2f", area);
		input.close();
	}
}
