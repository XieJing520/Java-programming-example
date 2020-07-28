package chapter18_exercise;

public class sumSeriesQuestion6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)
			System.out.printf("%d:%f\n", i, sumSeries(i));

	}

	public static double sumSeries(int i) {
		if (i == 1)
			return 1.0 / 2;
		else
			return 1.0 * i / (i + 1) + sumSeries(i - 1);
	}
}
