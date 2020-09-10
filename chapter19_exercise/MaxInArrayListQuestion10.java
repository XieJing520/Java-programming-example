package chapter19_exercise;

import java.util.ArrayList;

public class MaxInArrayListQuestion10 {

	public static void main(String[] args) {
		ArrayList<Double> testList1 = new ArrayList<Double>();
		ArrayList<Integer> testList2 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			testList1.add(i + 1.0);
			testList2.add(i + 1);
		}

		System.out.println(max(testList1));
		System.out.println(max(testList2));

	}

	public static <T extends Comparable<T>> T max(ArrayList<T> list) {
		if (list == null) {
			return null;
		} else {
			T maxT = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).compareTo(maxT) > 0) {
					maxT = list.get(i);
				}
			}
			return maxT;
		}

	}

}
