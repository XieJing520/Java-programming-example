package chapter6_exercise;

import java.util.*;

public class DisplayAnIntegerReversedQuestion4 {
	public static void main(String[] args) {
		int number;
		
		System.out.print("Enter an integer: ");
		Scanner inputScanner = new Scanner(System.in);
		number = inputScanner.nextInt();

		System.out.printf("Its reversal is %d", reverse(number));
		
		inputScanner.close();
	}
	public static int reverse(int number) {
		int reverseNumber = 0;
		do {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}while(number > 0);
		
		return reverseNumber;
	}
}
