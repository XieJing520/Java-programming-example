package chapter8_exercise;

import java.util.Scanner;

public class LatinSquareQuestion36 {
	public static void main(String[] args) {

		int numOfN;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number n:");
		numOfN = input.nextInt();

		
		char[][] square = new char[numOfN][numOfN];
		
		
		for(int i = 0;i < numOfN;i++) {
			for(int j = 0;j < numOfN;j++) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		

		input.close();
	}

	public static boolean isLetterVaild(int n, char... cs) {
		for (char e : cs) {
			if (e >= 'A' + n || e < 'A')
				return false;
		}
		return true;
	}

	public static boolean isLatinSquare(char[][] cs, int n) {
		
		
		for(int i = 0;i < n;i++) {
			
		}
		
		
	}

}
