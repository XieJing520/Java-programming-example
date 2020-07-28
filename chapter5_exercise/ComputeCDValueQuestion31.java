package chapter5_exercise;

import java.util.*;


public class ComputeCDValueQuestion31 {
	public static void main(String[] args) {
		
		double amount, annualPercentageYield;
		int numberOfMonths;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		amount = inputScanner.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		annualPercentageYield = inputScanner.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");	
		numberOfMonths = inputScanner.nextInt();
		
		System.out.println("Month\tCD Value");
		for(int i = 1;i <= numberOfMonths;i++)
		{
			amount = amount + amount * annualPercentageYield / 1200;
			System.out.printf("%d\t%.2f\n", i, amount);
		}

		inputScanner.close();
	}
}
