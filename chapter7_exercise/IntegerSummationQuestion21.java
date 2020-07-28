package chapter7_exercise;

public class IntegerSummationQuestion21 {
	public static void main(String[] args) {
		int sum = 0;
		for(String e:args)
			sum += Integer.parseInt(e);
		System.out.printf("The sum of these numbers is %d\n",sum);
	}
}
