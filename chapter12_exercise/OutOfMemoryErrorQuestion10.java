package chapter12_exercise;

import java.util.ArrayList;

public class OutOfMemoryErrorQuestion10 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		try {
			while (true) {
				list.add("1");
			}
		} catch (OutOfMemoryError e) {
			System.out.println("OutOfMemoryError");
		}

	}
}