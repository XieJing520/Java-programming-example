package chapter10_exercise;

public class DisplayThePrimeNumbersQuestion6 {
	public static void main(String[] args) {
		StackOfIntegers1 primeNumberStack = new StackOfIntegers1();
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				primeNumberStack.push(i);
			}
		}

		while (!primeNumberStack.empty())
			System.out.printf("%d ", primeNumberStack.pop());
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
}

class StackOfIntegers1 {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers1() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers1(int capacity) {
		elements = new int[capacity];
	}

	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}