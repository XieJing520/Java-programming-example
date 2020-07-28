package chapter6_exercise;

public class SortThreeNumbersQuestion5 {
	public static void main(String[] args) {
		displaySortedNumbers(1, 2, 3);
		displaySortedNumbers(1, 3, 2);
		displaySortedNumbers(2, 1, 3);
		displaySortedNumbers(2, 3, 1);
		displaySortedNumbers(3, 1, 2);
		displaySortedNumbers(3, 2, 1);
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if(num1 < num2)
		{
			if(num1 < num3)
			{
				System.out.print(num1 + " ");
				if(num2 < num3)
					System.out.print(num2 + " " + num3);
				else
					System.out.print(num3 + " " + num2);
			}
			else
				System.out.print(num3 + " " + num1 + " " + num2);
		}
		else
		{
			if(num2 < num3)
			{
				System.out.print(num2 + " ");
				if(num1 < num3)
					System.out.print(num1 + " " + num3);
				else
					System.out.print(num3 + " " + num1);
			}
			else
				System.out.print(num3 + " " + num2 + " " + num1);
		}
		System.out.print("\n");
	}
}
