package chapter10_exercise;


public class ImplementTheStringClassQuestion22 {
	public static void main(String[] args) {
		char[] chars = { 'x', 'i', 'e', 'j', 'i', 'n', 'g' };
		MyString1 string1 = new MyString1(chars);

		System.out.println(string1.toString());
		
		MyString1 test = MyString1.valueOf(5);
		System.out.println(test.toString());
	}
}

class MyString1 {

	private char[] myString;

	public MyString1(char[] chars) {
		myString = new char[chars.length];
		System.arraycopy(chars, 0, myString, 0, chars.length);
	}

	// this method is for testing
	public String toString() {
		String s = "";
		for (char e : myString)
			s += e;
		return s;
	}

	public char charAt(int index) {
		return myString[index];
	}

	public int length() {
		return myString.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] chars = new char[end - begin];
		int i = 0;

		for (int j = begin; j < end; j++) {
			chars[i++] = charAt(j);
		}

		MyString1 newString = new MyString1(chars);
		return newString;
	}

	public MyString1 toLowerCase() {
		char[] chars = new char[myString.length];

		for (int i = 0; i < myString.length; i++) {
			if ('A' <= charAt(i) && charAt(i) <= 'Z') {
				chars[i++] = (char) (charAt(i) - 'A' + 'a');
			} else {
				chars[i++] = charAt(i);
			}
		}

		MyString1 newString = new MyString1(chars);
		return newString;
	}

	public boolean equals(MyString1 s) {
		if (length() != s.length())
			return false;
		else {
			for (int i = 0; i < length(); i++) {
				if (charAt(i) != s.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		
		String s = i+"";
		
		char[] chars = new char[s.length()];
		
		for(int j = 0;j < s.length();j++) {
			chars[j] = s.charAt(j);
		}
		
		return new MyString1(chars);
	}

}
