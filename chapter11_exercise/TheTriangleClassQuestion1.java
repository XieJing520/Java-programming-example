package chapter11_exercise;

import java.util.Scanner;
import java.util.Date;

public class TheTriangleClassQuestion1 {
	public static void main(String[] args) {
		double side1, side2, side3;
		String color;
		Boolean isFilled = new Boolean(false);

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter side1,side2,side3:");
		side1 = inputScanner.nextDouble();
		side2 = inputScanner.nextDouble();
		side3 = inputScanner.nextDouble();

		System.out.print("Enter the color:");
		color = inputScanner.next();

		System.out.print("Do you want to fill the color with color? ");
		isFilled = inputScanner.nextBoolean();

		Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);

		System.out.printf("Area:%.2f\n", triangle.getArea());
		System.out.printf("Perimeter:%.2f\n", triangle.getPerimeter());
		System.out.printf("Color:%s\n", triangle.getColor());
		System.out.printf("Filled:%b\n", triangle.isFilled());

		inputScanner.close();
	}
}

class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3, String color, Boolean isFilled) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	public double getArea() {
		double halfSideSum = this.getPerimeter();
		double area = Math.sqrt(
				halfSideSum * (halfSideSum - this.side1) * (halfSideSum - this.side2) * (halfSideSum - this.side2));
		return area;
	}

	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + side3;
	}

}

class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}