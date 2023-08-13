package study.unit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import study.unit.code.StringCalculator;

public class StringCalculatorTest {

	private final StringCalculator stringCalculator = new StringCalculator();

	@Test
	@DisplayName("입력 값 분리 기능 단위 테스트")
	void splitInput() {
		// given
		String input = "2 + 3 * 4 / 2";
		String[] expected = {"2", "+", "3", "*", "4", "/", "2"};

		// when & then
		assertThat(stringCalculator.splitInput(input)).containsExactly(expected);
	}

	@ParameterizedTest
	@CsvSource(value = {"2 + 3 * 4 / 2:10", "5 / 5 + 1 * 2:4"}, delimiter = ':')
	@DisplayName("사칙연산 계산 기능 단위 테스트")
	void calculate(String input, String expected) {
		assertThat(stringCalculator.calculate(stringCalculator.splitInput(input)))
			.isEqualTo(Integer.parseInt(expected));
	}

}
