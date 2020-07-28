package chapter10_exercise;

import java.util.Scanner;

public class DisplayThePrimeFactorsQuestion5 {
	public static void main(String[] args) {
		int num, factor = 2;
		StackOfIntegers factorsStack = new StackOfIntegers();

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter an positive integer number:");
		num = inputScanner.nextInt();

		while (num > 1) {
			if (num % factor == 0) {
				num /= factor;
				factorsStack.push(factor);
			} else
				factor++;
		}

		while (!factorsStack.empty()) {
			System.out.printf("%d ", factorsStack.pop());
		}

		inputScanner.close();
	}
}

class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
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