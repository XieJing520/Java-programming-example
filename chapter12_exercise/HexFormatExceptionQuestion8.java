package chapter12_exercise;

public class HexFormatExceptionQuestion8 {
	public static void main(String[] args) throws HexFormatException {

			System.out.println(hexToDecimal("1K"));
	
		
	}
	public static int hexToDecimal(String hex) 
			throws HexFormatException{
		
		for(int i = 0;i < hex.length();i++) {
			if(!('0' <= hex.charAt(i) && hex.charAt(i) <= '9' ||
					'A' <= hex.charAt(i) && hex.charAt(i) <= 'F' )) {
				throw new HexFormatException("i love 123");
			}
			
		}
		
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1', ..., or '9'
			return ch - '0';
	}
}


class HexFormatException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 114124824748877578L;

	public HexFormatException(String message) {
		super("HexFormatException:"+message);
	}
}