package chapter9_exercise;

import java.util.Scanner;

public class IntersectingPointQuestion12 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3, x4, y4;
		double a, b, c, d, e, f;

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		x1 = inputScanner.nextDouble();
		y1 = inputScanner.nextDouble();
		x2 = inputScanner.nextDouble();
		y2 = inputScanner.nextDouble();
		x3 = inputScanner.nextDouble();
		y3 = inputScanner.nextDouble();
		x4 = inputScanner.nextDouble();
		y4 = inputScanner.nextDouble();

		a = y1 - y2;
		b = x2 - x1;
		c = y3 - y4;
		d = x4 - x3;
		e = a * x1 + b * y1;
		f = c * x3 + d * y3;

		LinearEquations1 equations = new LinearEquations1(a, b, c, d, e, f);

		if (equations.isSolvable())
			System.out.printf("X:%f,Y:%f\n", equations.getX(), equations.getY());
		else
			System.out.println("The equation has no solution.");

		inputScanner.close();
	}
}

class LinearEquations1 {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquations1(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return this.d;
	}

	public double getE() {
		return this.e;
	}

	public double getF() {
		return this.f;
	}

	public boolean isSolvable() {
		return (this.a * this.d - this.b * this.c != 0);
	}

	public double getX() {
		return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
	}

	public double getY() {
		return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
	}

}
