package chapter10_exercise;

import java.math.BigInteger;

public class MersennePrimeQuestion19 {

	public static void main(String[] args) {

		BigInteger Num = new BigInteger("2");

		for (int p = 2; p <= 100; p++) {
			if (Num.pow(p).subtract(new BigInteger("1")).isProbablePrime(1000000000)) {
				System.out.println(p + "  " + Num.pow(p).subtract(new BigInteger("1")));
			}
		}

	}
}
