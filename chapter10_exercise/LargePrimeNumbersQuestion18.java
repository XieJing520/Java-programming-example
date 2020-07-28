package chapter10_exercise;

import java.math.BigInteger;

public class LargePrimeNumbersQuestion18 {
	public static void main(String[] args) {
		String longMaxValue = Long.toString(Long.MAX_VALUE);
		BigInteger bigInteger = new BigInteger(longMaxValue);

		for (int i = 0; i < 5; i++) {
			bigInteger = bigInteger.nextProbablePrime();
			System.out.println(bigInteger);
		}

	}
}
