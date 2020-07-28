package chapter5_exercise;

public class FindTheLargestNQuestion13 {
	public static void main(String[] args) {
		int n = 1;
		while(Math.pow(n, 3) < 12000)
			n++;
		System.out.println("The largest integer n is " + --n);
	}
}
