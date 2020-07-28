package chapter5_exercise;

import java.util.*;


public class CompoundValueQuestion30 {
	public static void main(String[] args) {
		double amount, annualInterestRate, numberOfMonths, account = 0;
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		amount = inputScanner.nextDouble();
		
		System.out.print("Enter the annual interest rate (e.g., 3.75): ");
		annualInterestRate = inputScanner.nextDouble();
		
		System.out.print("Enter the number of months: ");
		numberOfMonths = inputScanner.nextDouble();
		
		
		for(int i = 1;i <= numberOfMonths;i++)
			account = (amount + account) * (1 + (annualInterestRate/ 100.0 / 12.0));
		
		System.out.printf("Your account is %.3f", account);

		inputScanner.close();
	}
}
