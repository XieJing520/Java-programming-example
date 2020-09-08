package chapter13_exercise;


public class EnableCircleComparableQuestion9 {

	public static void main(String[] args) {
		Circle1 circle1 = new Circle1(5);
		Circle1 circle2 = new Circle1(5);
		Circle1 circle3 = new Circle1(6);
		
		System.out.println(circle1.equals(circle2));
		System.out.println(circle1.equals(circle3));
		
		
		System.out.println(circle1.compareTo(circle2));
		System.out.println(circle1.compareTo(circle3));
		
	}

}


class Circle1 extends GeometricObject implements Comparable<Circle1>{
    private double radius;

    public Circle1() {}

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.println(
        "The circle is created " +
        getDateCreated() +
        " and the radius is " +
        radius
        );
    }

	@Override
	public int compareTo(Circle1 o) {
		if(getRadius() > o.getRadius())
			return 1;
		else if(getRadius() == o.getRadius())
			return 0;
		else
			return -1;
	}

	
	public boolean equals(Circle1 o) {
        if(getRadius() == o.getRadius()) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
}