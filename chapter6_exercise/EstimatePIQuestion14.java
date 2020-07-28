package chapter6_exercise;

public class EstimatePIQuestion14 {
	public static void main(String[] args) {
		printTableHead();
		for (int i = 0; i <= 9; i++) {
			System.out.printf("%d\t%.4f\n",i * 100 + 1,ComputePI(i * 100 + 1));
		}
	}

	public static double ComputePI(int i) {
		double pi = 0;
		
		for (int j = 1; j <= i; j++)
			pi += Math.pow(-1, j + 1) / (2 * j - 1);

		return pi * 4;
	}

	public static void printTableHead() {
		System.out.println("i\tm(i)");
	}
}
