package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

	private static final Scanner scanner = new Scanner(System.in);

	public String readNumbers() {
		String numbers = scanner.nextLine();
		if (isWrongNumbers(numbers)) {
			throw new IllegalArgumentException();
		}
		return numbers;
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
		return false;
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

}
