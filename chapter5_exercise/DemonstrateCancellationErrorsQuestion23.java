package chapter5_exercise;


public class DemonstrateCancellationErrorsQuestion23 {
	public static void main(String[] args) {
		final int N = 50000;
		double sumFromLeftToRight,sumFromRightToLeft;
		sumFromLeftToRight = sumFromRightToLeft = 0;
		
		for(int i = 1;i <= N;i++)
			sumFromLeftToRight += 1.0 / i;
		for(int i = N;i >= 1;i--)
			sumFromRightToLeft += 1.0 / i;
		
		System.out.println("The result of summation from left to right is " + sumFromLeftToRight);
		System.out.println("The result of summation from right to left is " + sumFromRightToLeft);
		
	}
}
