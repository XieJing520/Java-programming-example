package chapter5_exercise;

import java.util.*;


public class ComputeTheGreatestCommonDivisorQuestion14 {
	public static void main(String[] args) {
		int number1,number2,greatestCommonDivisor;
		
		System.out.print("Enter two integer numbers are sperate by space(e.g. 5 6): ");
		Scanner inputScanner = new Scanner(System.in);
		number1 = inputScanner.nextInt();
		number2 = inputScanner.nextInt();
		
		greatestCommonDivisor = (number1 > number2)?number2:number1;
		while(number1 % greatestCommonDivisor != 0 || number2 % greatestCommonDivisor != 0)
			greatestCommonDivisor--;
		System.out.println("The greatest common divisor for number1 and number2 is "
							+ greatestCommonDivisor);
		
		inputScanner.close();
	}
}
