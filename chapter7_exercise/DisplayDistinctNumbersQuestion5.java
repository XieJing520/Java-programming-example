package chapter7_exercise;

import java.util.*;

public class DisplayDistinctNumbersQuestion5 {
	public static void main(String[] args) {
		int tempNum, indexOfDistNums = 0;
		int[] distinctNums = new int[10];

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");

		for (int i = 0; i < 10; i++) {
			tempNum = inputScanner.nextInt();
			if (!isExist(distinctNums, tempNum))
				distinctNums[indexOfDistNums++] = tempNum;
		}

		// Display the result
		System.out.println("The number of distinct numbers is " + indexOfDistNums);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < indexOfDistNums; i++)
			System.out.printf("%d ", distinctNums[i]);

		inputScanner.close();
	}

	public static boolean isExist(int[] nums, int n) {
		for (int e : nums) {
			if (e == n)
				return true;
		}
		return false;
	}
}
