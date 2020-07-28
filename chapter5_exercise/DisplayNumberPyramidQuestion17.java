package chapter5_exercise;

import java.util.*;


public class DisplayNumberPyramidQuestion17 {
	public static void main(String[] args) {
		int numberOfLines;
		
		System.out.print("Enter the number of lines: ");
		Scanner inputScanner = new Scanner(System.in);
		numberOfLines = inputScanner.nextInt();
		
		for(int line = 1;line <= numberOfLines;line++)
		{
			// Display the spaces
			for(int i = 1;i <= 2 * (numberOfLines - line);i++)
				System.out.print(" ");
			
			// Display the numbers in an increasing order
			for(int i = line;i >= 1;i--)
				System.out.printf("%d ",i);
			
			// Display the numbers in an decreasing order
			for(int i = 2;i <= line;i++)
				System.out.printf("%d ",i);
			
			System.out.print("\n");
		}
		
		inputScanner.close();
	}
}
