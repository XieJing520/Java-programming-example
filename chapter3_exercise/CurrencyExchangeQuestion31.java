package chapter3_exercise;

import java.util.*;


public class CurrencyExchangeQuestion31 {
	public static void main(String[] args) {
		double exchangeRate,moneyAmount,exchangedAmount;
		final int exchangeMode;
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		Scanner input = new Scanner(System.in);
		exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		exchangeMode = input.nextInt();
		
		if(exchangeMode == 0)
		{
			System.out.print("Enter the dollar amount: ");
			moneyAmount = input.nextDouble();
			exchangedAmount = moneyAmount * exchangeRate;
			System.out.println("$" + moneyAmount + " is " + exchangedAmount + " yuan");
		}
		else if(exchangeMode == 1)
		{
			System.out.print("Enter the RMB amount: ");
			moneyAmount = input.nextDouble();
			exchangedAmount = moneyAmount / exchangeRate;
			System.out.println(moneyAmount + " yuan is $" + exchangedAmount);
		}
		else
			System.out.println("Incorrect input");
		
		input.close();
	}
}
