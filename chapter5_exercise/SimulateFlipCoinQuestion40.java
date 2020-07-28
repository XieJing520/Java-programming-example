package chapter5_exercise;

public class SimulateFlipCoinQuestion40 {
	public static void main(String[] args) {
		int numberOfHeads, numberOfTails;
		numberOfHeads = numberOfTails = 0;
		
		for(int i = 1;i <= 1000000;i++)
		{
			if((int)(Math.random()*2) == 0)
				numberOfHeads++;
			else
				numberOfTails++;
		}
		System.out.printf("The number of the Heads is %d\n", numberOfHeads);
		System.out.printf("The number of the Tails is %d\n", numberOfTails);
	}
}
