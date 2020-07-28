package chapter7_exercise;

import java.util.*;

public class CountOccurrenceOfNumbersQuestion3 {
	public static void main(String[] args) {
		int tempNumber;
		int[] numberCount = new int[100];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		while((tempNumber = inputScanner.nextInt()) != 0)
			numberCount[tempNumber - 1]++;
		
		for(int i = 0;i < 100;i++) {
			if(numberCount[i] != 0)
			{
				if(numberCount[i] > 1)
					System.out.printf("%d occurs %d times\n", i+1, numberCount[i]);
				else
					System.out.printf("%d occurs 1 time\n", i+1);
			}
		}
		
		inputScanner.close();
	}
}
