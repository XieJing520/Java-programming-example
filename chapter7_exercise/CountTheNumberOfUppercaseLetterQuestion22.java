package chapter7_exercise;

public class CountTheNumberOfUppercaseLetterQuestion22 {
	public static void main(String[] args) {
		int uppercaseCount = 0;
		for(int i = 0;i < args[0].length();i++)
			if(Character.isUpperCase(args[0].charAt(i)))
				uppercaseCount++;
		if(uppercaseCount == 1)
			System.out.printf("There is %d uppercase letters in the string\n",uppercaseCount);
		else if(uppercaseCount > 1)
			System.out.printf("There are %d uppercase letters in the string\n",uppercaseCount);
		else if(uppercaseCount == 0)
			System.out.println("There is no uppercase letters in the string");
	}
}
