package chapter13_exercise;

public class TheComparableCircleClassQuestion6 {
	public static void main(String[] args) {

		ComparableCircle c1, c2;
		c1 = new ComparableCircle(1);
		c2 = new ComparableCircle(1);

		System.out.println(c1.compareTo(c2));

	}
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	ComparableCircle(double radius) {
		super(radius);
	}

	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}

class Circle {
	private double radius;
	private double area;

	Circle(double radius) {
		this.radius = radius;
		this.area = Math.PI * Math.pow(this.radius, 2);
	}

	public double getArea() {
		return this.area;
	}
}
