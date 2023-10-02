package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Computer {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 9;
	private static final int SIZE = 3;

	private final List<Ball> numbers;

	public Computer() {
		this.numbers = mapToBall(createRandomNumber());
	}

	public List<Ball> getNumbers() {
		return Collections.unmodifiableList(numbers);
	}

	public List<Integer> createRandomNumber() {
		return new Random().ints(MIN_VALUE, MAX_VALUE + 1)
						   .boxed()
						   .distinct()
						   .limit(SIZE)
						   .collect(Collectors.toList());
	}

	private List<Ball> mapToBall(List<Integer> randomNumbers) {
		List<Ball> balls = new ArrayList<>();
		for (int index = 0; index < randomNumbers.size(); index++) {
			balls.add(new Ball(randomNumbers.get(index), index));
		}
		return balls;
	}

}
