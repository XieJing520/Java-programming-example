package chapter7_exercise;

import java.util.*;

public class EliminateDuplicatesQuestion15 {
	public static void main(String[] args) {
		int[] nums = new int[10], distinctNums;

		System.out.print("Enter 10 numbers: ");
		Scanner inputScanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++)
			nums[i] = inputScanner.nextInt();

		distinctNums = eliminateDuplicates(nums);

		displayArray(distinctNums);

		inputScanner.close();
	}

	public static int[] eliminateDuplicates(int[] list) {
		int numberOfDistNums = 1;
		int[] tempNums = new int[10];

		System.arraycopy(list, 0, tempNums, 0, list.length);
		Arrays.parallelSort(tempNums);

		// Determine the number of the distinct numbers without repetition
		for (int i = 1; i < 10; i++)
			if (tempNums[i] != tempNums[i - 1])
				numberOfDistNums++;

		int[] distinctNums = new int[numberOfDistNums];
		distinctNums[0] = list[0];
		int index = 1;
		for (int i = 1; i < 10; i++) {
			if (!isExist(distinctNums, list[i]))
				distinctNums[index++] = list[i];
		}

		return distinctNums;
	}

	public static void displayArray(int[] nums) {
		for (int e : nums)
			System.out.printf("%d ", e);
	}

	public static boolean isExist(int[] nums, int n) {
		for (int e : nums) {
			if (e == n)
				return true;
		}
		return false;
	}
}
