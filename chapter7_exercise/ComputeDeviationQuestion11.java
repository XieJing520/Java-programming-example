package chapter7_exercise;

import java.util.*;

public class ComputeDeviationQuestion11 {
	public static void main(String[] args) {
		double[] nums = new double[10];
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		for(int i = 0;i < 10;i++)
			nums[i] = inputScanner.nextDouble();
		
		System.out.println("The mean is " + mean(nums));
		System.out.println("The standard deviation is " + deviation(nums));
		
		inputScanner.close();
	}

	public static double deviation(double[] x) {
		double mean = mean(x), sum = 0;
		for (double e : x)
			sum += Math.pow((e - mean), 2);
		return Math.sqrt(sum / 9);
	}

	public static double mean(double[] x) {
		double sum = 0;
		for (double e : x)
			sum += e;
		return sum / 10;
	}
}
