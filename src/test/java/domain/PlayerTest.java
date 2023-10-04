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

	@Test
	void changeNumbers() {
		// given
		Player player = new Player("123");
		String newInput = "456";

		// when
		player.changeNumbers("456");

		// then
		Ball firstBall = player.getNumbers().get(0);
		Ball secondBall = player.getNumbers().get(1);
		Ball lastBall = player.getNumbers().get(2);
		assertThat(firstBall.isSameNumber(4)).isTrue();
		assertThat(secondBall.isSameNumber(5)).isTrue();
		assertThat(lastBall.isSameNumber(6)).isTrue();
	}

}
