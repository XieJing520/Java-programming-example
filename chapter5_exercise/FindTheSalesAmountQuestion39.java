package chapter5_exercise;

public class FindTheSalesAmountQuestion39 {
	public static void main(String[] args) {
		final int BASE_SALARY = 5000;
		int salesAmount = 10000;
		double mySalary;
		do {
			mySalary = BASE_SALARY + 5000 * 0.08 + 5000 * 0.10 + (salesAmount-10000) * 0.12;
			salesAmount++;
		} while (mySalary < 30000);
		
		System.out.printf("The minimum sales you have to generate is %d", salesAmount);
	}
}
