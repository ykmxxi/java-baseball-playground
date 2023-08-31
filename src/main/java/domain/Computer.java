package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Computer {

	private final Baseball baseball;

	public Computer() {
		this.baseball = new Baseball(generateRandomNumbers());
	}

	public Baseball getBaseball() {
		return baseball;
	}

	private String generateRandomNumbers() {
		Set<Integer> numbers = new HashSet<>();

		while (numbers.size() < 3) {
			numbers.add((int)(Math.random() * 10));
		}

		return numbers.stream()
			.map(String::valueOf)
			.collect(Collectors.joining());
	}

}
