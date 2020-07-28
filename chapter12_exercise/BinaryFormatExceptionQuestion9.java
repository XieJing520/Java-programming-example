package chapter12_exercise;

public class BinaryFormatExceptionQuestion9 {
	public static void main(String[] args) throws BinaryFormatException  {
		System.out.println(bin2Dec("1002"));
	}
	public static int bin2Dec(String binaryString) throws BinaryFormatException {
		int dec = 0;

		for (int i = 0; i < binaryString.length(); i++) {
			if (!('0' <= binaryString.charAt(i) && binaryString.charAt(i) <= '1')) {
				throw new NumberFormatException("I Love 520");
			}
		}

		for (int i = binaryString.length() - 1; i >= 0; i--) {
			dec += Integer.parseInt("" + binaryString.charAt(binaryString.length() - 1 - i)) * Math.pow(2, i);
		}

		return dec;
	}
}

class BinaryFormatException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4593462280911560787L;

	public BinaryFormatException(String message){
		super(message);
	}
}

