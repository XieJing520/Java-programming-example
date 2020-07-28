package chapter12_exercise;

import java.util.Date;

public class IllegalTriangleExceptionQuestion5 {
	public static void main(String[] args) {

		try {
			new Triangle1(1, 2, 3);
		} catch (IllegalTriangleException e) {
			System.out.println(e.toString());
		}

	}
}

class IllegalTriangleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4764433061926992446L;

	public IllegalTriangleException() {

	}

	public IllegalTriangleException(String message) {
		System.out.println(message);
	}

}

class Triangle1 extends GeometricObject1 {

	private double side1;
	private double side2;
	private double side3;

	public Triangle1() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle1(double a, double b, double c) throws IllegalTriangleException {
		if (a + b <= c || a + c <= b || b + c <= a) {
			throw new IllegalTriangleException();
		} else {
			side1 = a;
			side2 = b;
			side3 = c;
		}
	}

	public Triangle1(double side1, double side2, double side3, String color, Boolean isFilled) {
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

class GeometricObject1 {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject1() {
		dateCreated = new Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject1(String color, boolean filled) {
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