package chapter5_exercise;

public class FindTheSmallestNQuestion12 {
	public static void main(String[] args) {
		int n = 1;
		while(Math.pow(n, 2) <= 12000)
			n++;
		System.out.println("The smallest integer n is " + n);
	}
}
