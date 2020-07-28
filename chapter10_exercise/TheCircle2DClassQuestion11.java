package chapter10_exercise;

public class TheCircle2DClassQuestion11 {
	public static void main(String[] args) {

		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.printf("The area of c1 is %.2f\n", c1.getArea());
		System.out.printf("The perimeter of c1 is %.2f\n", c1.getPerimeter());
		System.out.printf("%b\n", c1.contains(3, 3));
		System.out.printf("%b\n", c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.printf("%b\n", c1.overlaps(new Circle2D(3, 5, 2.3)));

	}
}

class Circle2D {
	private double x;
	private double y;
	private double radius;

	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public boolean contains(double x, double y) {
		if (this.radius < Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)))
			return false;
		return true;
	}

	public boolean contains(Circle2D circle) {
		if (Math.abs(this.radius - circle.getRadius()) >= Math
				.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2)))
			return false;
		return true;
	}

	public boolean overlaps(Circle2D circle) {
		if (this.radius + circle.getRadius() >= Math
				.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2)))
			return false;
		return true;
	}

}