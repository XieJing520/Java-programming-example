package chapter2_exercise;

import java.util.*;


public class ComputingBMIQuestion14 {
	public static void main(String[] args) {
		
		double Pounds,Inches,Kilograms,Meters,BMI;
		
		
		System.out.print("Enter weight in pounds : ");
		Scanner PoundInput = new Scanner(System.in);
		Pounds = PoundInput.nextDouble();
		
		System.out.print("Enter height in inches : ");
		Scanner InchInput = new Scanner(System.in);
		Inches = InchInput.nextDouble();
		
		Kilograms = Pounds * 0.45359237;
		Meters = Inches * 0.0254;
		BMI = Kilograms / Math.pow(Meters, 2);
		
		System.out.println("BMI is " + BMI);
		PoundInput.close();
		InchInput.close();
	}
}
