package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

	private static final Scanner scanner = new Scanner(System.in);
	public static final String PLAYER_NUMBER_FORM = "[1-9]{3}";

	public String readPlayerNumber() {
		return scanner.nextLine();
	}

	public void validatePlayerNumber(String s) {
		rejectEmptyOrWhitespaces(s);
		rejectUnCorrectForm(s);
		rejectDuplicatedNumber(s);
	}

	private void rejectEmptyOrWhitespaces(String s) {
		if (s.isBlank()) {
			throw new IllegalArgumentException();
		}
	}

	private void rejectUnCorrectForm(String s) {
		if (!s.matches(PLAYER_NUMBER_FORM)) {
			throw new IllegalArgumentException();
		}
	}

	private void rejectDuplicatedNumber(String s) {
		int size = Arrays.stream(s.split(""))
						 .collect(Collectors.toSet())
						 .size();

		if (size != 3) {
			throw new IllegalArgumentException();
		}
	}

}
