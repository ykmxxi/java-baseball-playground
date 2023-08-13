package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

	@DisplayName("substring() 메서드 활용 학습 테스트")
	@Test
	void substring() {
		// given
		String bracketNumber = "(1,2)";

		// when & then
		assertThat(bracketNumber.substring(1, 4)).isEqualTo("1,2");
	}

	@DisplayName("charAt() 메서드 활용 학습 테스트")
	@Test
	void charAt() {
		// given
		String abc = "abc";

		// when & then
		assertThat(abc.charAt(0)).isEqualTo('a');
		assertThat(abc.charAt(1)).isEqualTo('b');
		assertThat(abc.charAt(2)).isEqualTo('c');
		assertThatThrownBy(() -> abc.charAt(3))
			.isInstanceOf(StringIndexOutOfBoundsException.class)
			.hasMessageContaining("String index out of range: 3");
	}

}
