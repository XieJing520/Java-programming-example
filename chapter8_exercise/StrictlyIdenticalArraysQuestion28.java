package chapter8_exercise;

import java.util.*;

public class StrictlyIdenticalArraysQuestion28 {
	public static void main(String[] args) {
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter list1: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				list1[row][col] = inputScanner.nextInt();

		System.out.print("Enter list2: ");
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				list2[row][col] = inputScanner.nextInt();

		if (equals(list1, list2))
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays are not strictly identical");

		inputScanner.close();
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		if (m1.length != m2.length)
			return false;

		for (int i = 0; i < m1.length; i++)
			if (m1[i].length != m2[i].length)
				return false;

		for (int row = 0; row < m1.length; row++)
			for (int col = 0; col < m1[row].length; col++)
				if (m1[row][col] != m2[row][col])
					return false;
		return true;
	}
}
