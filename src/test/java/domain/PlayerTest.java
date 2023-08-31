package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	@DisplayName("플레이어 생성: 숫자를 2번 입력한 플레이어")
	void playerSuccessTest() {
		// given
		Player player = new Player();
		String firstInput = "123";
		String secondInput = "321";

		// when
		player.addBaseball(firstInput);
		player.addBaseball(secondInput);

		// then
		assertThat(player.getBaseballs().size()).isEqualTo(2);
	}

}
