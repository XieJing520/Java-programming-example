package chapter1_exercise;


public class TheAreaAndThePerimeterOfRectangleQuestion9 {
	public static void main(String[] args) {
		
		//final double length;
		//final double weight;
		//double area = length * weight;
		//double perimeter = 2.0 * (length + weight);
		
		//System.out.println("area : " + area);
		//System.out.println("perimeter : " + perimeter);
		
		
		final double the_length_of_rectangle = 7.9;
		final double the_weight_of_rectangle = 4.5;
		double the_area_of_rectangle = the_length_of_rectangle * the_weight_of_rectangle;
		double the_perimeter_of_rectangle = (the_length_of_rectangle
												+ the_weight_of_rectangle) * 2.0;
		
		
		System.out.println("the area of the rectangle is " + the_area_of_rectangle);
		System.out.println("the perimeter of the rectangle is "
							+ the_perimeter_of_rectangle);
		
	}
}