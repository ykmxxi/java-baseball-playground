package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Baseball {

	private final List<String> numbers;

	public Baseball(String input) {
		if (isWrongInput(input)) {
			throw new IllegalArgumentException("중복된 값이 존재합니다.");
		}
		this.numbers = addNumber(input);
	}

	public List<String> getNumbers() {
		return numbers;
	}

	private boolean isWrongInput(String input) {
		int size = Arrays.stream(input.split(""))
			.collect(Collectors.toSet())
			.size();

		return size != 3;
	}

	private List<String> addNumber(String input) {
		return Arrays.stream(input.split(""))
			.collect(Collectors.toList());
	}

}
