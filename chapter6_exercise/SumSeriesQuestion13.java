package chapter6_exercise;


public class SumSeriesQuestion13 {
	public static void main(String[] args) {
		printTableHead();
		for(int i = 1;i <= 20;i++)
			System.out.printf("%d\t%.4f\n",i,computeSeries(i));
	}
	public static double computeSeries(int i)
	{
		double sum = 0;
		for(int j = 1;j <= i;j++)
			sum += 1.0 * j / (j + 1);
		return sum;
	}
	public static void printTableHead()
	{
		System.out.println("i\tm(i)");
	}
}
