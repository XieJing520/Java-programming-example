package chapter7_exercise;

import java.util.*;

public class AnalyzeScoresQuestion4 {
	public static void main(String[] args) {
		int tempNumber, totalCount, aboveCount, belowCount;
		int[] numberCount = new int[101];
		double sum,average;
		
		sum = average = totalCount = aboveCount = belowCount = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the scores: ");
		while((tempNumber = inputScanner.nextInt()) >= 0 && tempNumber <= 100)
		{
			numberCount[tempNumber - 1]++;
			totalCount++;
			sum += tempNumber;
			average = sum / totalCount;
		}
		
		for(int i = 0;i < 101;i++) {
			if(numberCount[i] != 0)
			{
				if(i >= average)
					aboveCount += numberCount[i];
				else 
					belowCount += numberCount[i];
			}
		}
		System.out.printf("There are %d scores are above or equal to the average\n", aboveCount);
		System.out.printf("There are %d scores are below the average\n", belowCount);
		
		inputScanner.close();
	}
}
