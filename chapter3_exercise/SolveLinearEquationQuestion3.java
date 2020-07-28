package chapter3_exercise;

import java.util.*;


public class SolveLinearEquationQuestion3 {
	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y, discriminant;
		
		System.out.print("Enter a, b, c, d, e, f:");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		
		discriminant = a * d - b * c;
		
		if(discriminant != 0)
		{
			x = (e * d - b * f) / discriminant;
			y = (a * f - e * c) / discriminant;
			System.out.println("x is " + x +" and y is " + y);
		}
		else
		{
			System.out.println("The equation has no solution");
		}
		
		input.close();
	}
}
