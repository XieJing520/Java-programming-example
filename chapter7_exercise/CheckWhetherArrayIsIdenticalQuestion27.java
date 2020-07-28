package chapter7_exercise;

import java.util.*;

public class CheckWhetherArrayIsIdenticalQuestion27 {
	public static void main(String[] args) {
		int list1Size, list2Size;
		int[] list1, list2;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter list1 size and contents:");
		list1Size = inputScanner.nextInt();
		list1 = new int[list1Size];
		for (int i = 0; i < list1Size; i++)
			list1[i] = inputScanner.nextInt();

		System.out.print("Enter list1 size and contents:");
		list2Size = inputScanner.nextInt();
		list2 = new int[list2Size];
		for (int i = 0; i < list2Size; i++)
			list2[i] = inputScanner.nextInt();

		if (equals(list1, list2))
			System.out.println("Two lists are identical");
		else
			System.out.println("Two lists are not identical");

		inputScanner.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;
		int[] list1Copy, list2Copy;
		list1Copy = new int[list1.length];
		list2Copy = new int[list2.length];

		System.arraycopy(list1, 0, list1Copy, 0, list1.length);
		System.arraycopy(list2, 0, list2Copy, 0, list2.length);

		Arrays.parallelSort(list1Copy, 0, list1Copy.length);
		Arrays.parallelSort(list2Copy, 0, list2Copy.length);

		for (int i = 0; i < list1Copy.length; i++)
			if (list1Copy[i] != list2Copy[i])
				return false;
		return true;
	}
}
