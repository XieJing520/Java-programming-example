package chapter7_exercise;

import java.util.*;

public class IsSortedQuestion19 {
	public static void main(String[] args) {
		int sizeOfList;
		int[] list;

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter the size of the list: ");
		sizeOfList = inputScanner.nextInt();

		list = new int[sizeOfList];
		System.out.print("Enter the contents of the list: ");
		for (int i = 0; i < sizeOfList; i++)
			list[i] = inputScanner.nextInt();

		if (isSorted(list)) {
			System.out.printf("The list has %d integers ", sizeOfList);
			displayList(list);
			System.out.println("The list is already sorted");
		} else {
			System.out.printf("The list has %d integers ", sizeOfList);
			displayList(list);
			System.out.println("The list is not sorted");
		}

		inputScanner.close();
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}

	public static void displayList(int[] list) {
		for (int e : list)
			System.out.printf("%d ", e);
		System.out.print("\n");
	}
}
