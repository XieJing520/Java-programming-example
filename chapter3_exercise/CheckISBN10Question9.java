package chapter3_exercise;

import java.util.Scanner;


public class CheckISBN10Question9 {
	public static void main(String[] args) {
		int isbn,checkSum;
		int d1, d2, d3, d4, d5, d6, d7, d8, d9;
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		isbn = input.nextInt();
		
		d1 = isbn / 100000000;
		d2 = isbn / 10000000 % 10;
		d3 = isbn / 1000000 % 10;
		d4 = isbn / 100000 % 10;
		d5 = isbn / 10000 % 10;
		d6 = isbn / 1000 % 10;
		d7 = isbn / 100 % 10;
		d8 = isbn / 10 % 10;
		d9 = isbn % 10;
		
		checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
				 	+ d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if(checkSum == 10)
			System.out.println("The ISBN-10 number is "+ isbn + "X");
		else
			System.out.println("The ISBN-10 number is "+ isbn + checkSum);
		
		input.close();
	}
}
