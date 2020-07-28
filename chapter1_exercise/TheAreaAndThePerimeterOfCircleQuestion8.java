package chapter1_exercise;


public class TheAreaAndThePerimeterOfCircleQuestion8 {
	public static void main(String[] args) {
		double the_radius_of_circle = 5.5,PI = 3.1415926;
		double the_perimeter_of_circle = 2.0 * the_radius_of_circle * PI;
		double the_area_of_circle = the_radius_of_circle * the_radius_of_circle * PI;
		
		
		System.out.println("the perimeter of the circle : " + the_perimeter_of_circle);
		System.out.println("the area of the circle : " + the_area_of_circle);
		
		
		//System.out.println("Finished in main");
	}
}
