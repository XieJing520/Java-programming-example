package chapter7_exercise;

import java.util.*;

public class InvertNumbersQuestion2 {
	public static void main(String[] args) {
		int[] tenNumbers = new int[10];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		for(int i = 0;i < tenNumbers.length;i++)
			tenNumbers[i] = inputScanner.nextInt();
		
		for(int i = tenNumbers.length - 1;i >= 0;i--)
			System.out.printf("%d ", tenNumbers[i]);
		
		inputScanner.close();
	}
}
