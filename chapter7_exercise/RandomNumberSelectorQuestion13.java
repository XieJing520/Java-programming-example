package chapter7_exercise;


public class RandomNumberSelectorQuestion13 {
	public static void main(String[] args) {

		int[] testNumbers = new int[54];
		for (int i = 0; i < 53; i++)
			testNumbers[i] = i + 1;

		// Display the only number left which is 54
		System.out.println(getRandom(testNumbers));
	}

	public static int getRandom(int... numbers) {
		int randomNumber;

		do {
			randomNumber = 1 + (int) (Math.random() * 54);
		} while (isExist(numbers, randomNumber));

		return randomNumber;
	}

	public static boolean isExist(int[] array, int number) {
		for (int e : array)
			if (e == number)
				return true;
		return false;
	}
}
