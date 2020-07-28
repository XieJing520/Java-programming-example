package chapter12_exercise;

public class NumberFormatExceptionQuestion7 {
	public static void main(String[] args) {
		System.out.println(bin2Dec("1002"));
	}

	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int dec = 0;

		for (int i = 0; i < binaryString.length(); i++) {
			if (!('0' <= binaryString.charAt(i) && binaryString.charAt(i) <= '1')) {
				throw new NumberFormatException("I Love You");
			}
		}

		for (int i = binaryString.length() - 1; i >= 0; i--) {
			dec += Integer.parseInt("" + binaryString.charAt(binaryString.length() - 1 - i)) * Math.pow(2, i);
		}

		return dec;
	}
}
