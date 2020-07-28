package chapter6_exercise;

public class ApproximateTheSquareRootQuestion22 {
	public static void main(String[] args) {
		System.out.println(sqrt(2));
	}
	public static double sqrt(long n)
	{
		double nextGuess = n, lastGuess = 1;
		while(Math.abs(nextGuess-lastGuess) >= 1E-2)
		{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}

		return nextGuess;
	}
	
}
