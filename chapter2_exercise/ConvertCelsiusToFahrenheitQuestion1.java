package chapter2_exercise;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheitQuestion1 {
	public static void main(String[] args) {
		double Celsius,Fahrenheit;
		
		
		System.out.print("Enter a degree in Celsius : ");
		Scanner celsius_input = new Scanner(System.in);
		Celsius = celsius_input.nextDouble();
		
		Fahrenheit = (9.0 / 5) * Celsius + 32;
		System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
		
		
		celsius_input.close();
		//System.out.println("\nFinished");
	}
}
