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

}
