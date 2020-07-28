package chapter3_exercise;

import java.util.*;


public class PointPositionQuestion32 {
	public static void main(String[] args) {
		double xP0,yP0,xP1,yP1,xP2,yP2;
		int discriminant;
		
		// Prompt the user to enter the three points
		System.out.print("Enter three points for p0, p1, and p2: ");
		Scanner input = new Scanner(System.in);
		xP0 = input.nextDouble();
		yP0 = input.nextDouble();
		xP1 = input.nextDouble();
		yP1 = input.nextDouble();
		xP2 = input.nextDouble();
		yP2 = input.nextDouble();
		
		discriminant = (int)((xP1 - xP0) * (yP2 - yP0) - (xP2 - xP0) * (yP1 - yP0));
		
		if(discriminant > 0)
			System.out.println("p2 is on the left side of the line");
		else if(0 == discriminant)
			System.out.println("p2 is on the same line");
		else
			System.out.println("p2 is on the right side of the line");
		
		input.close();
	}
}
