package chapter4_exercise;

import java.util.*;


public class HexToBinaryQuestion12 {
	public static void main(String[] args) {
		String hexString;
		char hexDigit;
		int decDigit;
		
		System.out.print("Enter a hex digit: ");
		Scanner input = new Scanner(System.in);
		hexString = input.next();
		
		if(hexString.length() != 1)
			System.exit(1);
		else
		{
			hexDigit = hexString.charAt(0);
			if('0' <= hexDigit && hexDigit <= '9')
			{
				decDigit = Integer.parseInt(hexString);
				System.out.println("The binary value is "+Integer.toBinaryString(decDigit));
			}
			else if('A' <= hexDigit && hexDigit <= 'F')
			{
				decDigit = 10 + hexDigit - 'A';
				System.out.println("The binary value is "+Integer.toBinaryString(decDigit));
			}
			else
				System.out.println(hexString + " is an invalid input");
		}
		
		
		input.close();
	}
}
