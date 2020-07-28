package chapter3_exercise;

import java.util.*;


public class UsingLogicalOperatorsQuestion26 {
	public static void main(String[] args) {
		int number;
		
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		System.out.println("Is " + number + " divisible by 5 and 6? "
							+ (number % 5 == 0 && number % 6 == 0));
		System.out.println("Is " + number + " divisible by 5 or 6? "
				+ (number % 5 == 0 || number % 6 == 0));
		System.out.println("Is " + number + " divisible by 5 and 6,but not both? "
				+ (number % 5 == 0 ^ number % 6 == 0));
		
		input.close();
	}
}
