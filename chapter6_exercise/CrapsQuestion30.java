package chapter6_exercise;

public class CrapsQuestion30 {
	public static void main(String[] args) {
		int sumOfTwoDice,firstDie,secondDie,point;
		
		firstDie = rollDie();
		secondDie = rollDie();
		sumOfTwoDice = firstDie + secondDie;

		if(sumOfTwoDice == 2 || sumOfTwoDice == 3 || sumOfTwoDice == 12)
		{
			System.out.printf("You rolled %d + %d = %d\n",firstDie,secondDie,sumOfTwoDice);
			System.out.println("You lose");
		}
		else if(sumOfTwoDice == 7 || sumOfTwoDice == 11)
		{
			System.out.printf("You rolled %d + %d = %d\n",firstDie,secondDie,sumOfTwoDice);
			System.out.println("You win");
		}
		else
		{
			point = sumOfTwoDice;
			System.out.printf("You rolled %d + %d = %d\n",firstDie,secondDie,sumOfTwoDice);
			System.out.printf("point is %d\n", point);
			do {
				firstDie = rollDie();
				secondDie = rollDie();
				sumOfTwoDice = firstDie + secondDie;
			}while(sumOfTwoDice !=7 && sumOfTwoDice != point);
			
			System.out.printf("You rolled %d + %d = %d\n",firstDie,secondDie,sumOfTwoDice);
			if(sumOfTwoDice == point)
				System.out.println("You win");
			else if(sumOfTwoDice == 7)
				System.out.println("You lose");
		}
	}
	public static int rollDie() {
		return (int)(Math.random() * 6 + 1);
	}
}
