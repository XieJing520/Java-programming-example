package chapter5_exercise;

public class SumASeriesQuestion24 {
	public static void main(String[] args) {
		double summation = 0;
		for(int i = 1;i <= 97;i += 2)
			summation += 1.0 * i / (i + 2);
		System.out.println("The result of summation is " + summation);
	}
}
