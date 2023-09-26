package service;

import domain.GameStatus;

public class GameService {

	public boolean isEndedGame(GameStatus gameStatus) {
		return gameStatus.isEnd();
	}

}
