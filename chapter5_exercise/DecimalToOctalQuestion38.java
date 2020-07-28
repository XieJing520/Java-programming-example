package chapter5_exercise;

import java.util.Scanner;

public class DecimalToOctalQuestion38 {
	public static void main(String[] args) {
		String octalString = "";
		int decimalNumber;
		
		System.out.print("Enter a decimal integer: ");
		Scanner inputScanner = new Scanner(System.in);
		decimalNumber = inputScanner.nextInt();
		
		do {
			octalString = decimalNumber % 8 + octalString;
			decimalNumber /= 8;
		}while(decimalNumber > 0);

		System.out.printf("Its corresponding octal value is %s", octalString);
		
		inputScanner.close();
	}
}
