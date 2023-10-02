package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class ComputerTest {

	@Test
	void createRandomNumber() {
		// given
		Computer computer = new Computer();

		// when
		List<Integer> result = computer.createRandomNumber();

		// then
		assertThat(result.size()).isEqualTo(3);
		assertThat(result.stream()
						 .allMatch((number) -> number >= 1 && number <= 9)
		).isTrue();
	}

	@Test
	void mapToBall() {
		// given
		Computer computer = new Computer();

		// when
		List<Ball> result = computer.getNumbers();

		// then
		assertThat(result.size()).isEqualTo(3);
	}

}
