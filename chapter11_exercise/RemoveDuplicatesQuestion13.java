package chapter11_exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicatesQuestion13 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter 10 numbers:");
		for (int i = 0; i < 10; i++)
			list.add(inputScanner.nextInt());

		removeDuplicate(list);

		System.out.print("The distinct integers are ");
		display(list);

		inputScanner.close();
	}

	public static void display(ArrayList<Integer> list) {
		for (Integer e : list)
			System.out.printf("%d ", e);
		System.out.println();
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}
