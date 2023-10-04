package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private final List<Ball> numbers;

	public Player(String input) {
		this.numbers = mapToBall(input);
	}

	public List<Ball> getNumbers() {
		return numbers;
	}

	private List<Ball> mapToBall(String input) {
		List<Ball> balls = new ArrayList<>();
		for (int index = 0; index < input.length(); index++) {
			balls.add(new Ball(Character.getNumericValue(input.charAt(index)), index));
		}
		return balls;
	}

}
