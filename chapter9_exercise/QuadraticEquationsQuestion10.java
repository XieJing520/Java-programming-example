package chapter9_exercise;

import java.util.Scanner;

public class QuadraticEquationsQuestion10 {
	public static void main(String[] args) {
		double a, b, c;
		QuadraticEquations equations;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a,b,c: ");
		a = inputScanner.nextDouble();
		b = inputScanner.nextDouble();
		c = inputScanner.nextDouble();

		equations = new QuadraticEquations(a, b, c);

		System.out.printf("The discriminant is %f\n", equations.getDiscriminant());
		if (equations.getDiscriminant() > 0) {
			System.out.printf("Root1:%f,Root2:%f\n", equations.getRoot1(), equations.getRoot2());
		} else if (equations.getDiscriminant() < 0) {
			System.out.println("The equation has no roots.");
		} else {
			System.out.printf("Root1:%f\n", equations.getRoot1());
		}

		inputScanner.close();
	}
}

class QuadraticEquations {
	private double a;
	private double b;
	private double c;

	public QuadraticEquations(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getDiscriminant() {
		return Math.pow(this.b, 2) - 4 * this.a * this.c;
	}

	public double getRoot1() {
		if (getDiscriminant() >= 0) {
			return (-1 * this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
		} else {
			return 0;
		}
	}

	public double getRoot2() {
		if (getDiscriminant() >= 0) {
			return (-1 * this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
		} else {
			return 0;
		}
	}

}