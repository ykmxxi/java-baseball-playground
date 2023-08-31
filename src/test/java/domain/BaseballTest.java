package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BaseballTest {

	@Test
	@DisplayName("숫자 야구 번호 생성: 성공 테스트")
	void baseballSuccessTest() {
		// given
		String input = "123";

		// when
		Baseball baseball = new Baseball(input);

		// then
		assertThat(baseball.getNumbers()).containsExactly("1", "2", "3");
	}

}
