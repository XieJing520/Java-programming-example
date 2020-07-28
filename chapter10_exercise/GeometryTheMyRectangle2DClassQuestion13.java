package chapter10_exercise;


public class GeometryTheMyRectangle2DClassQuestion13 {
	public static void main(String[] args) {

		MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
		
		System.out.println("r1's perimeter:"+r1.getPerimeter());
		System.out.println("r1's area:"+r1.getArea());
		System.out.println(r1.contains(3,3));//bug here
		System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
		System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
		
		
	}
}

class MyRectangle2D {

	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}

	public MyRectangle2D(double x, double y, double w, double h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
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

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double w) {
		this.width = w;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double h) {
		this.height = h;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

	public boolean contains(double x, double y) {
		if(this.x-this.width/2 < x && x < this.x+this.width/2 && this.y-this.height/2 < y && y < this.y+this.height/2) {
			return true;
		}
		return false;
	}

	public boolean contains(MyRectangle2D r) {
		if(contains(r.getX()-r.getWidth()/2,r.getY()-r.getHeight()/2) == false) {
			return false;
		}
		if(contains(r.getX()-r.getWidth()/2,r.getY()+r.getHeight()/2) == false) {
			return false;
		}
		if(contains(r.getX()+r.getWidth()/2,r.getY()-r.getHeight()/2) == false) {
			return false;
		}
		if(contains(r.getX()+r.getWidth()/2,r.getY()+r.getHeight()/2) == false) {
			return false;
		}
		return true;
	}

	public boolean overlaps(MyRectangle2D r) {
		if(contains(r.getX()-r.getWidth()/2,r.getY()-r.getHeight()/2) == true) {
			return true;
		}
		if(contains(r.getX()-r.getWidth()/2,r.getY()+r.getHeight()/2) == true) {
			return true;
		}
		if(contains(r.getX()+r.getWidth()/2,r.getY()-r.getHeight()/2) == true) {
			return true;
		}
		if(contains(r.getX()+r.getWidth()/2,r.getY()+r.getHeight()/2) == true) {
			return true;
		}
		return false;
	}
	
}