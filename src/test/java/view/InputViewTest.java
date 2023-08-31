package view;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputViewTest {

	@Test
	@DisplayName("플레이어 숫자 입력: 성공 테스트")
	void readNumbersSuccessTest() {
		// given
		InputView inputView = new InputView();
		String input = "123";

		// when & then
		assertThat(inputView.isWrongNumbers(input)).isFalse();
	}

	@ParameterizedTest()
	@ValueSource(strings = {"", "  ", "111", "1234", "12"})
	@DisplayName("플레이어 숫자 입력: 실패 테스트")
	void readNumbersFailTest(String input) {
		// given
		InputView inputView = new InputView();

		// when & then
		assertThat(inputView.isWrongNumbers(input)).isTrue();
	}

}
