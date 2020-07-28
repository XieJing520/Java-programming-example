package chapter4_exercise;

import java.util.*;


public class CheckSSNQuestion21 {
	public static void main(String[] args) {
		String ssnString;
		
		System.out.print("Enter a SSN: ");
		Scanner input = new Scanner(System.in);
		ssnString = input.nextLine();
		
		if(ssnString.length() == 11)
		{
			if(Character.isDigit(ssnString.charAt(0))
				&& Character.isDigit(ssnString.charAt(1))
				&& Character.isDigit(ssnString.charAt(2))
				&& ssnString.charAt(3) == '-'
				&& Character.isDigit(ssnString.charAt(4))
				&& Character.isDigit(ssnString.charAt(5))
				&& ssnString.charAt(6) == '-'
				&& Character.isDigit(ssnString.charAt(7))
				&& Character.isDigit(ssnString.charAt(8))
				&& Character.isDigit(ssnString.charAt(9))
				&& Character.isDigit(ssnString.charAt(10)))
				
				System.out.println(ssnString + " is a valid social security number");
			else
				System.out.println(ssnString + " is an invalid social security number");
		}
		else
			System.out.println(ssnString + " is an invalid social security number");
		
		input.close();
	}
}
