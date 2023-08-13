package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {

	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	@DisplayName("size() 메서드 활용 학습 테스트: Set은 중복된 요소를 허용하지 않는다")
	void size() {
		assertThat(numbers.size()).isEqualTo(3);
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	@DisplayName("contains() 메서드, @ParameterizedTest 활용 학습 테스트: 중복된 코드 제거")
	void contains(int value) {
		assertThat(numbers.contains(value)).isTrue();
	}

	@ParameterizedTest
	@CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
	@DisplayName("@CsvSource 활용 학습 테스트: 결과 값이 다른 경우에 대한 테스트")
	void contains(String number, String expected) {
		int input = Integer.parseInt(number);
		assertEquals(numbers.contains(input), Boolean.valueOf(expected));
	}

}
