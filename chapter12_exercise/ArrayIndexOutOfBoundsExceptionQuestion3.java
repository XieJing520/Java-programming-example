package chapter12_exercise;
import java.security.SecureRandom;
import java.util.*;

public class ArrayIndexOutOfBoundsExceptionQuestion3 {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] list = new int[100];
		Scanner input = new Scanner(System.in);
		int index;

		for (int i = 0; i < 100; i++) {
			list[i] = random.nextInt(100);
		}

		System.out.print("Enter the index of the list:");
		index = input.nextInt();

		try {
			System.out.println(list[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}

		input.close();
	}

}
