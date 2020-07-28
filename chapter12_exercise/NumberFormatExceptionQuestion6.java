package chapter12_exercise;

public class NumberFormatExceptionQuestion6 {
	public static void main(String[] args) {
		
		System.out.println(hexToDecimal("12AK"));
	}

	public static int hexToDecimal(String hex) 
			throws NumberFormatException{
		
		for(int i = 0;i < hex.length();i++) {
			if(!('0' <= hex.charAt(i) && hex.charAt(i) <= '9' ||
					'A' <= hex.charAt(i) && hex.charAt(i) <= 'F' )) {
				throw new NumberFormatException("i love you");
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
