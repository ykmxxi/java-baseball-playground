package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

	@Test
	void replace() {
		String actual = "abc".replace("b", "d");
		assertThat(actual).isEqualTo("adc");
	}

	@DisplayName("split() 메서드 활용 학습 테스트")
	@Test
	void split() {
		// given
		String oneAndTwo = "1,2";
		String one = "1";

		// when & then
		assertThat(oneAndTwo.split(",")).contains("1", "2");
		assertThat(one.split(",")).containsExactly("1");
	}

}
