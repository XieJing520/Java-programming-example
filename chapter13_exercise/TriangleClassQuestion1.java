package chapter13_exercise;

public class TriangleClassQuestion1 {
	public static void main(String[] args) {

		Triangle triangle = new Triangle("yellow", true, 3, 4, 5);

		System.out.println(triangle.toString());
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}
}

class Triangle extends GeometricObject {
	private double a;
	private double b;
	private double c;

	public Triangle(String color, boolean filled, double a, double b, double c) {
		super(color, filled);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea() {
		double p = getPerimeter() / 2;

		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double getPerimeter() {
		return (a + b + c);
	}

}

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
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
	 * Return filled. Since filled is boolean, the getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

}