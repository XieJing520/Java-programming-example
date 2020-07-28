package chapter12_exercise;

public class NumberFormatExceptionQuestion1 {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(1);
		}

		// The result of the operation
		int result = 0;

		try {
			checkOperand(args[0], args[2]);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			return;
		}

		// Determine the operator
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);

		}
		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

	public static void checkOperand(String operand1, String operand2) {
		for (int i = 0; i < operand1.length(); i++) {
			if (operand1.charAt(i) < '0' || '9' < operand1.charAt(i)) {
				throw new NumberFormatException("Wrong Input: " + operand1);
			}
		}
		for (int i = 0; i < operand2.length(); i++) {
			if (operand2.charAt(i) < '0' || '9' < operand2.charAt(i)) {
				throw new NumberFormatException("Wrong Input: " + operand2);
			}
		}
	}

}