package chapter19_exercise;

public class GenericBinarySearchQuestion7 {

	public static void main(String[] args) {

		Double[] testList1 = new Double[10];
		Integer[] testList2 = new Integer[10];

		for (int i = 0; i < 10; i++) {
			testList1[i] = new Double((i + 1));
			testList2[i] = new Integer(i + 1);
		}

		System.out.println(binarySearch(testList1, 7.0));
		System.out.println(binarySearch(testList2, 10));
		System.out.println(binarySearch(testList2, 1));
		System.out.println(binarySearch(testList2, 13));
		System.out.println(binarySearch(testList2, -5));
	}

	public static <T extends Comparable<T>> int binarySearch(T[] list, T key) {

		if (list == null) {
			return -1;
		} else {
			int low, high, mid;
			low = 0;
			high = list.length - 1;

			while (low <= high) {
				mid = (low + high) / 2;
				if (list[mid].compareTo(key) > 0) {
					high = mid - 1;
				} else if (list[mid].compareTo(key) < 0) {
					low = mid + 1;
				} else {
					return mid;
				}
			}
			return -1;
		}

	}

}
