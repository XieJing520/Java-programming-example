package chapter9_exercise;

public class NSidedRegularPolygonQuestion9 {
	public static void main(String[] args) {

		RegularPolygon regularPolygon1, regularPolygon2, regularPolygon3;

		regularPolygon1 = new RegularPolygon();
		System.out.println("The perimeter of the first regular polygon is " + regularPolygon1.getPerimeter());
		System.out.println("The area of the first regular polygon is " + regularPolygon1.getArea());

		regularPolygon2 = new RegularPolygon(6, 4);
		System.out.println("The perimeter of the second regular polygon is " + regularPolygon2.getPerimeter());
		System.out.println("The area of the second regular polygon is " + regularPolygon2.getArea());

		regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The perimeter of the third regular polygon is " + regularPolygon3.getPerimeter());
		System.out.println("The area of the third regular polygon is " + regularPolygon3.getArea());

	}
}

class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}

	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}

	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return this.getSide() * this.getN();
	}

	public double getArea() {
		return (this.getN() * Math.pow(this.getSide(), 2)) / (4 * Math.tan(Math.PI / this.getN()));
	}

}