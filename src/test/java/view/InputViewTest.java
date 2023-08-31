package view;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
