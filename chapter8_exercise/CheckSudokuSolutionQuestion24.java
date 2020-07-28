package chapter8_exercise;

import java.util.Scanner;

public class CheckSudokuSolutionQuestion24 {
	public static void main(String[] args) {
		// Read a Sudoku solution
		int[][] grid = readASolution();

		System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
	}

	/** Read a Sudoku solution from the console */
	public static int[][] readASolution() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();

		input.close();
		return grid;
	}

	/** Check whether a solution is valid */
	public static boolean isValid(int[][] grid) {

		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (grid[i][j] < 1 || grid[i][j] > 9)
					return false;
		
		for()
		
		
	}

	
}
