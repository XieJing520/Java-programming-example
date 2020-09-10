package chapter19_exercise;

import java.util.ArrayList;

public class SortArrayListQuestion9 {

	public static void main(String[] args) {

		ArrayList<Double> testList1 = new ArrayList<Double>();
		ArrayList<Integer> testList2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			testList1.add((i + 1.0));
			testList2.add((i + 1));
		}

		System.out.println("testList1 before shuffled:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList1.get(i) + " ");
		}
		System.out.println();

		System.out.println("testList2 before shuffled:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList2.get(i) + " ");
		}
		System.out.println();

		ShuffleArrayListQuestion8.shuffle(testList1);
		ShuffleArrayListQuestion8.shuffle(testList2);

		System.out.println("testList1 after shuffled:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList1.get(i) + " ");
		}
		System.out.println();

		System.out.println("testList2 after shuffled:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList2.get(i) + " ");
		}
		System.out.println();

		sort(testList1);
		sort(testList2);

		System.out.println("testList1 after sorted:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList1.get(i) + " ");
		}
		System.out.println();

		System.out.println("testList2 after sorted:");
		for (int i = 0; i < 10; i++) {
			System.out.print(testList2.get(i) + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void sort(ArrayList<T> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j + 1).compareTo(list.get(j)) < 0) {
					T temp = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, temp);
				}
			}
		}

	}

}
