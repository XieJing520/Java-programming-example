package chapter11_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayListQuestion11 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter five numbers: ");
		for (int i = 0; i < 5; i++)
			list.add(inputScanner.nextInt());

		sort(list);
		System.out.print("The sorted list is ");
		display(list);

		inputScanner.close();
	}

	public static void sort(ArrayList<Integer> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

	public static void display(ArrayList<Integer> list) {
		for (Integer e : list)
			System.out.printf("%d ", e);
		System.out.println();
	}
}
