package chapter2_exercise;

import java.util.*;


public class CalculateFutureInvestmentValueQuestion21 {
	public static void main(String[] args) {
		double FutureInvestmentValue, InvestmentAmount,
				AnnualInterestRate,InvestmentYear;
		Scanner Input;
		
		System.out.print("Enter investment amount : ");
		Input = new Scanner(System.in);
		InvestmentAmount = Input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage : ");
		AnnualInterestRate = Input.nextDouble();
		
		System.out.print("Enter number of year : ");
		InvestmentYear = Input.nextDouble();
		
		
		FutureInvestmentValue = InvestmentAmount 
								* Math.pow((1 + AnnualInterestRate/1200),
										(InvestmentYear * 12));
		
		System.out.println("Future value is $" + FutureInvestmentValue);
		
		Input.close();
	}
}
