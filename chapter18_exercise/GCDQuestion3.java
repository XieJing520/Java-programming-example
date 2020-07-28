package chapter18_exercise;

import java.util.*;

public class GCDQuestion3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, n;

		System.out.print("Enter m:");
		m = input.nextInt();

		System.out.print("Enter n:");
		n = input.nextInt();

		System.out.printf("GCD(%d, %d) = %d", m, n, GCD(m, n));

		input.close();
	}

	public static int GCD(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return GCD(n, m % n);
	}
}
