package chapter7_exercise;

import java.util.*;

public class MergeTwoSortedListsQuestion31 {
	public static void main(String[] args) {
		int list1Size, list2Size;
		int[] list1, list2, mergedList;

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter list1 size and contents:");
		list1Size = inputScanner.nextInt();
		list1 = new int[list1Size];
		for (int i = 0; i < list1Size; i++)
			list1[i] = inputScanner.nextInt();

		System.out.print("Enter list2 size and contents:");
		list2Size = inputScanner.nextInt();
		list2 = new int[list2Size];
		for (int i = 0; i < list2Size; i++)
			list2[i] = inputScanner.nextInt();

		System.out.print("list1 is ");
		displayList(list1);

		System.out.print("list2 is ");
		displayList(list2);

		mergedList = merge(list1, list2);
		System.out.print("The merged list is ");
		displayList(mergedList);

		inputScanner.close();
	}

	public static void displayList(int[] list) {
		for (int e : list)
			System.out.printf("%d ", e);
		System.out.print("\n");
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedList = new int[list1.length + list2.length];
		int i, j, k;
		i = j = k = 0;
		for (; i < list1.length && j < list2.length;) {
			if (list1[i] <= list2[j])
				mergedList[k++] = list1[i++];
			else
				mergedList[k++] = list2[j++];
		}

		if (i < list1.length) {
			for (; i < list1.length;)
				mergedList[k++] = list1[i++];
		}

		if (j < list2.length) {
			for (; j < list2.length;)
				mergedList[k++] = list2[j++];
		}

		return mergedList;
	}
}
