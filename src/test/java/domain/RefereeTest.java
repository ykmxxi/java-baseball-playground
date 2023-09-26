package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RefereeTest {

	@BeforeEach

	@Test
	void oneStrike() {
		// given
		Referee referee = new Referee();
		Baseball computer = new Baseball("123");
		Baseball player = new Baseball("145");

		// when
		GameStatus result = referee.judge(computer, player);

		// then
		assertThat(result.getStrike()).isEqualTo(1);
		assertThat(result.getBall()).isEqualTo(0);
	}

	@Test
	void oneBall() {
		// given
		Referee referee = new Referee();
		Baseball computer = new Baseball("123");
		Baseball player = new Baseball("451");

		// when
		GameStatus result = referee.judge(computer, player);

		// then
		assertThat(result.getStrike()).isEqualTo(0);
		assertThat(result.getBall()).isEqualTo(1);
	}

	@Test
	void oneBallOneStrike() {
		// given
		Referee referee = new Referee();
		Baseball computer = new Baseball("123");
		Baseball player = new Baseball("152");

		// when
		GameStatus result = referee.judge(computer, player);

		// then
		assertThat(result.getStrike()).isEqualTo(1);
		assertThat(result.getBall()).isEqualTo(1);
	}

	@Test
	void nothing() {
		// given
		Referee referee = new Referee();
		Baseball computer = new Baseball("123");
		Baseball player = new Baseball("456");

		// when
		GameStatus result = referee.judge(computer, player);

		// then
		assertThat(result.getStrike()).isEqualTo(0);
		assertThat(result.getBall()).isEqualTo(0);
	}

}
