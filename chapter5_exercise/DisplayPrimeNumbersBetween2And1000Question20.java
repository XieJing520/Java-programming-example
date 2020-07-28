package chapter5_exercise;

public class DisplayPrimeNumbersBetween2And1000Question20 {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		System.out.print("The prime numbers between 2 and 1000 are\n");

		for(;number <= 1000;number++)
		{
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) 
			{
				if (number % divisor == 0) // If true, number is not prime
				{ 
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}

			// Display the prime number between 2 and 1000
			if (isPrime)
			{
				count++; // Increase the count
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Display the number and advance to the new line
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
		}
	}
}
