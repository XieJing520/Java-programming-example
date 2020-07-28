package chapter5_exercise;

import java.util.*;


public class CheckingISBNQuestion36 {
	public static void main(String[] args) {
		int isbn,checkSum = 0,divisor = 100000000;
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		isbn = input.nextInt();
		
		for(int i = 0;i < 9;i++)
		{
			int dI = isbn / divisor % 10;
			checkSum += dI * (i+1);
			divisor /= 10;
		}
		checkSum %= 11;

		if(checkSum == 10)
			System.out.printf("The ISBN-10 number is %d%dX", isbn / 100000000, isbn % 100000000);
		else
			System.out.printf("The ISBN-10 number is %d%d%d", isbn / 100000000, isbn % 100000000, checkSum);

		input.close();
	}
}
