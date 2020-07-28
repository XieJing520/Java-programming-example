package chapter10_exercise;

public class GeometryTheTriangle2DClassQuestion12 {
	public static void main(String[] args) {
		// System.out.println(520);
	}
}

class Triangle2D {

	private MyPoint p1 = new MyPoint();
	private MyPoint p2 = new MyPoint();
	private MyPoint p3 = new MyPoint();

	public Triangle2D() {
		setP1(0, 0);
		setP2(1, 1);
		setP3(2, 5);
	}

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		setP1(p1.getX(), p1.getY());
		setP2(p2.getX(), p2.getY());
		setP3(p3.getX(), p3.getY());
	}

	public MyPoint getP1() {
		return new MyPoint(p1.getX(), p1.getY());
	}

	public void setP1(double x, double y) {
		p1.setX(x);
		p1.setY(y);
	}

	public MyPoint getP2() {
		return new MyPoint(p2.getX(), p2.getY());
	}

	public void setP2(double x, double y) {
		p1.setX(x);
		p1.setY(y);
	}

	public MyPoint getP3() {
		return new MyPoint(p3.getX(), p3.getY());
	}

	public void setP3(double x, double y) {
		p1.setX(x);
		p1.setY(y);
	}

	
	public double getArea() {
		
	}
	
	public double getPerimeter() {
		
	}
	
	
	
}