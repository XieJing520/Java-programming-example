package chapter18_exercise;

import java.math.BigInteger;
import java.util.*;

public class FactorialQuestion1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer number:");

		BigInteger proResult = factorial(input.nextInt());

		System.out.println(proResult);

		input.close();
	}

	public static BigInteger factorial(int n) {
		if (n == 0)
			return new BigInteger("1");
		else
			return new BigInteger("" + n).multiply(factorial(n - 1));
	}

}
