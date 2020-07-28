package chapter8_exercise;


public class LargestRowAndColumnQuestion10 {
	public static void main(String[] args) {
		int[][] randomMatrix = new int[4][4];
		
		generate1sAnd0s(randomMatrix);
		displayMatrix(randomMatrix);
		System.out.printf("The largest row index:%d\n",findLargestRow(randomMatrix));
		System.out.printf("The largest column index:%d\n",findLargestColumn(randomMatrix));
		
	}
	public static int findLargestRow(int[][] matrix) {
		if(matrix.length == 0)
			return -1;
		else {
			int largestOnesCount = 0,largestRowIndex = 0;
			for(int row = 0;row < matrix.length;row++)
			{
				int currentOnesCount = 0;
				for(int e:matrix[row])
					if(e == 1)
						currentOnesCount++;
				if(currentOnesCount > largestOnesCount)
				{
					largestOnesCount = currentOnesCount;
					largestRowIndex = row;
				}
			}
			return largestRowIndex;
		}
	}
	public static int findLargestColumn(int[][] matrix) {
			int largestOnesCount = 0,largestColumnIndex = 0;
			
			for(int column = 0;column < 4;column++)
			{
				int currentOnesCount = 0;
				for(int row = 0;row < 4;row++)
				{
					if(matrix[row][column] == 1)
						currentOnesCount++;
				}
				if(currentOnesCount > largestOnesCount)
				{
					largestOnesCount = currentOnesCount;
					largestColumnIndex = column;
				}
			}
			return largestColumnIndex;
	}
	public static void generate1sAnd0s(int[][] matrix) {
		for(int row = 0;row < matrix.length;row++)
			for(int col = 0;col < matrix[row].length;col++)
				matrix[row][col] = (int)(Math.random() * 2);
	}
	public static void displayMatrix(int[][] matrix) {
		for(int row = 0;row < matrix.length;row++)
		{
			for(int col = 0;col < matrix[row].length;col++)
				System.out.printf("%d ",matrix[row][col]);
			System.out.println();
		}
	}
}
