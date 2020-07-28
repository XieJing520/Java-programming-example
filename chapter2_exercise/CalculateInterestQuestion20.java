package chapter2_exercise;

import java.util.*;


public class CalculateInterestQuestion20 {
	public static void main(String[] args) {
		double Interest,Balance,AnnualInterestRate;
		
		System.out.print("Enter balance and interest rate "
						+ "(e.g., 3 for 3%) : ");
		Scanner BalanRateInput = new Scanner(System.in);
		Balance = BalanRateInput.nextDouble();
		AnnualInterestRate = BalanRateInput.nextDouble();
		
		Interest = Balance * (AnnualInterestRate / 1200);
		System.out.println("The interest is " + Interest);
		
		BalanRateInput.close();
	}
}
