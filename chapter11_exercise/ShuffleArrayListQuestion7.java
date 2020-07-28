package chapter11_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.security.SecureRandom;

public class ShuffleArrayListQuestion7 {
	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));

		System.out.print("before shuffling:");
		displayList(list);

		shuffle(list);

		System.out.print("after shuffling:");
		displayList(list);

	}

	public static void shuffle(ArrayList<Integer> list) {
		Integer temp = new Integer(0);
		SecureRandom randomIndex = new SecureRandom();
		int index;

		for (int i = 0; i < list.size(); i++) {
			index = randomIndex.nextInt(list.size());
			temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}

	}

	public static void displayList(ArrayList<Integer> list) {
		for (Integer e : list)
			System.out.printf("%d ", e);
		System.out.println();
	}
}
