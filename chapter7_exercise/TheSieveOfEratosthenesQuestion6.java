package chapter7_exercise;

public class TheSieveOfEratosthenesQuestion6 {
	public static void main(String[] args) {
		int[] primeNumsFactors;
		primeNumsFactors = primeNums(50);

		/* 88 can be replace with an integer number which is greater than 1 
		 for check if a prime number */
		System.out.println(isPrime(primeNumsFactors, 88));

	}

	public static boolean isPrime(int[] primeNumsFactors, int n) {
		if ((int) Math.sqrt(n) > primeNumsFactors[primeNumsFactors.length - 1]) {
			System.exit(1);
			return false;
		}

		else {
			for (int i = 0; primeNumsFactors[i] <= (int) Math.sqrt(n); i++)
				if (n % primeNumsFactors[i] == 0)
					return false;
			return true;
		}
	}

	public static int[] primeNums(int n) {
		int[] primeNumsFactors = new int[n];
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < n) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}

			// Display the prime number and increase the count
			if (isPrime)
				primeNumsFactors[count++] = number;

			// Check if the next number is prime
			number++;
		}
		return primeNumsFactors;
	}
}
