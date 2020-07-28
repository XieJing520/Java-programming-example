package chapter2_exercise;

import java.util.*;


public class MonetaryUnitsQuestion22 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter an amount in Int,for example 1156:");
		int amount = Input.nextInt();
		
		int remainingAmount = amount;
		
		
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
		Input.close();
	}
}
