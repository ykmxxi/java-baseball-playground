package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RefereeTest {

	private Referee referee;

	@BeforeEach
	void init() {
		referee = new Referee();
	}

	@Test
	void compareOneStrike() {
		// given
		Ball computerBall = new Ball(1, 0);
		Ball playerBall = new Ball(1, 0);

		// when
		referee.compare(computerBall, playerBall);

		// then
		assertThat(referee.getStrikeCount()).isEqualTo(1);
		assertThat(referee.getBallCount()).isEqualTo(0);
	}

	@Test
	void compareOneBall() {
		// given
		Ball computerBall = new Ball(1, 0);
		Ball playerBall = new Ball(1, 1);

		// when
		referee.compare(computerBall, playerBall);

		// then
		assertThat(referee.getBallCount()).isEqualTo(1);
		assertThat(referee.getStrikeCount()).isEqualTo(0);
	}

}
