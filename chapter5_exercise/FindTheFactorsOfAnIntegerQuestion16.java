package chapter5_exercise;

import java.util.*;


public class FindTheFactorsOfAnIntegerQuestion16 {
	public static void main(String[] args) {
		int number;
		String factorsResult = "";
		
		System.out.print("Enter an integer number: ");
		Scanner inputScanner = new Scanner(System.in);
		number = inputScanner.nextInt();
		
		for(int i = 2;number != 1;)
		{
			if(number % i == 0)
			{
				number /= i;
				factorsResult += i + ", ";
			}
			else
				i++;
		}
		factorsResult = factorsResult.substring(0,factorsResult.length()-2) + ".";
		System.out.println("All its smallest factors are " + factorsResult);
		
		inputScanner.close();
	}
}
