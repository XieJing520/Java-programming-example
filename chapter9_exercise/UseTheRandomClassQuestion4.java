package chapter9_exercise;

import java.util.Random;

public class UseTheRandomClassQuestion4 {
	public static void main(String[] args) {
		Random random = new Random(1000);

		for (int i = 0; i < 50; i++)
			System.out.println(random.nextInt(100));

	}
}
