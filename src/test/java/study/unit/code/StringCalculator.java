package study.unit.code;

import java.util.Scanner;

public class StringCalculator {

	private static final Scanner scanner = new Scanner(System.in);

	public String[] splitInput(String input) {
		return input.split(" ");
	}

	public int calculate(String[] values) {
		int result = Integer.parseInt(values[0]);
		for (int idx = 1; idx < values.length; idx += 2) {
			String operator = values[idx];
			int operand = Integer.parseInt(values[idx + 1]);
			if (operator.equals("+")) {
				result += operand;
			}
			if (operator.equals("-")) {
				result -= operand;
			}
			if (operator.equals("*")) {
				result *= operand;
			}
			if (operator.equals("/")) {
				result /= operand;
			}
		}

		return result;
	}

}
