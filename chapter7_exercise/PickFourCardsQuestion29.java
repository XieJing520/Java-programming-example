package chapter7_exercise;

public class PickFourCardsQuestion29 {
	public static void main(String[] args) {
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] fourCards = new int[4];
		int numberOfPick = 0, sum = 0;
		while (sum != 24) {
			sum = 0;
			for (int i = 0; i < 4;) {
				int tempCard = (int) (Math.random() * 4) * 100 + (int) (Math.random() * 13);
				if (!isRepeated(fourCards, tempCard, i))
					fourCards[i++] = tempCard;
			}
			for (int e : fourCards)
				sum += (e % 100 + 1);
			numberOfPick++;
		}

		System.out.print("The four cards are:\n");
		for (int e : fourCards)
			System.out.printf("%s of %s\n", ranks[e % 100], suits[e / 100]);
		System.out.printf("Number of picks:%d\n", numberOfPick);
	}

	public static boolean isRepeated(int[] cards, int card, int endIndex) {
		for (int i = 0; i < endIndex; i++)
			if (card== cards[i])
				return true;
		return false;
	}
}
