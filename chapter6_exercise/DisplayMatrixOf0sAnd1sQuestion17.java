package chapter6_exercise;

import java.util.*;

public class DisplayMatrixOf0sAnd1sQuestion17 {
	public static void main(String[] args) {
		int n;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = inputScanner.nextInt();
				
		printMatrix(n);
		
		inputScanner.close();
	}
	public static void printMatrix(int n)
	{
		for(int row = 1;row <= n;row++)
		{
			for(int col = 1;col <= n;col++)
			{
				System.out.printf("%d ",(int)(Math.random() * 2));
			}
			System.out.print("\n");
		}
	}
}
