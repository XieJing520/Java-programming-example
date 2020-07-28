package chapter2_exercise;

import java.util.*;


public class SumDigitsQuestion6 {
	public static void main(String[] args) {
		int NumLess1000,OneDigit,TenDigit,HundredDigit,SumDigits;

		System.out.print("Enter a number between 0 and 1000 : ");
		Scanner NumInput = new Scanner(System.in);
		NumLess1000 = NumInput.nextInt();
		
		HundredDigit = NumLess1000 / 100;
		TenDigit = NumLess1000 / 10 % 10;
		OneDigit = NumLess1000 % 10;
		SumDigits = HundredDigit + TenDigit + OneDigit;
		
		
		System.out.println("The sum of the digits is " + SumDigits);
		
		NumInput.close();
		
	}
}
