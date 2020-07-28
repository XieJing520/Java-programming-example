package chapter5_exercise;

import java.util.*;


public class BitLevelOperationsQuestion44 {
	public static void main(String[] args) {
		short shortNumber;
		
		System.out.print("Enter an integer: ");
		Scanner inputScanner = new Scanner(System.in);
		shortNumber = inputScanner.nextShort();
		
		System.out.print("The bits are ");
		for(int i = 15;i >= 0;i--)
		{
			int temp = shortNumber >> i;
			int bit = temp & 1;
			System.out.print(bit);
		}
		
		inputScanner.close();
	}
}
