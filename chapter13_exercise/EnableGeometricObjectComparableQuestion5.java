package chapter13_exercise;

public class EnableGeometricObjectComparableQuestion5 {
	public static void main(String[] args) {

//		GeometricObject520 c1, c2;
//		c1 = new Circle(1);
//		c2 = new Circle(0.5);
//
//		GeometricObject520 r1, r2;
//		r1 = new Rectangle(10, 5);
//		r2 = new Rectangle(5, 2);
//
//		System.out.println(GeometricObject520.max(c1, c2).getArea());
//		System.out.println(GeometricObject520.max(r1, r2).getArea());

	}
}

//class Circle extends GeometricObject520 {
//	private double radius;
//	private double area;
//
//	Circle(double r) {
//		this.radius = r;
//		this.area = Math.PI * Math.pow(this.radius, 2);
//	}
//
//	public double getArea() {
//		return this.area;
//	}
//
//}
//
//class Rectangle extends GeometricObject520 {
//	private double length;
//	private double width;
//	private double area;
//
//	Rectangle(double length, double width) {
//		this.length = length;
//		this.width = width;
//		this.area = this.length * this.width;
//	}
//
//	public double getArea() {
//		return this.area;
//	}
//
//}
//
//abstract class GeometricObject520 implements Comparable<GeometricObject520> {
//	private String color = "white";
//	private boolean filled;
//	private java.util.Date dateCreated;
//
//	/** Construct a default geometric object */
//	public GeometricObject520() {
//		dateCreated = new java.util.Date();
//	}
//
//	/**
//	 * Construct a geometric object with the specified color and filled value
//	 */
//	public GeometricObject520(String color, boolean filled) {
//		dateCreated = new java.util.Date();
//		this.color = color;
//		this.filled = filled;
//	}
//
//	/** Return color */
//	public String getColor() {
//		return color;
//	}
//
//	/** Set a new color */
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	/**
//	 * Return filled. Since filled is boolean, its getter method is named isFilled
//	 */
//	public boolean isFilled() {
//		return filled;
//	}
//
//	/** Set a new filled */
//	public void setFilled(boolean filled) {
//		this.filled = filled;
//	}
//
//	/** Get dateCreated */
//	public java.util.Date getDateCreated() {
//		return dateCreated;
//	}
//
//	/** Return a string representation of this object */
//	public String toString() {
//		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
//	}
//
//	public abstract double getArea();
//
//	public static GeometricObject520 max(GeometricObject520 o1, GeometricObject520 o2) {
//		if (o1.getArea() > o2.getArea()) {
//			return o1;
//		} else {
//			return o2;
//		}
//	}
//
//	@Override
//	public int compareTo(GeometricObject520 o) {
//
//		if (getArea() > o.getArea()) {
//			return 1;
//		} else if (getArea() < o.getArea()) {
//			return -1;
//		} else {
//			return -1;
//		}
//	}
//}