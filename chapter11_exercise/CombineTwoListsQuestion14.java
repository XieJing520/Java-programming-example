package chapter11_exercise;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;

public class CombineTwoListsQuestion14 {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3;
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter five integers for list1:");
		for (int i = 0; i < 5; i++) {
			list1.add(new Integer(inputScanner.nextInt()));
		}

		System.out.print("Enter five integers for list2:");
		for (int i = 0; i < 5; i++) {
			list2.add(new Integer(inputScanner.nextInt()));
		}

		list3 = union(list1, list2);

		displayList(list3);

		inputScanner.close();
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (Integer e : list1) {
			list.add(e);
		}

		for (Integer e : list2) {
			if (!list.contains(e))
				list.add(e);
		}

		return list;
	}

	public static void displayList(ArrayList<Integer> list) {
		for (Integer e : list) {
			System.out.printf("%d ", e.intValue());
		}
		System.out.println();
	}
}
