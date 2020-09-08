package chapter13_exercise;

public class TheOctagonClassQuestion11 {

	public static void main(String[] args) {

		Octagon o1 = new Octagon(5);
		Octagon o2 = o1.clone();
		Octagon o3 = new Octagon(6);
		Octagon o4 = new Octagon(4);

		System.out.println(o1.compareTo(o2));
		System.out.println(o1.compareTo(o3));
		System.out.println(o1.compareTo(o4));
	}

}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

	private double side;

	public Octagon() {
		this.side = 0;
	}

	public Octagon(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public Octagon clone() {
		Octagon temp = new Octagon();
		temp.setSide(this.getSide());
		return temp;
	}

	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() == o.getArea()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2) * this.side * this.side);
	}

	@Override
	public double getPerimeter() {
		return this.side * 8;
	}

}