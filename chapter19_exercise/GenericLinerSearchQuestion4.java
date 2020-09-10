package chapter19_exercise;

public class GenericLinerSearchQuestion4 {

	public static void main(String[] args) {

		Double[] testList1 = new Double[3];
		Integer[] testList2 = new Integer[3];

		for (int i = 0; i < 3; i++) {
			testList1[i] = new Double((i + 1) * 1.0);
			testList2[i] = new Integer(i + 1);
		}

		System.out.println(linerSearch(testList1, 2.0));
		System.out.println(linerSearch(testList2, 4));

	}

	public static <T extends Comparable<T>> int linerSearch(T[] list, T key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

}
