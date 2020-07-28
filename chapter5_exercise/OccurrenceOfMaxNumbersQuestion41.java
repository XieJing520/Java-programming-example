package chapter5_exercise;

import java.util.*;


public class OccurrenceOfMaxNumbersQuestion41 {
	public static void main(String[] args) {
		int tempNum,maxCount = 0,maxNumber = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		while((tempNum = inputScanner.nextInt()) != 0)
		{
			if(tempNum > maxNumber)
			{
				maxCount = 1;
				maxNumber = tempNum;
			}
			else if(tempNum == maxNumber)
				maxCount++;
		}
		if(maxNumber != 0)
		{
			System.out.printf("The largest number is %d\n", maxNumber);
			System.out.printf("The occurrence count of the largest number is %d", maxCount);
		}
		inputScanner.close();
	}
}
