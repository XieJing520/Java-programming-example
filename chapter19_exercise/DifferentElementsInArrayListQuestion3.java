package chapter19_exercise;

import java.util.ArrayList;

public class DifferentElementsInArrayListQuestion3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(1);
		list.add(1);
		
		ArrayList<Integer> newList = removeDuplicates(list);


		for (int i = 0; i < newList.size(); i++) {
			System.out.println(newList.get(i));
		}

	}

	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> newList = new ArrayList<E>();

		for (int i = 0; i < list.size(); i++) {
			if (!isExist(list.get(i), newList)) {
				newList.add(list.get(i));
			}
		}

		return newList;
	}

	public static <E> boolean isExist(E o, ArrayList<E> list) {

		for (int i = 0; i < list.size(); i++) {
			if (o.equals(list.get(i))) {
				return true;
			}
		}
		return false;
	}
}
