package chapter6_exercise;

public class ComputeCommissionsQuestion11 {
	public static void main(String[] args) {
		printTableHead();
		for(int i = 10000;i <= 100000;i += 5000)
			System.out.printf("%d\t\t\t%.1f\n",i,computeCommission(i));
	}
	public static double computeCommission(double salesAmount)
	{
		return 5000 * 0.08 + 5000 * 0.10 + (salesAmount-10000) * 0.12;
	}
	public static void printTableHead()
	{
		System.out.println("Sales Amount\t\tCommission");
		System.out.println("-----------------------------------");
	}
	
}
