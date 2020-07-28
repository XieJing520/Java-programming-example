package chapter10_exercise;

import java.math.BigInteger;

public class DivisibleBy5Or6Question21 {
	public static void main(String[] args) {
		String longMaxValue = Long.toString(Long.MAX_VALUE);

		BigInteger bigInteger = new BigInteger(longMaxValue);
		bigInteger.add(BigInteger.ONE);
		
		BigInteger FIVE = new BigInteger("5"), SIX = new BigInteger("6");
		final int NUM_OF_DIVISIBLE_BY_5_OR_6 = 10;
		int i = 0;
		while (i != NUM_OF_DIVISIBLE_BY_5_OR_6) {
			if ((bigInteger.mod(FIVE)).equals(BigInteger.ZERO) || (bigInteger.mod(SIX)).equals(BigInteger.ZERO)) {
				System.out.println(bigInteger.toString());
				i++;
			}
			bigInteger = bigInteger.add(BigInteger.ONE);
		}
		
	}
}
