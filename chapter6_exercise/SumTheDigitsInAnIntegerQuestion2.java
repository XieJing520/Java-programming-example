package chapter6_exercise;

import java.util.*;

public class SumTheDigitsInAnIntegerQuestion2 {
	public static void main(String[] args) {
		long number;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter an integer:");
		number = inputScanner.nextLong();
		System.out.printf("The sum of the digits in %d is %d", number,sumDigits(number));
		
		inputScanner.close();
	}
	public static int sumDigits(long n) {
		int sum = 0;
		do {
			sum += n % 10;
			n /= 10;
		}while(n > 0);
		
		return sum;
	}
}
