package chapter7_exercise;

import java.util.*;

public class CheckWhetherArrayIsStrictlyIdenticalQuestion26 {
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
			System.out.println("Two lists are strictly identical");
		else
			System.out.println("Two lists are not strictly identical");

		inputScanner.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		if(list1.length != list2.length)
			return false;
		for(int i = 0;i < list1.length;i++)
			if(list1[i] != list2[i])
				return false;
		return true;
	}
}
