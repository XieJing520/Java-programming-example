package chapter6_exercise;

public class MersennePrimeQuestion28 {
	public static void main(String[] args) {
		printTableHead();
		for(int i = 2;i <= 31;i++)
			if(isPrime((long)(Math.pow(2, i)-1)))
				System.out.printf("%d\t\t%d\n", i, (long)(Math.pow(2, i)-1));
		
	}
	public static boolean isPrime(long number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}
	public static void printTableHead() {
		System.out.println("p\t\t2^p-1");
		for(int i = 1;i <= 24;i++)
			System.out.print("-");
		System.out.print("\n");
	}
}
