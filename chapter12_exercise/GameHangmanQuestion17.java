package chapter12_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameHangmanQuestion17 {
	public static void main(String[] args) throws FileNotFoundException {

		File hangmanFile = new File("C:\\Users\\Administrator\\Desktop\\hangman.txt");
		Scanner hangmanInput = new Scanner(hangmanFile);
		ArrayList<String> list = new ArrayList<String>();

		while (hangmanInput.hasNext()) {
			list.add(hangmanInput.next());
		}
		hangmanInput.close();

		Scanner inputScanner = new Scanner(System.in);
		String randomWord = randomWord(list);
		int remainingLetterCount = randomWord.length();
		char[] correctChar = new char[randomWord.length()];
		int correctCharIndex = 0, numberOfMiss = 0;

		do {

			askQuestion(randomWord, correctChar);
			char a = inputScanner.next().charAt(0);
			int numberOfCorrect = checkAnswer(randomWord, correctChar, correctCharIndex, a);

			if (numberOfCorrect == -1)
				numberOfMiss++;
			else {
				correctCharIndex += numberOfCorrect;
				remainingLetterCount -= numberOfCorrect;
			}

			if (remainingLetterCount == 0) {

				System.out.printf("The word is %s.Your missed %d times\n", randomWord, numberOfMiss);
				System.out.print("Do you want to guess another word?Enter y or n>");
				char replay = inputScanner.next().charAt(0);
				if (replay == 'n' || replay == 'N') {
					System.out.println("The game is over!!!");
					break;
				}

				else {
					randomWord = randomWord(list);
					remainingLetterCount = randomWord.length();
					correctChar = new char[randomWord.length()];
					correctCharIndex = numberOfMiss = 0;
				}
			}
		} while (true);

		inputScanner.close();
	}

	public static int checkAnswer(String q, char[] ans, int aIndex, char a) {
		for (char e : ans)
			if (e == a) {
				System.out.printf("%c is already in the word\n", a);
				return 0;
			}
		int correctLetterCount = 0;
		for (int i = 0; i < q.length(); i++)
			if (q.charAt(i) == a)
				correctLetterCount++;
		if (correctLetterCount != 0) {
			ans[aIndex++] = a;
			return correctLetterCount;
		} else {
			System.out.printf("%c is not in the word\n", a);
			return -1;
		}

	}

	public static void askQuestion(String q, char[] a) {
		System.out.print("(Guess) Enter a letter in word ");
		boolean isExist;
		for (int i = 0; i < q.length(); i++) {
			isExist = false;
			for (char e : a) {
				if (q.charAt(i) == e) {
					isExist = true;
					break;
				}
			}
			System.out.printf("%c", isExist ? q.charAt(i) : '*');
		}
		System.out.print(" > ");
	}

	public static String randomWord(ArrayList<String> list) {
		return list.get((int) (Math.random() * list.size()));
	}
}
