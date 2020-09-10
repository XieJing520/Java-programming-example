package chapter19_exercise;

import java.util.ArrayList;

public class ShuffleArrayListQuestion8 {

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
		
		
		shuffle(testList1);
		shuffle(testList2);

		
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
	}

	public static <E> void shuffle(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size());
			E oldElement = list.get(i), newElementE = list.get(randomIndex);

			list.set(i, newElementE);
			list.set(randomIndex, oldElement);
		}
	}
}
