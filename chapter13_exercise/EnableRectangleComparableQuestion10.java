package chapter13_exercise;

public class EnableRectangleComparableQuestion10 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(2,2);
		Rectangle r2 = new Rectangle(2,2);
		Rectangle r3 = new Rectangle(2,1);

		
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.compareTo(r3));
		
	}

}


class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getArea() {
        return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

	@Override
	public int compareTo(Rectangle o) {
		if(getArea() > o.getArea()) {
			return 1;
		}else if(getArea() == o.getArea()) {
			return 0;
		}else {
			return -1;
		}
	}
	
	public boolean equals(Rectangle o) {
		if(getArea() == o.getArea()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
