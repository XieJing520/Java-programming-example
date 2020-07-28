package chapter6_exercise;

import java.util.*;


public class ComputeTheFutureInvestmentValueQuestion7 {
	public static void main(String[] args) {
		
		double amount,rate;
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("The amount invested:");
		amount = inputScanner.nextDouble();
		
		System.out.print("Annual interest rate:");
		rate = inputScanner.nextDouble();
		
		System.out.println("Years\tFuture Value");
		for(int i = 1;i <= 30;i++)
			System.out.printf("%d\t%.2f\n",i ,futureInvestmentValue(amount, rate/1200, i));

		inputScanner.close();
	}
	public static double futureInvestmentValue(double investmentAmount,
			double monthlyInterestRate, int years) {
		
		double FutureInvestmentValue = investmentAmount 
							* Math.pow((1 + monthlyInterestRate),(years * 12));
		
		return FutureInvestmentValue;
	}
}
