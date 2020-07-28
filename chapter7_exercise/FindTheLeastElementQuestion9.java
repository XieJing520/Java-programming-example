package chapter7_exercise;

import java.util.*;

public class FindTheLeastElementQuestion9 {
	public static void main(String[] args) {
		double minNum;
		double[] numbers = new double[10];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = inputScanner.nextDouble();
		
		minNum = min(numbers);
		System.out.printf("The minimum number is %f",minNum);
		
		inputScanner.close();
	}
	public static double min(double[] array) {
		if(array.length <= 0)
			return 0;
		else {
			double minNum = array[0];
			for(int i = 1;i < array.length;i++)
				if(array[i] < minNum)
					minNum = array[i];
			return minNum;
		}
	}
}
