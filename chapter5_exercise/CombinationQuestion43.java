package chapter5_exercise;

public class CombinationQuestion43 {
	public static void main(String[] args) {
		int combinationCount = 0;
		
		for(int firstNum = 1;firstNum <= 7;firstNum++)
		{
			for(int secondNum = firstNum;secondNum <= 7;secondNum++)
			{
				if(firstNum != secondNum)
				{
					System.out.printf("%d %d\n",firstNum,secondNum);
					combinationCount++;
				}
			}
		}
		System.out.printf("The total number of all combinations is %d\n",combinationCount);
	}
}
