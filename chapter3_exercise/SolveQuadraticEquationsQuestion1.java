package chapter3_exercise;

import java.util.*;


public class SolveQuadraticEquationsQuestion1 {
	public static void main(String[] args) {
		double a, b, c, discriminant, r1, r2;
		System.out.print("Enter a, b, c:");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		discriminant = Math.pow(b, 2) - 4 * a * c;
		
		if(discriminant > 0) {
			r1 = (-1 * b + Math.pow(discriminant,0.5)) / (2 * a);
			r2 = (-1 * b - Math.pow(discriminant,0.5)) / (2 * a);
			System.out.println("The equation has two roots " + r1 
								+ " and " + r2);
		}
		else if(discriminant == 0) {
			r1 = (-1 * b) / (2 * a);
			System.out.println("The equation has one root " + r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
		
		input.close();
	}
}
