package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BallTest {

	@Test
	void isSameOrNotNumber() {
		// given
		Ball ball = new Ball(1, 1);
		int sameNumber = 1;
		int notSameNumber = 2;

		// when
		boolean sameResult = ball.isSameNumber(sameNumber);
		boolean notSameResult = ball.isSameNumber(notSameNumber);

		// then
		assertThat(sameResult).isTrue();
		assertThat(notSameResult).isFalse();
	}

	@Test
	void isSameOrNotPosition() {
		// given
		Ball ball = new Ball(1, 1);
		int samePosition = 1;
		int notSamePosition = 2;

		// when
		boolean sameResult = ball.isSamePosition(samePosition);
		boolean notSameResult = ball.isSamePosition(notSamePosition);

		// then
		assertThat(sameResult).isTrue();
		assertThat(notSameResult).isFalse();
	}

}
