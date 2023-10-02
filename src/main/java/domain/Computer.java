package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Computer {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 9;
	private static final int SIZE = 3;

	private final List<Ball> numbers;

	public Computer() {
		this.numbers = new ArrayList<>();
	}

	public List<Integer> createRandomNumber() {
		return new Random().ints(MIN_VALUE, MAX_VALUE + 1)
						   .boxed()
						   .distinct()
						   .limit(SIZE)
						   .collect(Collectors.toList());
	}

}
