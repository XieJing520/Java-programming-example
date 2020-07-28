package chapter7_exercise;

import java.util.*;

public class DescendingSelectionSortQuestion20 {
	public static void main(String[] args) {
		double[] array = new double[10];

		System.out.print("Enter 10 numbers:");
		Scanner inputScanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
			array[i] = inputScanner.nextDouble();

		selectionSort(array);

		for (double e : array)
			System.out.print(e + " ");
		System.out.print("\n");

		inputScanner.close();
	}

	public static void selectionSort(double[] list) {
		for (int i = list.length-1; i >  0; i--) {
			// Find the minimum in the list[i..list.length-1]
			double currentMax = list[i];
			int currentMinIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
