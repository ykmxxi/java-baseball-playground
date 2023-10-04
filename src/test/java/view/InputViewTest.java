package view;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputViewTest {

	private InputView inputView;

	@BeforeEach
	void init() {
		inputView = new InputView();
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "   ", "109", "909", "1234", "one"})
	void validatePlayerNumber(String input) {
		// when & then
		assertThatThrownBy(() -> inputView.validatePlayerNumber(input))
			.isInstanceOf(IllegalArgumentException.class);
	}

}
