package chapter7_exercise;

import java.util.*;

public class BubbleSortQuestion18 {
	public static void main(String[] args) {
		double[] array = new double[10];

		System.out.print("Enter 10 numbers: ");
		Scanner inputScanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++)
			array[i] = inputScanner.nextDouble();

		System.out.print("The unsorted array:");
		displayArray(array);

		array = bubbleSort(array);

		System.out.print("The sorted array:");
		displayArray(array);

		inputScanner.close();
	}

	public static double[] bubbleSort(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					double t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}

			}
		}
		return array;
	}

	public static void displayArray(double[] array) {
		for (double e : array)
			System.out.print(e + " ");
		System.out.print("\n");
	}
}
