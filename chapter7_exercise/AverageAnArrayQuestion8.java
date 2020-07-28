package chapter7_exercise;

import java.util.*;

public class AverageAnArrayQuestion8 {
	public static void main(String[] args) {
		double[] nums = new double[10];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(int i = 0;i < 10;i++)
			nums[i] = inputScanner.nextDouble();
		
		System.out.printf("The average of the array is %f\n", average(nums));
		
		inputScanner.close();
	}

	public static int average(int[] array) {
		int sum = 0;
		for(int i = 0;i < array.length;i++)
			sum += array[i];
		return sum / array.length;
	}

	public static double average(double[] array) {
		double sum = 0;
		for(int i = 0;i < array.length;i++)
			sum += array[i];
		return sum / array.length;
	}
}
