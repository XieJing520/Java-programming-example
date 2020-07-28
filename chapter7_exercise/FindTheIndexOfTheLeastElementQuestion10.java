package chapter7_exercise;

import java.util.Scanner;

public class FindTheIndexOfTheLeastElementQuestion10 {
	public static void main(String[] args) {
		int minNumIndex;
		double[] numbers = new double[10];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = inputScanner.nextDouble();
		
		minNumIndex = indexOfSmallestElementmin(numbers);
		System.out.printf("The index of the minimum number is %d",minNumIndex);
		
		inputScanner.close();
	}
	public static int indexOfSmallestElementmin(double[] array) {
		if(array.length <= 0)
			return 0;
		else {
			int minNumIndex = 0;
			double minNum = array[0];
			for(int i = 1;i < array.length;i++)
				if(array[i] < minNum)
				{
					minNum = array[i];
					minNumIndex = i;
				}
			return minNumIndex;
		}
	}
}
