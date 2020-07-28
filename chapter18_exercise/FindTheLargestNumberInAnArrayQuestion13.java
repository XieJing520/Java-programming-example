package chapter18_exercise;

public class FindTheLargestNumberInAnArrayQuestion13 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,7,2,6,10};
		
		
		System.out.println(maxNumber(array));

	}

	public static int maxNumber(int[] array) {
		return maxNumber(array,0);
	}
	
	public static int maxNumber(int[] array,int low) {
		if(array.length - 1 == low)
			return array[low];
		else
			return array[low]>maxNumber(array,low+1)?array[low]:maxNumber(array,low+1);
		
	}
}
