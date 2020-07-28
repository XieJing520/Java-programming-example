package chapter8_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArraysQuestion29 {
	public static void main(String[] args) {
		int[][] m1, m2;

		m1 = new int[3][3];
		m2 = new int[3][3];

		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1:");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				m1[row][col] = input.nextInt();
			}
		}

		System.out.print("Enter list2:");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				m2[row][col] = input.nextInt();
			}
		}

		if (equals(m1, m2))
			System.out.println("The two arrays are identical");
		else
			System.out.println("The two arrays are not identical");

		input.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {

		int[] list1 = new int[9];
		int[] list2 = new int[9];

		int i = 0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				list1[i] = m1[row][col];
				list2[i++] = m2[row][col];
			}
		}

		int[] list1Copy, list2Copy;
		list1Copy = new int[list1.length];
		list2Copy = new int[list2.length];

		System.arraycopy(list1, 0, list1Copy, 0, list1.length);
		System.arraycopy(list2, 0, list2Copy, 0, list2.length);

		Arrays.parallelSort(list1Copy, 0, list1Copy.length);
		Arrays.parallelSort(list2Copy, 0, list2Copy.length);

		for (i = 0; i < list1Copy.length; i++)
			if (list1Copy[i] != list2Copy[i])
				return false;
		return true;

	}

}
