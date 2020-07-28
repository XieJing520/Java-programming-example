package chapter3_exercise;

import java.util.*;


public class PalindromeIntegerQuestion12 {
	public static void main(String[] args) {
		int number;
		
		System.out.print("Enter a three-digit integer number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		if(number / 100 == number % 10)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");

		input.close();
	}
}
