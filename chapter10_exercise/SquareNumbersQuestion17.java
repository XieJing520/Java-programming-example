package chapter10_exercise;

import java.math.BigInteger;

public class SquareNumbersQuestion17 {
	public static void main(String[] args) {

		BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger TWO = new BigInteger("2");
		BigInteger lowSquareRoot = new BigInteger("1");
		BigInteger highSquareRoot = new BigInteger(Long.toString(Long.MAX_VALUE));
		BigInteger midSquareRoot = highSquareRoot.add(lowSquareRoot).divide(TWO);

		while (true) {
			midSquareRoot = highSquareRoot.add(lowSquareRoot).divide(TWO);
			if (midSquareRoot.multiply(midSquareRoot).compareTo(longMaxValue) > 0) {
				highSquareRoot = midSquareRoot;
			} else {
				lowSquareRoot = midSquareRoot;
			}
			if (midSquareRoot.multiply(midSquareRoot).compareTo(longMaxValue) > 0
					&& midSquareRoot.subtract(BigInteger.ONE).multiply(midSquareRoot.subtract(BigInteger.ONE))
							.compareTo(longMaxValue) < 0) {
				break;
			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println(midSquareRoot.multiply(midSquareRoot));
			midSquareRoot = midSquareRoot.add(BigInteger.ONE);
		}

	}
}
