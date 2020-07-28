package chapter7_exercise;

import java.util.*;

public class PartitionOfAListQuestion32 {
	public static void main(String[] args) {
		int[] list;
		int listSize;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter list size:");
		listSize = inputScanner.nextInt();
		list = new int[listSize];
		
		System.out.print("Enter list content: ");
		for(int i = 0;i < listSize;i++)
			list[i] = inputScanner.nextInt();
		
		partition(list);
		System.out.print("After the partition, the list is ");
		displayList(list);
		
		inputScanner.close();
	}

	public static void displayList(int[] list) {
		for (int e : list)
			System.out.printf("%d ", e);
		System.out.print("\n");
	}

	public static int partition(int[] list) {
		int leftIndex, rightIndex, pivot;

		leftIndex = pivot = 0;
		rightIndex = list.length - 1;

		while (leftIndex < rightIndex) {
			while (list[rightIndex] > list[pivot])
				rightIndex--;
			swap(list, pivot, rightIndex);
			pivot = rightIndex;

			if (leftIndex >= rightIndex)
				break;

			while (list[leftIndex] <= list[pivot])
				leftIndex++;
			swap(list, pivot, leftIndex);
			pivot = leftIndex;
		}
		return pivot;
	}

	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}