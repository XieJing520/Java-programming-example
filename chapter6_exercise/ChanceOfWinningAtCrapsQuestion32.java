package chapter6_exercise;

public class ChanceOfWinningAtCrapsQuestion32 {
	public static void main(String[] args) {
		final int PLAY_COUNT = 10000;
		int sumOfTwoDice, firstDie, secondDie, point, winCount = 0;
		
		for(int i = 1;i <= PLAY_COUNT;i++)
		{
			firstDie = rollDie();
			secondDie = rollDie();
			sumOfTwoDice = firstDie + secondDie;

			if (sumOfTwoDice == 2 || sumOfTwoDice == 3 || sumOfTwoDice == 12) {
				winCount++;
			} else if (sumOfTwoDice == 7 || sumOfTwoDice == 11) {

			} else {
				point = sumOfTwoDice;
				do {
					firstDie = rollDie();
					secondDie = rollDie();
					sumOfTwoDice = firstDie + secondDie;
				} while (sumOfTwoDice != 7 && sumOfTwoDice != point);

				if (sumOfTwoDice == point)
					winCount++;
			}
		}
		System.out.printf("You totally won %d times", winCount);
	}
	public static int rollDie() {
		return (int) (Math.random() * 6 + 1);
	}
}
