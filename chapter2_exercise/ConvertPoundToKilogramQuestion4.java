package chapter2_exercise;

import java.util.*;


public class ConvertPoundToKilogramQuestion4 {
	public static void main(String[] args) {
		double pound,kilogram;
		
		System.out.print("Enter a number in pounds : ");
		Scanner pound_input = new Scanner(System.in);
		
		pound = pound_input.nextDouble();
		kilogram = pound * 0.454;
		
		System.out.println(pound + " pounds is " + kilogram + " kilograms");
		
		pound_input.close();
		//System.out.println("\nFinished");
	}
}
