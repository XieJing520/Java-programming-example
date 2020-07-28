package chapter18_exercise;

public class FindTheNumberOfUpperLetterQuestion14 {

	public static void main(String[] args) {
		String string = "xiejingLOVEWJH";
		
		System.out.println(findTheNumberOfUpperLetter(string));

	}
	
	public static int findTheNumberOfUpperLetter(String s) {
		return findTheNumberOfUpperLetter(s,0);
	}
	
	public static int findTheNumberOfUpperLetter(String s,int low) {
		if(s.length()-1 == low) {
			return isUpperLetter(s.charAt(low));
		}
		else {
			return isUpperLetter(s.charAt(low))+findTheNumberOfUpperLetter(s,low+1);
		}
	}
	
	
	public static int isUpperLetter(char c) {
		return ('A' <= c && c <= 'Z')?1:0;
	}
}
