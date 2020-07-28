package chapter2_exercise;

import java.util.*;


public class ConvertFeetToMetersQuestion3 {
	public static void main(String[] args) {
		double Feet,Meters;
		
		System.out.print("Enter a value for feet : ");
		Scanner FeetInput = new Scanner(System.in);
		
		Feet = FeetInput.nextDouble();
		Meters = Feet * 0.305;
		
		System.out.println(Feet + " feet is " + Meters + " meters");
		FeetInput.close();
	}
}
