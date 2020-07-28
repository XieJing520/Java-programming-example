package chapter10_exercise;

import java.math.BigDecimal;

public class ApproximateEQuestion20 {
	public static void main(String[] args) {

		BigDecimal e, item;
		e = new BigDecimal(1.0);
		item = new BigDecimal(1.0);

		for (int i = 1; i <= 1000; i++) {
			item = item.divide(BigDecimal.valueOf(i), 25, BigDecimal.ROUND_DOWN);
			e = e.add(item);
			if (i % 100 == 0)
				System.out.println("The E value for i = " + i + " is " + e);
		}

	}
}
