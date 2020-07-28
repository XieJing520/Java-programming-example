package chapter5_exercise;

public class ComputeFutureTuitionQuestion7 {
	public static void main(String[] args) {
		double tenYearsTuition = 10000,fourYearsTotalTuition = 0;
		for(int year = 1;year <= 10;year++)
			tenYearsTuition *= 1.05;
		System.out.println("The tuition in ten years is " + tenYearsTuition);
		
		for(int year = 1;year <= 4;year++)
		{
			tenYearsTuition *= 1.05;
			fourYearsTotalTuition += tenYearsTuition;
		}
		System.out.println("The total cost of four years¡¯ worth of tuition after the tenth year "
							+ fourYearsTotalTuition);
	}
}
