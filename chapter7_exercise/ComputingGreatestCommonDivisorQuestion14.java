package chapter7_exercise;

import java.util.*;

public class ComputingGreatestCommonDivisorQuestion14 {
	public static void main(String[] args) {
		int gcd;
		int[] nums = new int[5];
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 5 numbers:");
		for(int i = 0;i < 5;i++)
			nums[i] = inputScanner.nextInt();
		
		gcd = gcd(nums);
		System.out.printf("The gcd of these numbers is %d\n",gcd);
		
		inputScanner.close();
	}

	public static int gcd(int... numbers) {
		int d = min(numbers);

		for (; d >= 1; d--) {
			boolean isDivisible = true;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] % d != 0)
					isDivisible = false;
			}
			if (isDivisible)
				break;
		}
		return d;
	}

	public static int min(int[] array) {
		if (array.length <= 0)
			return 0;
		else {
			int minNum = array[0];
			for (int i = 1; i < array.length; i++)
				if (array[i] < minNum)
					minNum = array[i];
			return minNum;
		}
	}
}
