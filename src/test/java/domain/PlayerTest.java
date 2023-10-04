package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void mapToBall() {
		// given
		String input = "123";

		// when
		Player player = new Player("123");

		// then
		assertThat(player.getNumbers().size()).isEqualTo(3);
	}

}
