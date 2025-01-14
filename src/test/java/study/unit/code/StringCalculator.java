package study.unit.code;

public class StringCalculator {

	public String[] splitInput(String input) {
		return input.split(" ");
	}

	public int calculate(String[] values) {
		int result = Integer.parseInt(values[0]);
		for (int idx = 1; idx < values.length; idx += 2) {
			String operator = values[idx];
			int operand = Integer.parseInt(values[idx + 1]);
			result = operate(result, operator, operand);
		}

		return result;
	}

	private int operate(int result, String operator, int operand) {
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
		return result;
	}

}
