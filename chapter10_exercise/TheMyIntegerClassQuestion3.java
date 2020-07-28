package chapter10_exercise;

public class TheMyIntegerClassQuestion3 {
	public static void main(String[] args) {
		MyInteger myInteger1, myInteger2;

		myInteger1 = new MyInteger(520);
		myInteger2 = new MyInteger(510);

		System.out.printf("The value is %d\n",myInteger1.getValue());
		System.out.printf("Even number? %b\n", myInteger1.isEven());
		System.out.printf("Odd number? %b\n", myInteger1.isOdd());
		System.out.printf("Prime number? %b\n", myInteger1.isPrime());
		
		System.out.printf("Even number? %b\n", MyInteger.isEven(myInteger2));
		System.out.printf("Odd number? %b\n", MyInteger.isOdd(myInteger2));
		System.out.printf("Prime number? %b\n", MyInteger.isPrime(myInteger2));
		
		System.out.printf("%d == %d? %b\n",myInteger1.getValue(),520,myInteger1.equals(520));
		System.out.printf("%d == %d? %b\n",myInteger1.getValue(),myInteger2.getValue(),myInteger1.equals(myInteger2));
	
		char[] value = {'5','2','0','1','3','1','4'};
		System.out.printf("%d\n",MyInteger.parseInt(value));
		System.out.printf("%d\n",MyInteger.parseInt("5201314"));
	
	}
}

class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		return (this.value % 2 == 0);
	}

	public boolean isOdd() {
		return (this.value % 2 != 0);
	}

	public boolean isPrime() {
		for (int i = 2; i <= Math.sqrt(this.value); i++) {
			if (this.value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger myInteger) {
		return (myInteger.getValue() % 2 == 0);
	}

	public static boolean isOdd(MyInteger myInteger) {
		return (myInteger.getValue() % 2 != 0);

	}

	public static boolean isPrime(MyInteger myInteger) {
		for (int i = 2; i <= Math.sqrt(myInteger.getValue()); i++) {
			if (myInteger.getValue() % i == 0)
				return false;
		}
		return true;
	}

	public boolean equals(int value) {
		return (this.value == value);
	}

	public boolean equals(MyInteger myInteger) {
		return (this.value == myInteger.getValue());
	}

	public static int parseInt(char[] value) {
		int num = 0;
		for (int i = 0; i < value.length; i++) {
			num = num * 10 + (value[i] - '0');
		}
		return num;
	}

	public static int parseInt(String value) {
		int num = 0;
		for (int i = 0; i < value.length(); i++) {
			num = num * 10 + (value.charAt(i) - '0');
		}
		return num;
	}

}
