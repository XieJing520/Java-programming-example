package chapter7_exercise;

import java.util.*;

public class ReverseAnArrayQuestion12 {
	public static void main(String[] args) {
		int[] numsList = new int[10];
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		for(int i = 0;i < 10;i++)
			numsList[i] = inputScanner.nextInt();
		
		displayArray(numsList);
		numsList = reverse(numsList);
		displayArray(numsList);
		
		inputScanner.close();
	}

	public static int[] reverse(int[] list) {
		int tempNum;
		for(int i = 0,j = list.length - 1;i <= j;i++,j--) {
			tempNum = list[i];
			list[i] = list[j];
			list[j] = tempNum;
		}

		return list;
	}
	
	public static void displayArray(int[] list) {
		for(int e:list)
			System.out.printf("%d ",e);
		System.out.print("\n");
	}
}
