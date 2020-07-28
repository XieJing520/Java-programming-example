package chapter5_exercise;

import java.util.*;


public class  CheckISBN13Question47 {
	public static void main(String[] args) {
		String isbnString;
		int checksum = 0,d13;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		isbnString = inputScanner.nextLine();
		if(isbnString.length() != 12)
		{
			System.out.printf("%s is an invalid input", isbnString);
			System.exit(1);
		}
		
		for(int i = 0;i < 12;i++)
		{
			if(i % 2 == 1)
				checksum += 3 * Integer.parseInt(String.valueOf(isbnString.charAt(i)));
			else
				checksum += Integer.parseInt(String.valueOf(isbnString.charAt(i)));
		}
		d13 = 10 - checksum % 10;
		if(d13 == 10)
			d13 = 0;
		
		System.out.printf("The ISBN-13 number is %s%d", isbnString, d13);
		
		inputScanner.close();
	}
}
