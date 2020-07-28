package chapter6_exercise;

import java.util.*;


public class FormatAnIntegerQuestion37 {
	public static void main(String[] args) {
		int number,width;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = inputScanner.nextInt();
		
		System.out.print("Enter the width: ");
		width = inputScanner.nextInt();
		
		System.out.printf("The string is %s", format(number, width));
		
		inputScanner.close();
	}
	public static String format(int number, int width) {
		String numberString = String.valueOf(number);
		int lengthOfNumber = numberString.length();
		for(int i = 1;i <= width - lengthOfNumber;i++)
			numberString = "0" + numberString;

		return numberString;
	}
}
