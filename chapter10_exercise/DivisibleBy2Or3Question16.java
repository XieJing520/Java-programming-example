package chapter10_exercise;

import java.math.BigInteger;

public class DivisibleBy2Or3Question16 {
	public static void main(String[] args) {
		String startNum = "1";

		for (int i = 1; i <= 49; i++)
			startNum += "0";

		BigInteger bigInteger = new BigInteger(startNum);
		BigInteger TWO = new BigInteger("2"), THREE = new BigInteger("3");
		final int NUM_OF_DIVISIBLE_BY_2_OR_3 = 10;
		int i = 0;
		while (i != NUM_OF_DIVISIBLE_BY_2_OR_3) {
			if (bigInteger.mod(TWO).equals(BigInteger.ZERO) || bigInteger.mod(THREE).equals(BigInteger.ZERO)) {
				System.out.println(bigInteger.toString());
				i++;
			}
			bigInteger = bigInteger.add(BigInteger.ONE);
		}

	}
}
