package chapter1_exercise;


public class SolveLinearEquation2Times2Question13 {
	public static void main(String[] args) {
		
		final double A,B,C,D,E,F;
		A = 3.4; B = 50.2; C = 2.1;
		D = 0.55; E = 44.5; F = 5.9;
		
		double x,y;
		x = (E * D - B * F) / (A * D - B * C);
		y = (A * F - E * C) / (A * D - B * C);
		
		
		System.out.println("X is " + x);
		System.out.println("Y is " + y);
		
		
		//System.out.println("\nFinished");
	}
}