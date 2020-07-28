package chapter9_exercise;

import java.util.Scanner;

public class TwoTimesTwoLinearEquationsQuestion11 {
	public static void main(String[] args) {
		double a, b, c, d, e, f;
		LinearEquations equations;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f:");
		a = inputScanner.nextDouble();
		b = inputScanner.nextDouble();
		c = inputScanner.nextDouble();
		d = inputScanner.nextDouble();
		e = inputScanner.nextDouble();
		f = inputScanner.nextDouble();

		equations = new LinearEquations(a, b, c, d, e, f);

		if (equations.isSolvable())
			System.out.printf("X:%f,Y:%f\n", equations.getX(), equations.getY());
		else
			System.out.println("The equation has no solution.");

		inputScanner.close();
	}
}

class LinearEquations {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquations(double a, double b, double c, double d, double e, double f) {
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