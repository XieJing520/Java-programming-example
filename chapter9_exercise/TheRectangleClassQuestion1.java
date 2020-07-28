package chapter9_exercise;

public class TheRectangleClassQuestion1 {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("The width of the first rectangle is " + rectangle1.width);
		System.out.println("The height of the first rectangle is " + rectangle1.height);
		System.out.println("The area of the first rectangle is " + rectangle1.getArea());
		System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter());

		System.out.println("The width of the second rectangle is " + rectangle2.width);
		System.out.println("The height of the second rectangle is " + rectangle2.height);
		System.out.println("The area of the second rectangle is " + rectangle2.getArea());
		System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter());
	}
}

class Rectangle {
	double width = 1, height = 1;

	public Rectangle() {

	}

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}
}