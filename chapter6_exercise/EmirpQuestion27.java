package chapter6_exercise;

public class EmirpQuestion27 {
	public static void main(String[] args) {
		int palindPrimeCount = 0;

		for (int i = 2; palindPrimeCount != 100; i++) {
			if (!isPalindrome(i) && isPrime(i) && isPrime(reverse(i))) {
				System.out.print(i + " ");
				palindPrimeCount++;
				if (palindPrimeCount % 10 == 0)
					System.out.print("\n");
			}
		}
	}

	public static int reverse(int number) {
		int reverseNumber = 0;
		do {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		} while (number > 0);

		return reverseNumber;
	}

	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
}
