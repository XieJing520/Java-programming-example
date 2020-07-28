package chapter10_exercise;

public class TheMyPointClassQuestion4 {
	public static void main(String[] args) {
		MyPoint point1,point2;
		point1 = new MyPoint();
		point2 = new MyPoint(10,30.5);
		
		System.out.printf("The distance between (%.1f, %.1f)"
				+ " and (%.1f, %.1f) is %.2f",point1.getX(),point1.getY(),
				point2.getX(),point2.getY(),point1.distance(point2));
	}
}

class MyPoint {
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	public double distance(MyPoint myPoint) {
		return (Math.sqrt(Math.pow(this.x - myPoint.getX(), 2) + Math.pow(this.y - myPoint.getY(), 2)));
	}

	public double distance(double x, double y) {
		return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
	}

	public static double distance(MyPoint myPoint1, MyPoint myPoint2) {
		return (Math.sqrt(Math.pow(myPoint2.getX() - myPoint2.getX(), 2) + Math.pow(myPoint2.getY() - myPoint2.getY(), 2)));
	}

}