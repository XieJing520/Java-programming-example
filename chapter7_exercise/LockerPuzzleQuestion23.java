package chapter7_exercise;

public class LockerPuzzleQuestion23 {
	public static void main(String[] args) {

		boolean[] lockers = new boolean[100];
		for (int i = 0; i < 100; i++) {
			for (int j = i; j < 100; j += (i + 1))
				lockers[j] = !lockers[j];
		}

		for (int i = 0; i < 100; i++)
			if (lockers[i])
				System.out.printf("%d ", i + 1);

	}
}
