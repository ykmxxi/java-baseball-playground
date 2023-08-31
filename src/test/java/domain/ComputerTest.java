package domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

	@Test
	@DisplayName("컴퓨터 생성: 성공 테스트")
	void computerSuccessTest() {
		// given
		Computer computer = new Computer();

		// when
		List<String> numbers = computer.getBaseball().getNumbers();

		// then
		assertThat(numbers.size()).isEqualTo(3);
	}

}
