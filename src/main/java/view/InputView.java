package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputView {

	private static final Scanner scanner = new Scanner(System.in);

	public String readNumbers() {
		String numbers = scanner.nextLine();
		if (isWrongNumbers(numbers)) {
			throw new IllegalArgumentException();
		}
		return numbers;
	}

	public String readRetryNumber() {
		String number = scanner.nextLine();
		if (isWrongRetryInput(number)) {
			throw new IllegalArgumentException();
		}
		return number;
	}

	private boolean isWrongRetryInput(String input) {
		if (rejectEmptyOrWhitespace(input)) {
			return true;
		}
		return !isCorrectRetryNumber(input);
	}

	public boolean isWrongNumbers(String numbers) {
		if (rejectEmptyOrWhitespace(numbers)) {
			return true;
		}
		if (rejectWrongLength(numbers)) {
			return true;
		}
		if (rejectDuplicatedNumbers(numbers)) {
			return true;
		}
		return rejectZero(numbers);
	}

	private boolean rejectEmptyOrWhitespace(String input) {
		return input.isBlank();
	}

	private boolean rejectWrongLength(String input) {
		return input.length() != 3;
	}

	private boolean rejectDuplicatedNumbers(String input) {
		int length = Arrays.stream(input.split(""))
						   .map(Integer::parseInt)
						   .collect(Collectors.toSet())
						   .size();

		return length != 3;
	}

	private boolean rejectZero(String input) {
		return IntStream.range(0, input.length())
						.anyMatch(i -> input.charAt(i) == '0');

	}

	private boolean isCorrectRetryNumber(String input) {
		return input.equals("1") || input.equals("2");
	}

}
