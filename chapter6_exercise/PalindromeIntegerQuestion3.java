package chapter6_exercise;

import java.util.*;

public class PalindromeIntegerQuestion3 {
	public static void main(String[] args) {
		int number;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		number = inputScanner.nextInt();
		
		if(isPalindrome(number)) {
			System.out.printf("%d is a palindrome", number);
		}
		else {
			System.out.printf("%d is not a palindrome", number);
		}
		
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
	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}
	
}
