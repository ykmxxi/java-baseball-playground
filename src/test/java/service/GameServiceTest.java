package service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import domain.GameStatus;

class GameServiceTest {

	@Test
	void 게임_종료_여부() {
		// given
		GameService gameService = new GameService();
		GameStatus gameStatus = new GameStatus();
		for (int i = 0; i < 3; i++) {
			gameStatus.addStrike();
		}

		// when
		boolean result = gameService.isEndedGame(gameStatus);

		// then
		assertThat(result).isTrue();
	}

}
