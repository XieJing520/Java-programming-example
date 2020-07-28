package chapter5_exercise;

public class SummationQuestion35 {
	public static void main(String[] args) {
		double sumSeries = 0;
		for(int i = 1;i <= 624;i++)
			sumSeries += 1.0 / (Math.pow(i, 0.5)+Math.pow(i+1, 0.5));
		
		System.out.printf("The summation of the series is %f",sumSeries);
	}
}
