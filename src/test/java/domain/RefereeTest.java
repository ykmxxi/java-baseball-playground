package domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RefereeTest {

	private static final Ball computerBall = new Ball(1, 0);
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

	@ParameterizedTest
	@CsvSource(value = {"1:1:1볼", "1:0:1스트라이크", "2:0:낫싱"}, delimiter = ':')
	void judgmentResultNothing(String number, String position, String expected) {
		// given
		Ball playerBall = new Ball(Integer.parseInt(number), Integer.parseInt(position));
		referee.compare(computerBall, playerBall);

		// when
		String result = referee.notifyJudgmentResult();

		// then
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void judgmentResultOneBallOneStrike() {
		// given
		Ball firstComputerBall = new Ball(1, 0);
		Ball secondComputerBall = new Ball(2, 1);

		Ball firstPlayerBall = new Ball(1, 0);
		Ball secondPlayerBall = new Ball(2, 2);

		referee.compare(firstComputerBall, firstPlayerBall);
		referee.compare(secondComputerBall, secondPlayerBall);

		// when
		String result = referee.notifyJudgmentResult();

		// then
		assertThat(result).isEqualTo("1볼 1스트라이크");
	}

}
