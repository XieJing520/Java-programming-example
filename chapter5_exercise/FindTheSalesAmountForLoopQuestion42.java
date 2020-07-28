package chapter5_exercise;

import java.util.*;


public class FindTheSalesAmountForLoopQuestion42 {
	public static void main(String[] args) {
		final double COMMISSION_SOUGHT;
		int salesAmount = 10000;
		double mySalary = 0;
		
		System.out.print("Enter your base salary: ");
		Scanner inputScanner = new Scanner(System.in);
		COMMISSION_SOUGHT = inputScanner.nextDouble();
		
		for(;mySalary < 30000;salesAmount++)
			mySalary = COMMISSION_SOUGHT + 5000 * 0.08 + 5000 * 0.10 + (salesAmount-10000) * 0.12;

		System.out.printf("The minimum sales you have to generate is %d", salesAmount);
		
		inputScanner.close();
	}
}
