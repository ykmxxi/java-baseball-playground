package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

	private static final Scanner scanner = new Scanner(System.in);
	public static final String PLAYER_NUMBER_FORM = "[1-9]{3}";
	private static final String REPLAY_NUMBER_FORM = "[1|2]";

	public String readPlayerNumber() {
		String input = scanner.nextLine();
		validatePlayerNumber(input);
		return input;
	}

	public void validatePlayerNumber(String input) {
		rejectEmptyOrWhitespaces(input);
		rejectUnCorrectForm(input);
		rejectDuplicatedNumber(input);
	}

	public void validateReplayNumber(String input) {
		rejectEmptyOrWhitespaces(input);
		rejectDuplicatedNumber(input);
		rejectUnCorrectForm2(input);
	}

	private void rejectEmptyOrWhitespaces(String input) {
		if (input.isBlank()) {
			throw new IllegalArgumentException();
		}
	}

	private void rejectUnCorrectForm(String input) {
		if (!input.matches(PLAYER_NUMBER_FORM)) {
			throw new IllegalArgumentException();
		}
	}

	private void rejectDuplicatedNumber(String input) {
		int size = Arrays.stream(input.split(""))
						 .collect(Collectors.toSet())
						 .size();

		if (size != 3) {
			throw new IllegalArgumentException();
		}
	}

	private void rejectUnCorrectForm2(String input) {
		if (!input.matches(REPLAY_NUMBER_FORM)) {
			throw new IllegalArgumentException();
		}
	}

}
