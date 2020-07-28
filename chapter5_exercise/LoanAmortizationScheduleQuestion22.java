package chapter5_exercise;

import java.util.*;

public class  LoanAmortizationScheduleQuestion22 {
	public static void main(String[] args) {
		int numberOfYears;
		double loanAmount, rate, monthlyPayment, totalPayment, monthlyInterestRate, balance;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		loanAmount = inputScanner.nextDouble();
		
		System.out.print("Number of Years: ");
		numberOfYears = inputScanner.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		rate = inputScanner.nextDouble();
		
		monthlyPayment = loanAmount * (rate / 1200) 
							/ (1-1/Math.pow(1 + (rate / 1200), numberOfYears * 12));
		totalPayment = monthlyPayment * numberOfYears * 12;
		balance = loanAmount;
		monthlyInterestRate = rate / 1200;
				
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", totalPayment);

		System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");
		for (int i = 1; i <= numberOfYears * 12; i++)
		{
			 double interest = monthlyInterestRate * balance;
			 double principal = monthlyPayment - interest;
			 balance = balance - principal;
			 System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
		}

		inputScanner.close();
	}
}
