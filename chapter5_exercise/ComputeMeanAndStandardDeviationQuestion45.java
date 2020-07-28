package chapter5_exercise;

import java.util.*;


public class ComputeMeanAndStandardDeviationQuestion45 {
	public static void main(String[] args) {
		double sumOfSquares, sum, tempNumber, averageOfSum, deviation;
		
		sum = sumOfSquares = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(int i = 1;i <= 10;i++)
		{
			tempNumber = inputScanner.nextDouble();
			sumOfSquares += tempNumber * tempNumber;
			sum += tempNumber;
		}
		averageOfSum = sum / 10;
		deviation = Math.sqrt((sumOfSquares - (sum * sum / 10)) / 9);
		
		System.out.printf("The mean is %.2f\n", averageOfSum);
		System.out.printf("The standard deviation is %.5f", deviation);

		inputScanner.close();
	}
}
