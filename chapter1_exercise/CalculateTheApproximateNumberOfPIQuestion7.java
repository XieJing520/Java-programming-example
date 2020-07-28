package chapter1_exercise;


public class CalculateTheApproximateNumberOfPIQuestion7 {
	public static void main(String[] args) {
		System.out.println("The Approximate Number Of PI : "
							+ 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7
									+ 1.0 / 9 - 1.0 / 11));
		
		System.out.println("The Approximate Number Of PI : "
				+ 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7
						+ 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
	}
}