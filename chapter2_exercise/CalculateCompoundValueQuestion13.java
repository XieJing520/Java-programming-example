package chapter2_exercise;

import java.util.*;


public class CalculateCompoundValueQuestion13 {
	public static void main(String[] args) {
		double FirstMonthMoney,SecondMonthMoney,
			   ThirdMonthMoney,FourthMonthMoney,
			   FifthMonthMoney,SixthMonthMoney;
		
		System.out.print("Enter the monthly saving amount:");
		Scanner MoneyInput = new Scanner(System.in);
		//MoneyMonthSaveAmount = MoneyInput.nextDouble();
		
		FirstMonthMoney = 100 * (1 + 0.00417);
		SecondMonthMoney = (100 + FirstMonthMoney) * (1 + 0.00417);
		ThirdMonthMoney = (100 + SecondMonthMoney) * (1 + 0.00417);
		FourthMonthMoney = (100 + ThirdMonthMoney) * (1 + 0.00417);
		FifthMonthMoney = (100 + FourthMonthMoney) * (1 + 0.00417);
		SixthMonthMoney = (100 + FifthMonthMoney) * (1 + 0.00417);
		
		System.out.println("After the sixth month,the account value is $"
							+ SixthMonthMoney);
		
		MoneyInput.close();
	}
}
