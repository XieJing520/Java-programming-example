package chapter7_exercise;

import java.util.*;

public class BeanMachineQuestion37 {
	public static void main(String[] args) {
		int numberOfBalls, numberOfSlots;
		int[] slots;
		String[] paths;
		String[] direction = { "L", "R" };

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop:");
		numberOfBalls = inputScanner.nextInt();
		paths = new String[numberOfBalls];

		System.out.print("Enter the number of slots in the bean machine:");
		numberOfSlots = inputScanner.nextInt();
		slots = new int[numberOfSlots];

		for (int i = 0; i < numberOfBalls; i++) {
			paths[i] = "";
			for (int j = 0; j < numberOfSlots - 1; j++)
				paths[i] += direction[(int) (Math.random() * 2)];
		}
		for (String p : paths)
			slots[calculateBallDropSlot(p)]++;

		displayPath(paths);
		displayBallsBar(slots, numberOfBalls);

		inputScanner.close();
	}

	public static void displayBallsBar(int[] slots, int balls) {
		for (int i = balls; i > 0; i--) {
			for (int j = 0; j < slots.length; j++) {
				System.out.print("|");
				System.out.printf("%s", slots[j] >= i ? "0" : " ");
			}
			System.out.print("|\n");
		}

		for (int i = 1; i <= 2 * slots.length + 1; i++)
			System.out.print("-");
		System.out.print("\n");
	}

	public static int calculateBallDropSlot(String path) {
		int slotNumbers = 0;
		for (int i = 0; i < path.length(); i++)
			if (path.charAt(i) == 'R')
				slotNumbers++;
		return slotNumbers;
	}

	public static void displayPath(String[] path) {
		for (int i = 0; i < path.length; i++) {
			System.out.println(path[i]);
		}
	}

}
