package chapter6_exercise;

public class UseTheisPrimeMethodQuestion10 {
	public static void main(String[] args) {
		int primeCount = 0;
		
		for(int i = 2;i < 10000;i++)
			if(isPrime(i))
				primeCount++;
		
		System.out.printf("The number of prime numbers less than 10000 is %d",primeCount);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) 
		{
			if (number % divisor == 0)// If true, number is not prime
				return false; // Number is not a prime
		}
		return true;
	}
}
