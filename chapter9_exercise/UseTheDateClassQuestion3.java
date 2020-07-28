package chapter9_exercise;

import java.util.Date;

public class UseTheDateClassQuestion3 {
	public static void main(String[] args) {

		Date date = new Date();

		for (int i = 0; i < 8; i++) {
			date.setTime((long) (Math.pow(10, i) * 10000));
			System.out.println(date.toString());
		}

	}
}
