package chapter7_exercise;

import java.util.*;

public class ExecutionTimeQuestion16 {
	public static void main(String[] args) {
		int[] numbers = new int[100000000];
		int key = (int) (Math.random() * 10000);

		for (int i = 0; i < 100000; i++)
			numbers[i] = (int) (Math.random() * 10000);

		long startTime = System.nanoTime();
		linearSearch(numbers, key);
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.printf("The execution time of invoking linearSearch is %d\n", executionTime);

		Arrays.parallelSort(numbers);
		startTime = System.nanoTime();
		binarySearch(numbers, key);
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		System.out.printf("The execution time of invoking binarySearch is %d\n", executionTime);
	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1; // Now high < low, key not found
	}
}
